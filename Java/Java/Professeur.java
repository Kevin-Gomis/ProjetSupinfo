package com.supinfo.javapoo;

import com.supinfo.javapoo.Personne;

public class Professeur extends Personne {
    private String volumehoraire;
    

    public Professeur(String prenom,String nom,String tel,String mail,int age,String volumehoraire) {
        super(prenom,nom,tel,mail,age)
        this.volumehoraire=volumehoraire;
    }

   
    public void afficher(){
        super.affiche();
        System.out.println("Volume Horaire : "+this.volumehoraire);
    }
}