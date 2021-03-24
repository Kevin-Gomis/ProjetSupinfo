package com.supinfo.javapoo;

public class TestPersonne{

    public static void  main(String[] args) {
         Personne p = new Personne();
         
         Personne p1 = new Personne();

         p1.setNom(" Gomis ");
         p1.setPrenom(" Kevin ");
         p1.setAge( 24 );
         p1.setTel(" +221778766554 ");
         p1.setMail(" BG@gmail.com ");

         Personne p2 = new Personne();

         p2.setNom(" Gomis ");
         p2.setPrenom(" Kevin ");


 
         System.out.println(p);
         System.out.println(p1);
         System.out.println(p2);
    }
}