import java.util.Arrays;

public class TransferDeDemandeChain{

    private ITransfertDeDemandeChain root;

    /**
     * @param root
     * @param specialists
     */
    public TransferDeDemandeChain(ITransfertDeDemandeChain root,ITransfertDeDemandeChain ...specialists){
        this.root = root;
        int specialistArrayLength = specialists.length;
        for (int i = 0; i <  specialistArrayLength; i++) {
            if (i == 0){
                this.root.setNextChain(specialists[0]);
            }
            if (specialistArrayLength > i + 1 ){
                specialists[i].setNextChain(specialists[i + 1]);
            }
        }
    }

    public ITransfertDeDemandeChain add() {
        return root;
    }
}
