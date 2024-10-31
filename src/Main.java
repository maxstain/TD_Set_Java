import models.Enseignant;
import models.EspritHashSet;
import models.EspritTreeSet;

public class Main {
    public static void main(String[] args) {
        EspritHashSet espritHashSet = new EspritHashSet();
        EspritTreeSet espritTreeSet = new EspritTreeSet();

        espritHashSet.ajouterEnseignant(new Enseignant(0, "Ben Salah", "Ahmed"));
        espritHashSet.ajouterEnseignant(new Enseignant(1, "Ben Fadhel", "Sana"));
        espritHashSet.ajouterEnseignant(new Enseignant(2, "Zouari", "Anis"));

        espritTreeSet.ajouterEnseignant(new Enseignant(0, "Ben Salah", "Ahmed"));
        espritTreeSet.ajouterEnseignant(new Enseignant(1, "Ben Fadhel", "Sana"));
        espritTreeSet.ajouterEnseignant(new Enseignant(2, "Zouari", "Anis"));

        System.out.println("HashSet:");
        espritHashSet.displayEnseignants();

        System.out.println("TreeSet:");
        espritTreeSet.displayEnseignants();
    }
}