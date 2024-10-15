
package fatec.poo.model;

/**
 *
 * @author doggo
 */
public class PessoaJuridica extends Pessoa{
    private String cgc;
    private double taxaIncentivo;
    
    public PessoaJuridica(String cgc, String n, int ai){
        super(n, ai);
        this.cgc = cgc;
    }
    
    public double calcBonus(int anoAtual){
        return (taxaIncentivo * super.getTotalCompras() * (anoAtual - super.getAnoInscricao()));
    }
    
    public void setTaxaIncentivo(double txi){
        taxaIncentivo = txi;
    }
    
    public String getCgc(){
        return cgc;
    }
    
    public double getTaxaIncentivo(){
        return taxaIncentivo;
    }
}
