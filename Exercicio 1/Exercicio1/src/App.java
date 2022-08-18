public class App {
    public static void main(String[] args) throws Exception {

        int despesasJaneiro = 11000;
        int despesasFevereiro = 22000;
        int despesasMarco = 15000;


        int despesasTrimestre = (despesasJaneiro+despesasFevereiro+despesasMarco);

        int mediaPorMes = despesasTrimestre/3;

        System.out.println("O valor da média é: " + mediaPorMes);












    }
}
