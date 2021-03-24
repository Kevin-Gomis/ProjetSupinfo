package com.supinfo.javapoo;

public class TestModule{

    public static void  main(String[] args) {
         Module  m = new Module();
         
         Module m1 = new Module();

         m1.setNom(" Java ");
         m1.setVolume_horaire(" 20 heures ");
         m1.setCoef( 2 );
         m1.setDescription(" Java est un langage de programmation et une plate-forme informatique, Beaucoup d'applications et de sites Web ne fonctionnent pas si Java n'est pas installé et leur nombre ne cesse de croître chaque jour. ");

 
         System.out.println(m);
         System.out.println(m1);
         
    }
}