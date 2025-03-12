package com.spring.hello.model;

public class Livre {
    //ATTRIBUTS
    private String titre;
    private String description;
    private String datePublication;

    //Deux constructs
    public Livre(){}
    public Livre(String titre, String description, String datePublication) {
        this.titre = titre;
        this.description = description;
        this.datePublication = datePublication;
    }

    //GETTER ET SETTER
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }
    @Override
    public String toString(){
        return this.titre  + this.description + this.datePublication ;
    }




}
