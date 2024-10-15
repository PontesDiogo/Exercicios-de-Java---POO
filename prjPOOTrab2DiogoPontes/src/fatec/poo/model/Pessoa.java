package fatec.poo.model;

/**
 *
 * @author diogo
 */
public class Pessoa {
    
    private int codigo;
    private String nome;
    
    public Pessoa (int cdg, String n){
        codigo = cdg;
        nome = n;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getNome(){
        return nome;
    }    
}
