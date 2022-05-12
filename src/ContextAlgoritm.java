public class ContextAlgoritm {

    private iAlgoritm strategy;

    public void setStrategy(iAlgoritm strategy) {

        this.strategy = strategy;
    }

    public void getTextCriptat(String text){

        strategy.cripteaza(text);

    }




}
