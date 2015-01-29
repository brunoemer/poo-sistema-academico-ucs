/**
 * Classe Aluno
 * 
 * @author Bruno
 * @version 1.0
 */
public class Aluno extends Pessoa
{
    private String curso;
    
    /**
     * Construtor de Aluno
     * 
     * @param nome  nome do aluno
     */
    public Aluno(String nome){
        super(nome);
    }
    
    /**
     * Seta o curso do aluno
     * 
     * @param curso nome do curso
     */
    public void setCurso(String curso){
        this.curso = curso;
    }
}
