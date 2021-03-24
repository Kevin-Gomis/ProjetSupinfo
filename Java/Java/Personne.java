package com.supinfo.javapoo;

public class Personne {
    private String nom;
    private String prenom;
    private String tel;
    private String mail;
    private int age;

    public Personne() {
    }

    public Personne(String prenom,String nom,String tel,String mail,String age) {
        this.nom=nom;
        this.prenom=prenom;
        this.tel=tel;
        this.mail=mail;
        this.age=age;
    }

    public Personne(String prenom,String nom){
    this.prenom=prenom;
    this.nom=nom;
    }


    public static void afficher(){
        System.out.println("Bonjour ")
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", prenom='" + getPrenom() + "'" +
            ", tel='" + getTel() + "'" +
            ", mail='" + getMail() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }

} 
