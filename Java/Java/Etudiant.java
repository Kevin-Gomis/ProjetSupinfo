package com.supinfo.javapoo;

import com.supinfo.javapoo.Personne;

public class Etudiant extends Personne {
    private String matricule;
    

    public Etudiant(String prenom,String nom,String tel,String mail,int age,String matricule) {
        super(prenom,nom,tel,mail,age)
        this.matricule=matricule;
    }

   
    public void afficher(){
        super.affiche();
        System.out.println("matricule : "+this.matricule);
    }
}