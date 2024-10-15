package fatec.poo.model;
import java.util.Scanner;

/**
 *
 * @author doggo
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private double base= 0.0;
    
    public PessoaFisica(String nome, int anoInscricao, String cpf){
        super(nome, anoInscricao);
        this.cpf = cpf;
          
    } 


    public double calcBonus(int anoAtual){
        if(super.getTotalCompras() >12000){
            return ((anoAtual - super.getAnoInscricao()) * base);
        }
        else {
            return 0;
        } 
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setBase(double b){
        base = b;
    }
    
    public double getBase(){
        return base;
    }
}
