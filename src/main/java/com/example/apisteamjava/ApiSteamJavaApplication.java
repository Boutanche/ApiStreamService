package com.example.apisteamjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class ApiSteamJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiSteamJavaApplication.class, args);
        System.out.println("Hello World");
        Stream<Personne> dump = getStreamPersonne();
        dump.forEach(System.out::println);
    }

    public static Stream<Personne> getStreamPersonne() {
    // Le Jeu de données
        ArrayList<Personne> listPersonnes = new ArrayList<>();
        Personne bob = new Personne("Bob", 55, Genre.MASCULIN);
        List<Personne> enfants = Arrays.asList(
                new Personne("Enf1", 2, Genre.MASCULIN),
                new Personne("Enf2", 8, Genre.FEMININ),
                new Personne("Enf3", 10, Genre.MASCULIN)
        );
        bob.setEnfants(enfants);
        listPersonnes.add(bob);

        enfants = Arrays.asList(
                new Personne("Enf21", 6, Genre.MASCULIN),
                new Personne("Enf22", 22, Genre.FEMININ),
                new Personne("Enf23", 11, Genre.MASCULIN)
        );
        Personne ted = new Personne("Ted", 32, Genre.MASCULIN);
        ted.setEnfants(enfants);

        listPersonnes.add(ted);
        listPersonnes.add(new Personne("Liz", 15, Genre.FEMININ));
        listPersonnes.add(new Personne("Alice", 46, Genre.FEMININ));
        listPersonnes.add(new Personne("Marc", 25, Genre.MASCULIN));
        listPersonnes.add(new Personne("Liz", 15, Genre.FEMININ));
        listPersonnes.add(new Personne("Alice", 46, Genre.FEMININ));
        listPersonnes.add(new Personne("Albert", 22, Genre.FEMININ));

        return listPersonnes.stream();
    }
}
