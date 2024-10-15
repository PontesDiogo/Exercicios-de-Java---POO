
import fatec.poo.model.Cliente;
import fatec.poo.model.Garcom;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author diogo
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("R$#,##0.00");
        Scanner entrada = new Scanner(System.in);
        Garcom gc;
                
        System.out.println("Cadastro do Garçom");
        System.out.println("\nInsira o código do garçom: ");
        int codigo = entrada.nextInt();
        System.out.println("\nInsira o nome do garçom: ");
        String nome = entrada.next();
        entrada.nextLine();
        System.out.println("\nInsira a taxa de serviço: (em %)");
        double taxaServico = entrada.nextDouble();
        gc = new Garcom(codigo, nome, taxaServico);
        gc.setSalBase(1300.00);
        
        
        System.out.println("------------------------------");
        System.out.println("\nCadastro dos Clientes");
        
        Cliente[] cli = new Cliente [2];
        for(int i = 0; i < 2; i++){
            System.out.println("\nInsira o código do " + (i +1) + "° cliente: ");
            codigo = entrada.nextInt();
            System.out.println("\nInsira o nome do " + (i +1) +"° cliente: ");
            nome = entrada.next();
            entrada.nextLine();
            System.out.println("\nInsira o número da mesa: ");
            int numMesa = entrada.nextInt();
            System.out.println("\nDigite o total da conta do cliente " + (i +1) + ": ");
            double totalConta = entrada.nextDouble();
            
            cli[i] = new Cliente(codigo, nome, numMesa);
            cli[i].setTotalConta(totalConta);
            
            gc.addGorjeta(cli[i]);
            
        }
        
        System.out.println("------------------------------");
        System.out.println("Código Garçom: " + gc.getCodigo());
        System.out.println("Nome Garçom: " + gc.getNome());
        
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Número da Mesa: " + cli[i].getNumMesa());
            System.out.println("Total da Conta: " + df.format(cli[i].getTotalConta()));
        }
        System.out.println("Salário: " + df.format(gc.calcSalarioFinal()));
      
    }
    
}
