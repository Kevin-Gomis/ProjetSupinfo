package com.supinfo.javapoo;

public class Filiere {
    private String nom_filiere;
    private String description_filiere;


    public Groupe() {
    }

    public Groupe(String nom_filiere,String description_filiere) {
        this.nom_filiere=nom_filiere;
        this.description_filiere=description_filiere;
    }


    public static void afficher(){
        System.out.println("Bonjour ");
    }


    public String getNom_filiere() {
        return this.nom_filiere;
    }

    public void setNom_filiere(String nom_filiere) {
        this.nom_filiere = nom_filiere;
    }

    public String getDescription_filiere() {
        return this.description_filiere;
    }

    public void setDescription_filiere(String description_filiere) {
        this.description_filiere = description_filiere;
    }


    @Override
    public String toString() {
        return "{" +
            " nom_filiere='" + getNom_filiere() + "'" +
            ", description_filiere='" + getDescription_filiere() + "'" +
            "}";
    }
}    