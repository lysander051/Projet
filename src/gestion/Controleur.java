package gestion;

import java.time.LocalDate;

public class Controleur {
    private Gala gala;
    private Ihm ihm;
    private int idIndividu;


    public Controleur(Gala gala, Ihm ihm, LocalDate date) {
        this.gala = new Gala(date);
        this.ihm = new Ihm();

    }

    // affiche Etat de gala et son contenu

    public boolean identification() {
        int numero=0;
        Boolean present=false;
        while(!present) {
            // demande si etudiant ou personnel et retourne 1 pour etudiant et 0 pour personnel
            int type = ihm.demanderIdentite();
            // demande numero etudiant
            numero = ihm.demandeIdentification();
            // verifie si dans la listeEtudiant si identite=1 et listePersonnel si identite=0 le numero est dedans
            if(type==2 || numero==2)
            {
                return false;
            }
            present=gala.estPresent(type, numero);


        }

        idIndividu=numero;

        return present;
    }


    public void inscription(int type,int id){
            gala.faireInscription(id);
    }




    public finall() {
        boolean sIdentifier=identification();
        if(!sIdentifier) {
            // PROGRAMME S'ARRETE
        }
        else {

            ihm.inscriptionOuQuitter();

        }

    }




}
