import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author diogo
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##");
        Scanner entrada = new Scanner(System.in); 
        
        double coef_A, coef_B, coef_C;
        
        System.out.print("Insira o valor do coeficiente A: ");
        coef_A = entrada.nextDouble();
        System.out.print("Insira o valor do coeficiente B: ");
        coef_B = entrada.nextDouble();
        System.out.print("Insira o valor do coeficiente C: ");
        coef_C = entrada.nextDouble();
        
        // Coletando os coeficientes a partir da digitação do usuário
        
        Equacao2grau objEquacao = new Equacao2grau(coef_A, coef_B, coef_C);
        
        //Instanciação do objeto da classe Equacao2grau 
        //e fazer uma chamada do método construtor
               
        // Exibe a equação
        System.out.println(objEquacao.exibeEquacao());

        // Verificar o Delta e calcula as raízes se aplicável
        double delta = objEquacao.calcDelta();
        if (delta > 0) {
            double raiz1 = objEquacao.calcRaiz(1);
            double raiz2 = objEquacao.calcRaiz(2);
            System.out.println("Raiz 1: " + df.format(raiz1));
            System.out.println("Raiz 2: " + df.format(raiz2));
        } else if (delta == 0) {
            double raiz = objEquacao.calcRaiz(1);
            System.out.println("Raiz única: " + df.format(raiz));
        } else {
            System.out.println("Não tem raiz real");
        }
    }
    
}
    
