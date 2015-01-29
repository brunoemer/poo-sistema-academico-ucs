/**
 * Classe Professor
 * 
 * @author Bruno
 * @version 1.0
 */
public class Professor extends Pessoa
{
    private String departamento;
    
    /**
     * Construtor de Professor
     * 
     * @param nome  nome do professor
     */
    public Professor(String nome){
        super(nome);
    }
    
    /**
     * Seta o departamento do professor
     * 
     * @param departamento  nome do departamento
     */
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
}
