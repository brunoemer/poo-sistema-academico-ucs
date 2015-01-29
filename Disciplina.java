/**
 * Classe Disciplina
 * 
 * @author Bruno
 * @version 1.0
 */
public class Disciplina
{
    private String nome;
    
    /**
     * Seta o nome da disciplina
     * 
     * @param nome da disciplina
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    
    /**
     * Pega o nome da disciplina
     * 
     * @return nome da disciplina
     */
    public String getNome(){
        return this.nome;
    }
}
