package gestion;

import java.util.Scanner;

public class Ihm {
    Scanner identite = new Scanner(System.in);

    public int demandeIdentite() {
        int id = -1;
        while (identite.hasNext()) {
            System.out.println("inscrivez 0 si vous êtes membre du personnel, 1 si vous êtes étudiants 2 pour quitter");
            id = identite.nextInt();
            if (id == 0) {
                return 0;
            } else if (id == 1) {
                return 1;
            }
            else if (id == 2){
                break;
            }
        }
        return id;
    }

    public int demanderNumero(){
        int numero = 0;
        while (identite.hasNext()){
            System.out.println("Entrez votre id personnel ou votre numéro étudiant: ");
            numero = identite.nextInt();
            if ( Integer.toString(numero).length() == 7 || Integer.toString(numero).length() == 4){
                return numero;
            }
            else {
                System.out.println("Veuillez entrer un identifiant valide");
            }
        }
        return numero;
    }



}
