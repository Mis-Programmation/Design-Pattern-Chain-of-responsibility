public abstract class AbstracTransfertDeDemandeChain implements ITransfertDeDemandeChain {

    ITransfertDeDemandeChain transfertDeDemandeChain;

    @Override
    public void setNextChain(ITransfertDeDemandeChain nextChain) {
        this.transfertDeDemandeChain = nextChain;
    }

}
