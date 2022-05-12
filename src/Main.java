public class Main {

    public static void main(String[] args) {

                                                            // STRATEGY


        ContextAlgoritm contextAlgoritm = new ContextAlgoritm();

        Algoritmul1 algoritmul1 = new Algoritmul1();
        contextAlgoritm.setStrategy(algoritmul1);
        contextAlgoritm.getTextCriptat("Sebastian1998");


        Algoritmul2 algoritmul2 = new Algoritmul2();
        contextAlgoritm.setStrategy(algoritmul2);
        contextAlgoritm.getTextCriptat("Sebastian1998");


        Algoritmul3 algoritmul3 = new Algoritmul3();
        contextAlgoritm.setStrategy(algoritmul3);
        contextAlgoritm.getTextCriptat("Sebastian1998");









    }


}
