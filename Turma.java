/**
 * Classe Turma
 * 
 * @author Bruno
 * @version 1.0
 */
public class Turma
{
    private int codigo;
    private String nome;
    private String local;
    private String horario;
    private Disciplina disciplina;
    private Professor professor;
    private Lista aluno;
    
    /**
     * Construtor da Turma
     */
    public Turma(){
        this.aluno = new Lista();
    }
    
    /**
     * Seta o codigo da turma
     * 
     * @param codigo da turma
     */
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    /**
     * Pega o codigo da turma
     * 
     * @return codigo da turma
     */
    public int getCodigo(){
        return this.codigo;
    }
    
    /**
     * Seta o nome da turma
     * 
     * @param nome da turma
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    
    /**
     * Pega o nome da turma
     * 
     * @return nome da turma
     */
    public String getNome(){
        return this.nome;
    }
    
    /**
     * Seta o local da turma
     * 
     * @param local da turma
     */
    public void setLocal(String local){
        this.local = local;
    }
    
    /**
     * Pega o local da turma
     * 
     * @return local da turma
     */
    public String getLocal(){
        return this.local;
    }
    
    /**
     * Seta o horario da turma
     * 
     * @param horario da turma
     */
    public void setHorario(String horario){
        this.horario = horario;
    }
    
    /**
     * Pega o horario da turma
     * 
     * @return horario da turma
     */
    public String getHorario(){
        return this.horario;
    }
    
    /**
     * Seta a disciplina da turma
     * 
     * @param objeto da disciplina da turma
     */
    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }
    
    /**
     * Pega a disciplina da turma
     * 
     * @return objeto da disciplina da turma
     */
    public Disciplina getDisciplina(){
        return this.disciplina;
    }
    
    /**
     * Seta o professor da turma
     * 
     * @param objeto do professor da turma
     */
    public void setProfessor(Professor prof){
        this.professor = prof;
    }
    
    /**
     * Pega o professor da turma
     * 
     * @return objeto do professor da turma
     */
    public Professor getProfessor(){
        return this.professor;
    }
    
    /**
     * Matricula aluno na turma
     * 
     * @param aluno objeto do aluno
     */
    public void matricularAluno(Aluno aluno){
        this.aluno.inserir(aluno);
    }
    
    /**
     * Procura o nome do aluno na lista de alunos matriculados na turma
     * 
     * @param nome do aluno
     * @return posicao do aluno na lista
     */
    public int find(String nome){
         Aluno obj;
         for(int i = 0; i < this.aluno.length(); i++){
            obj = (Aluno)this.aluno.get()[i];
            if(obj.getNome().equalsIgnoreCase(nome)){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Cancela a matricula de um aluno
     * 
     * @param aluno nome do aluno
     */
    public int cancelarAluno(String aluno){
        int pos = this.find(aluno);
        return this.aluno.remover(pos);
    }
    
    /**
     * Ordena lista de alunos
     */
    public void ordenaAlunos(){
        /*int i, j;
        Aluno temp;
        for(i = 0; i < this.i; i++){
            for(j = 0; j < i; j++){
                if(this.alunos[i].getNome().compareTo(this.alunos[j].getNome()) < 0){
                    temp = this.alunos[i];
                    this.alunos[i] = this.alunos[j];
                    this.alunos[j] = temp;
                }
            }
        }*/
    }
    
    /**
     * Retorna quantidade de alunos matriculados na turma
     * 
     * @return quantidade de aluno na lista de alunos
     */
    public int getQtdeAluno(){
        return this.aluno.length();
    }
    
    /**
     * Retorna lista de alunos da turma
     * 
     * @return lista de alunos
     */
    public Aluno[] listaAluno(){
        Aluno[] alunos = (Aluno[])this.aluno.get();
        return alunos;
    }
}
