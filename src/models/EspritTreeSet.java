package models;

import interfaces.GestionEnseignant;

import java.util.TreeSet;

public class EspritTreeSet implements GestionEnseignant {

    private final TreeSet<Enseignant> enseignants = new TreeSet<>();

    @Override
    public void ajouterEnseignant(Enseignant e) {
        enseignants.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return enseignants.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        return enseignants.stream().anyMatch(e -> e.getId() == id);
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        enseignants.remove(e);
    }

    @Override
    public void displayEnseignants() {
        enseignants.forEach(System.out::println);
    }
}
