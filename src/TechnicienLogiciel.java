public class TechnicienLogiciel extends AbstracTransfertDeDemandeChain {

    @Override
    public void transfer(Demande demande) {
        if (demande.getCategories() != DemandeCategories.LOGICIEL){
            if (transfertDeDemandeChain != null){
                transfertDeDemandeChain.transfer(demande);
            }
            return;
        }
        System.out.println("---------------- Technicien Logiciel -------------------");

        System.out.println(demande.getCategories());
        System.out.println(demande.getTempsEcouler());
    }

}
