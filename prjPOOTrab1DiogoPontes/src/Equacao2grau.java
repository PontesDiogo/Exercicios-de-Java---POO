/**
 *
 * @author diogo
 */

public class Equacao2grau {
       private double coef_A;
       private double coef_B;
       private double coef_C;
       private char op;
       String sinalB = (coef_B >= 0) ? " + " : " - ";  // Exibir + ou - para coef_B
       String sinalC = (coef_C >= 0) ? " + " : " - ";  // Exibir + ou - para coef_C
       
       public Equacao2grau(double a, double b, double c){
           coef_A = a;
           coef_B = b;
           coef_C = c;
       }
       
       public double calcDelta(){
           return (Math.pow(coef_B, 2) - 4 * coef_A * coef_C);
       }
       
       public double calcRaiz (int raiz){
           double delta = calcDelta();
           
           if(delta < 0){
               return Double.NaN;
           }
           if(raiz == 1){
               return (-coef_B + Math.sqrt(delta)) / (2 * coef_A);
           }
           else{
               return (-coef_B - Math.sqrt(delta)) / (2 * coef_A);
           }
           
       }
       
       public String exibeEquacao (){
           return "Equação: " + coef_A + "x² " + sinalB + coef_B + "x " + sinalC + coef_C;
       }
       
       
}
