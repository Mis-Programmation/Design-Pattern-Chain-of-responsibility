public class TechnicienMateriel extends AbstracTransfertDeDemandeChain {

    @Override
    public void transfer(Demande demande) {
        if (demande.getCategories() != DemandeCategories.MATERIEL){
            if (transfertDeDemandeChain != null){
                transfertDeDemandeChain.transfer(demande);
            }
            return;
        }
        System.out.println("---------------- Technicien Materiel -------------------");

        System.out.println(demande.getCategories());
        System.out.println(demande.getTempsEcouler());
    }

}
