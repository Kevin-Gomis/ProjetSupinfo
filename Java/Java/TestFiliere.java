package com.supinfo.javapoo;

public class TestFiliere{

    public static void  main(String[] args) {
         Filiere  f = new Filiere();
         
         Filiere f1 = new Filiere();

         f1.setNom_filiere(" Programation Developpement ");
         f1.setDescription_filiere(" La programmation représente donc ici la rédaction du code source d'un logiciel. On utilise plutôt le terme développement pour dénoter l'ensemble des activités liées à la création d'un logiciel et des programmes qui le composent. ");
                  
 
         System.out.println(f);
         System.out.println(f1);
         
    }
}