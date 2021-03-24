package com.supinfo.javapoo;

public class TestFicheNote{

    public static void  main(String[] args) {
         FicheNote  fn = new FicheNote();
         
         FicheNote fn1 = new FicheNote();

         fn1.setNom_fiche_note(" Evaluation Java PR310 ");
         fn1.setDate(" 2021 ");
         
 
         System.out.println(fn);
         System.out.println(fn1);
         
    }
}