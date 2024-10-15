package fatec.poo.model;

/**
 *
 * @author diogo
 */
public class Garcom extends Pessoa{
    private double salBase, taxaServico, totalGorjeta; //taxa serviço em %
   
    public Garcom(int cdg, String n, double txs){
        super(cdg, n);
        taxaServico = txs;
    }
    
    public void setSalBase(double sb){
        salBase = sb;
    }
     
    public double getSalBase(){
       return salBase; 
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public double getTotalGorjeta() {
        return totalGorjeta;
    }
    
    public void addGorjeta(Cliente cliente){
 
        totalGorjeta +=  cliente.getTotalConta() * (taxaServico/100);
    }
    
    public double calcSalarioFinal(){
        return totalGorjeta + salBase;
    }  
    
 }

