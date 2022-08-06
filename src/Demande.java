public class Demande {

    private DemandeCategories categories;

    private int tempsEcouler;

    public Demande(DemandeCategories categories, int tempsEcouler) {
        this.categories = categories;
        setTempsEcouler(tempsEcouler);
    }

    public DemandeCategories getCategories() {
        return categories;
    }

    private void setTempsEcouler(int tempsEcouler) {
        if (tempsEcouler < 0){
            throw new ArithmeticException("Le temps ecouler doit etre superieur a 0");
        }
        this.tempsEcouler = tempsEcouler;
    }

    public int getTempsEcouler() {
        return tempsEcouler;
    }
}

