package com.supinfo.javapoo;

public class TestGroupe{

    public static void  main(String[] args) {
         Groupe  g = new Groupe();
         
         Groupe g1 = new Groupe();

         g1.setNom_groupe(" PR310 ");
         g1.setDate_creation(" 2021 ");
         g1.setModule_groupe(" Java, Analyse de donnée, BI, Reseau, C etc ...");
 
         System.out.println(g);
         System.out.println(g1);
         
    }
}