package com.example.apisteamjava;

import java.util.ArrayList;
import java.util.List;

/**
 * Personne
 *
 * @author BBE le 04/05/2023
 */
public class Personne {

    /**
     * Nom de la personne
     */
    private String nom;

    /**
     * Age de la personne
     */
    private Integer age;

    /**
     * Genre de la personne
     */
    private Genre genre;

    /**
     * Enfants de la personne
     */
    private List<Personne> enfants = new ArrayList<>();

    /**
     * Constructeur
     * @param nom Nom de la personne
     * @param age Age de la personne
     * @param genre Genre de la personne
     */
    public Personne(String nom, Integer age, Genre genre) {
        this.nom = nom;
        this.age = age;
        this.genre = genre;
    }

    /**
     * getNom : retourne le nom de la personne
     * @return le nom de la personne
     */
    public String getNom() {
        return nom;
    }

    /**
     * setNom : modifie le nom de la personne
     * @param nom le nom de la personne
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * getAge : retourne l'age de la personne
     * @return l'age de la personne
     */
    public Integer getAge() {
        return age;
    }

    /**
     * setAge : modifie l'age de la personne
     * @param age l'age de la personne
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * getGenre : retourne le genre de la personne
     * @return le genre de la personne
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * setGenre : modifie le genre de la personne
     * @param genre le genre de la personne
     */
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    /**
     * getEnfants : retourne les enfants de la personne
     * @return liste des enfants
     */
    public List<Personne> getEnfants() {
        return enfants;
    }

    /**
     * setEnfants : modifie les enfants de la personne
     * @param enfants liste des enfants
     */
    public void setEnfants(List<Personne> enfants) {
        this.enfants = enfants;
    }

    /**
     * toString : retourne une chaine de caractères représentant la personne
     * @return String
     */
    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", age=" + age + ", genre=" + genre + ", enfants=" + enfants + '}';
    }
}
