import fatec.poo.model.PessoaFisica;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author doggo
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        PessoaFisica pf;
        
           
        System.out.println("Insira o nome da pessoa física: ");
        String nome = entrada.next();
        System.out.println("Insira o ano de inscrição: ");
        int anoInscricao = entrada.nextInt();
        System.out.println("Insira o CPF");
        String cpf = entrada.next();
        System.out.println("Insira o valor da base para realizar o cálculo do bônus: ");
        double base = entrada.nextDouble();
        
       

    }
    
}
