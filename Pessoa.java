/**
 * Classe Pessoa
 * 
 * @author Bruno
 * @version 1.0
 */
public class Pessoa
{
    protected String nome;
    protected int cpf;
    protected String endereco;
    
    /**
     * Construtor de Pessoa
     * 
     * @param nome  nome da pessoa
     */
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    /**
     * Construtor de Pessoa
     * 
     * @param nome  nome da pessoa
     * @param cpf   cpf da pessoa
     */
    public Pessoa(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    /**
     * Seta o nome da pessoa
     * 
     * @param nome da pessoa
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    
    /**
     * Pega o nome da pessoa
     * 
     * @return nome da pessoa
     */
    public String getNome(){
        return this.nome;
    }
    
    /**
     * Seta o endereco da pessoa
     * 
     * @param endereco da pessoa
     */
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
