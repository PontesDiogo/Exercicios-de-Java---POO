package fatec.poo.model;

/**
 *
 * @author diogo
 */
public class Cliente extends Pessoa{
    private int numMesa;
    private double totalConta;
    
    public Cliente(int cdg, String n, int nm){
        super(cdg, n);
        numMesa = nm;
    }
   
    public void setTotalConta (double totalConta){
        this.totalConta += totalConta;
    }
    
    public int getNumMesa(){
        return numMesa;
    }
    
    public double getTotalConta(){
        return totalConta;
    }
    
 
}
