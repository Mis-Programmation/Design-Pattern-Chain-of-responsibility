public interface ITransfertDeDemandeChain {

    void setNextChain(ITransfertDeDemandeChain nextChain);

    void transfer(Demande demande);

}
