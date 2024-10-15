package fatec.poo.model;

/**
 *
 * @author diogo
 */
public class Departamento {
    private String nome;
    private String sigla;
    
    public Departamento(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    
}

