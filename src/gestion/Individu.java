package gestion;

import java.io.Serializable;
import java.util.Objects;

public  abstract class Individu implements Comparable<Individu>, Serializable {
    private String nom;
    private String prenom;
    private String numTel;
    private String eMail;
    private int identifiant;
    private Reservation reservation;


    public Individu(int identifiant,String nom, String prenom, String numTel, String eMail) {
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
        this.eMail = eMail;
        this.identifiant = identifiant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Individu individu = (Individu) o;
        return identifiant == individu.identifiant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifiant);
    }

    @Override
    public int compareTo(Individu o) {

        return this.identifiant-o.identifiant;
    }

    public abstract int getType();

    public int getId(){ return identifiant; }

    public int getIdentifiant() {
        return identifiant;
    }

    @Override
    public String toString() {
        return  nom+" "+reservation;
    }

    public int getNbReservation(){
        return reservation.getNbPlace();
    }

    public abstract Type typeIndividu();

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public int getNumTableReservation() {
        return getReservation().getNumTable();
    }
}
