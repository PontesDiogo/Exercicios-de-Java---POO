package fatec.poo.model;
import java.util.Scanner;
/**
 *
 * @author doggo
 */
public abstract class Pessoa {
    String nome;
    private int anoInscricao;
    private double totalCompras = 0.0;
    
    
    
    public Pessoa(String n, int ai){
        nome = n;
        anoInscricao = ai;      
    }
    
    abstract public double calcBonus(int bonus);
    
    public void addCompras(double compra){
        totalCompras += compra;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getAnoInscricao(){
        return anoInscricao;
    }
    
    public double getTotalCompras(){
        return totalCompras;
    }
}
