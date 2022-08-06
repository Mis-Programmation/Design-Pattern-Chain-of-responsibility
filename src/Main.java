public class Main {

    public static void main(String[] args) {


        TransferDeDemandeChain transferDeDemandeChain = new TransferDeDemandeChain(
                new Directeur(),
                new TechnicienMateriel(),
                new TechnicienLogiciel()
        );

        transferDeDemandeChain.add().transfer(new Demande(DemandeCategories.LOGICIEL,"12h"));
        transferDeDemandeChain.add().transfer(new Demande(DemandeCategories.MATERIEL,"48h"));
        transferDeDemandeChain.add().transfer(new Demande(DemandeCategories.LOGICIEL,"34h"));
        transferDeDemandeChain.add().transfer(new Demande(DemandeCategories.LOGICIEL,"18h"));
        transferDeDemandeChain.add().transfer(new Demande(DemandeCategories.LOGICIEL,"24h"));
    }

}
