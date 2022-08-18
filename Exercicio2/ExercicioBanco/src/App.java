import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler =new Scanner(System.in);
        
        String banco = "Pan";
        String bancoUsuario;
        String titular = "Guilherme";
        String nomeUsuario;
        Float saldoInicial = 1458.08F;
        Float retirada;
        float saldoFinal; 

         System.out.printf("Informe o nome do seu banco:\n");
         bancoUsuario = ler.nextLine();

         System.out.printf("Informe o seu nome:\n");
        nomeUsuario = ler.nextLine();

         System.out.printf("Qual valor quer retirar:\n");
         retirada = ler.nextFloat();

         

        if (saldoInicial >= retirada){

            saldoFinal = saldoInicial - retirada;

            System.out.println("O valor foi retirado, o valor disponível para próximas retiradas é:  " + saldoFinal);
        
        }else{
            System.out.println("O valor informado não esta disponivel para saque, seu valor atual é: " + saldoInicial);
        }

        if(banco == bancoUsuario  && titular == nomeUsuario ){
            System.out.println("Suas informações de cadastro estão ok");
        }else{
            System.out.println("Suas informações digitas, não conferem com as cadastradas");
        }


        //ver se tenho o saldo para retirada
        //verificar se o nome do titular e o banco são verdadeiros.




    }
}
