package com.supinfo.javapoo;

public class Seance {
    private String date;
    private String heure_debut;
    private String heure_fin;
    private String solde_heure;


    public Groupe() {
    }

    public Groupe(String date,String heure_debut,String heure_fin,String solde_heure) {
        this.date=date;
        this.heure_debut=heure_debut;
        this.heure_fin=heure_fin;
        this.solde_heure=solde_heure;
    }


    public static void afficher(){
        System.out.println("Bonjour ");
    }


    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure_debut() {
        return this.heure_debut;
    }

    public void setHeure_debut(String heure_debut) {
        this.heure_debut = heure_debut;
    }

    public String getHeure_fin() {
        return this.heure_fin;
    }

    public void setHeure_fin(String heure_fin) {
        this.heure_fin = heure_fin;
    }

    public String getSolde_heure() {
        return this.solde_heure;
    }

    public void setSolde_heure(String solde_heure) {
        this.solde_heure = solde_heure;
    }

    

    @Override
    public String toString() {
        return "{" +
            " date='" + getDate() + "'" +
            ", heure_debut='" + getHeure_debut() + "'" +
            ", heure_fin='" + getHeure_fin() + "'" +
            ", solde_heure='" + getSolde_heure() + "'" +
            "}";
    }
}