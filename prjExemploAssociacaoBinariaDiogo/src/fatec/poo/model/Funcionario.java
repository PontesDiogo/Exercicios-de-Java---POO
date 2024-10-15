package fatec.poo.model;

/**
 *
 * @author Dimas
 */
abstract public class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;  
    private String cargo;
    private Departamento departamento; //ponteiro apontando para departamento representando a multiplicidade 1 
                               // multiplicidade 1 (departamento no singular
    
    public Funcionario(int r, String n, String dtAdm){
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;  
    }   
    
    public int getRegistro(){
        return(registro);
    }
    public String getNome(){
        return(nome);
    }
    public String getDtAdmissao(){
        return(dtAdmissao);
    }
    public String getCargo(){
        return(cargo);
    }
    public void setCargo(String c){
        cargo = c;
    }
    
    public abstract double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }

    //retorna o endereço de um obj da classe departamento   
    public Departamento getDepartamento() {
        return departamento;
    }
    //tem como parametro de entrada o endereço de um obj da classe departamento
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
}
