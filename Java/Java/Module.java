package com.supinfo.javapoo;

public class Module {
    private String nom;
    private String volume_horaire;
    private int coef;
    private String description;

    public Module() {
    }

    public Module(String nom,String volume_horaire,int coef,String description) {
        this.nom=nom;
        this.volume_horaire=volume_horaire;
        this.coef=coef;
        this.description=description;
    }


    public static void afficher(){
        System.out.println("Bonjour ");
    }


    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVolume_horaire() {
        return this.volume_horaire;
    }

    public void setVolume_horaire(String volume_horaire) {
        this.volume_horaire = volume_horaire;
    }

    public int getCoef() {
        return this.coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", volume_horaire='" + getVolume_horaire() + "'" +
            ", coef='" + getCoef() + "'" +
            ", description='" + getDescription() + "'" +
            "}";
    }

    

} 
