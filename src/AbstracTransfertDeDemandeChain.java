public abstract class AbstracTransfertDeDemandeChain implements ITransfertDeDemandeChain {

   protected ITransfertDeDemandeChain transfertDeDemandeChain;

    @Override
    public void setNextChain(ITransfertDeDemandeChain nextChain) {
        this.transfertDeDemandeChain = nextChain;
    }

}
