import java.util.ArrayList;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Agencia cliente = new Agencia(1021,"067-8","MARIO ANDRADE",237.48);
        ArrayList <Agencia> clientes = new ArrayList<Agencia>();
        clientes.add(cliente);
        System.out.println("Por favor, digite o número da Agência !");
        int numero = 1021;
        for (Agencia agencia : clientes) {
            if (agencia.getNumero() == numero) {
                System.out.println(cliente);
            }
            else{
                System.err.println("ERRO!");
            }
        }
        sc.close();
    }
    
}
