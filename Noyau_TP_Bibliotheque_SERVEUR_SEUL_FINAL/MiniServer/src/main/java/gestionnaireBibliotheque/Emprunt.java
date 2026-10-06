package gestionnaireBibliotheque;
import java.util.Random;

public class Emprunt {
    int id;
    String livre;
    int idUtilisateur;
    int jourEmprunt;
    int jourRetourPrevu;
    int jourRetour;
    private StatutEmprunt statut;

    enum StatutEmprunt {
        EN_COURS,
        EN_RETARD,
        RETOURNE
    }

    ;
    private static int compteurID = 0;

    private static final Random rand = new Random();

    public Emprunt() {
        this.id = prochainID();

        this.livre = "";
        this.idUtilisateur = 0;
        this.jourEmprunt = 0;
        this.jourRetourPrevu = jourEmprunt += 40;
    }

    public static int prochainID() {
        compteurID = rand.nextInt(999999);
        return compteurID;
    }

    public boolean estEnRetard(int jourActuel) {
        if (jourActuel > jourRetourPrevu) {
            return true;
        } else {
            return false;
        }
    }

    public int calculerJoursRetard(int jourActuel) {
        if (jourActuel == jourRetourPrevu) {
            return 0;
        } else if (jourActuel > jourRetourPrevu) {
            return jourActuel - jourRetourPrevu;
        }
        return jourActuel;
    }
    public void retourner(int jourRetour) {
        this.jourRetour = jourRetour;

        if (jourRetour <= this.jourRetourPrevu) {
            this.statut = StatutEmprunt.RETOURNE;
        } else {
            this.statut = StatutEmprunt.EN_RETARD;
        }
    }

    @Override
    public String toString() {
        return "Emprunt {" +
                "ID=" + id +
                ", Livre='" + livre + '\'' +
                ", ID Utilisateur=" + idUtilisateur +
                ", Jour Emprunt=" + jourEmprunt +
                ", Retour Prévu=" + jourRetourPrevu +
                ", Jour Retour=" + (statut == StatutEmprunt.RETOURNE ? jourRetour : "Non retourné") +
                ", Statut=" + statut +
                '}';
    }

}
