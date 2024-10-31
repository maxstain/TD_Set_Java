package models;

public class Enseignant {
    private int id;
    private String nom, prenom;

    public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Enseignant() {
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Enseignant)) return false;
        return this.id == ((Enseignant) obj).id;
    }

    @Override
    public String toString() {
        return "Enseignant: " +
                "id: " + id +
                ", nom: " + nom +
                ", prenom: " + prenom + "\n";
    }
}
