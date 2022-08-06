public class Directeur extends AbstracTransfertDeDemandeChain {

    final static private int alertTime = 48;

    @Override
    public void transfer(Demande demande) {

        if (demande.getTempsEcouler() < alertTime){
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
