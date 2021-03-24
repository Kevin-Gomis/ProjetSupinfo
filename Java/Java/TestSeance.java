package com.supinfo.javapoo;

public class TestSeance{

    public static void  main(String[] args) {
         Seance  s = new Seance();
         
         Seance s1 = new Seance();

         s1.setDate(" Evaluation de Java ");
         s1.setHeure_debut(" 16h ");
         s1.setHeure_fin(" 17h ")
         s1.setSolde_heure(" Le total d'heure est : 3H")
         
 
         System.out.println(s);
         System.out.println(s1);
         
    }
}