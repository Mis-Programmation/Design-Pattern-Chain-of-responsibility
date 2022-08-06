public class Directeur extends AbstracTransfertDeDemandeChain {

    @Override
    public void transfer(Demande demande) {

        if (demande.getTempsEcouler() < 48){
            if (transfertDeDemandeChain != null){
                transfertDeDemandeChain.transfer(demande);
            }
            return;
        }

        System.out.println("---------------- Directeur -------------------");

        System.out.println(demande.getCategories());
        System.out.println(demande.getTempsEcouler());

        transfertDeDemandeChain.transfer(demande);
    }
}
