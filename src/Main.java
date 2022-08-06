public class Main {

    public static void main(String[] args) {


        TransferDeDemandeChain transferDeDemandeChain = new TransferDeDemandeChain(
                new Directeur(),
                new TechnicienMateriel(),
                new TechnicienLogiciel()
        );

        transferDeDemandeChain.add().transfer(new Demande(DemandeCategories.LOGICIEL,12));
        transferDeDemandeChain.add().transfer(new Demande(DemandeCategories.MATERIEL,48));
        transferDeDemandeChain.add().transfer(new Demande(DemandeCategories.LOGICIEL,34));
        transferDeDemandeChain.add().transfer(new Demande(DemandeCategories.LOGICIEL,18));
        transferDeDemandeChain.add().transfer(new Demande(DemandeCategories.LOGICIEL,24));
    }

}
