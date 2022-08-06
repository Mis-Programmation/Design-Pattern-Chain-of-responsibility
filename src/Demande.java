public class Demande {

    private DemandeCategories categories;

    private String tempsEcouler;

    public Demande(DemandeCategories categories, String tempsEcouler) {
        this.categories = categories;
        this.tempsEcouler = tempsEcouler;
    }

    public DemandeCategories getCategories() {
        return categories;
    }

    public String getTempsEcouler() {
        return tempsEcouler;
    }
}

