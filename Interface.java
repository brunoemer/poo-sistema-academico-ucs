/**
 * Classe Interface
 * 
 * @author Bruno
 * @version 1.0
 */
public class Interface
{
    private Leitor teclado;
    private ListaTurma turmas;
    private ListaAluno alunos;
    private ListaProfessor professores;
    private ListaDisciplina disciplinas;
    
    /**
     * Construtor da Interface
     */
    public Interface(){
        this.teclado = new Leitor();
        this.turmas = new ListaTurma();
        this.alunos = new ListaAluno();
        this.professores = new ListaProfessor();
        this.disciplinas = new ListaDisciplina();
        this.showMenu();
    }
    
    /**
     * Mostra o menu
     */
    public void showMenu(){
        int n = 1;
        
        while(n > 0){
            System.out.println("Escolha o numero da opcao:");
            System.out.println("0) Sair");
            System.out.println("1) Cadastrar Turma");
            System.out.println("2) Listar Turmas");
            System.out.println("3) Cadastrar Aluno");
            System.out.println("4) Listar Alunos");
            System.out.println("5) Cadastrar Professor");
            System.out.println("6) Listar Professores");
            System.out.println("7) Cadastrar Disciplina");
            System.out.println("8) Listar Disciplinas");
            System.out.println("9) Matricular Aluno");
            System.out.println("10) Listar alunos Matriculos em uma Turma");
            System.out.println("11) Ordenar alunos de uma Turma");
            System.out.println("12) Cancelar Matricula");
            
            System.out.println("99) Inserir dados de teste");
            
            n = this.teclado.leiaInt();
            this.interpreter(n);
        }
    }
    
    /**
     * Acoes do menu
     * 
     * @param n opcao escolhida no menu
     */
    private void interpreter(int n){
        switch(n){
            case 0: System.exit(0); break;
            case 1: {
                
                if(!this.professores.have()){
                    System.out.println("Cadastre professores antes de cadastrar a turma");
                    return;
                }
                
                if(!this.disciplinas.have()){
                    System.out.println("Cadastre disciplinas antes de cadastrar a turma");
                    return;
                }
                
                Turma turma = new Turma();
                System.out.println("Digite o codigo(numerico) da turma:");
                int cod = this.teclado.leiaInt();
                turma.setCodigo(cod);
                
                System.out.println("Digite o nome da turma:");
                String nome = this.teclado.leiaString();
                turma.setNome(nome);
                
                System.out.println("Digite o local da turma:");
                String local = this.teclado.leiaString();
                turma.setLocal(local);
                
                System.out.println("Digite o horario da turma:");
                String horario = this.teclado.leiaString();
                turma.setHorario(horario);
                
                while(true){
                    System.out.println("Digite o nome de um professor ja cadastrado");
                    String professorNome = this.teclado.leiaString();
                    Professor professor = this.professores.find(professorNome);
                    if(professor == null){
                        continue;
                    }
                    turma.setProfessor(professor);
                    System.out.println("Professor Vinculado!");
                    break;
                }
                
                while(true){
                    System.out.println("Digite o nome de uma disciplina ja cadastrada");
                    String discrNome = this.teclado.leiaString();
                    Disciplina disciplina = this.disciplinas.find(discrNome);
                    if(disciplina == null){
                        continue;
                    }
                    turma.setDisciplina(disciplina);
                    System.out.println("Disciplina Vinculada!");
                    break;
                }
                this.turmas.inserir(turma);
            }; break;
            
            case 2:{
                System.out.println(this.turmas);
            } break;
            
            case 3:{
                System.out.println("Digite o nome do Aluno:");
                String nome = this.teclado.leiaString();
                Aluno aluno = new Aluno(nome);
                this.alunos.inserir(aluno);
                
            } break;
            
            case 4:{
                System.out.println(this.alunos);
            }break;
            
            case 5:{
                System.out.println("Digite o nome do Professor:");
                String nome = this.teclado.leiaString();
                Professor professor = new Professor(nome);
                this.professores.inserir(professor);
            } break;
            
            case 6:{
                System.out.println(this.professores);
            }break;
            
            case 7:{
                Disciplina disciplina = new Disciplina();
                System.out.println("Digite o nome da Disciplina:");
                String nome = this.teclado.leiaString();
                disciplina.setNome(nome);
                this.disciplinas.inserir(disciplina);
            }break;
            
             case 8:{
                System.out.println(this.disciplinas);
            }break;
            
            case 9:{
                if(!this.turmas.have()){
                    System.out.println("Cadastre turmas para poder listar seus alunos");
                    return;
                }
                
                if(!this.alunos.have()){
                    System.out.println("Cadastre alunos para poder matricular");
                    return;
                }
                
                String nome = null;
                
                Turma turma = null;
                while(true){
                    System.out.println("Digite o nome da Turma");
                    nome = this.teclado.leiaString();
                    turma = this.turmas.find(nome);
                    if(turma == null){
                        continue;
                    }
                    System.out.println("Turma encontrada!");
                    break;
                }
                
                while(true){
                    System.out.println("Digite o nome do Aluno");
                    nome = this.teclado.leiaString();
                    Aluno aluno = this.alunos.find(nome);
                    if(aluno == null){
                        continue;
                    }
                    
                    turma.matricularAluno(aluno);
                    System.out.println("Aluno Matriculado!");
                    break;
                }
            }break;
            
            case 10:{
                if(!this.turmas.have()){
                    System.out.println("Cadastre turmas para poder listar seus alunos");
                    return;
                }
                
                Turma turma = null;
                while(true){
                    System.out.println("Digite o nome da Turma");
                    String nome = this.teclado.leiaString();
                    turma = this.turmas.find(nome);
                    if(turma == null){
                        continue;
                    }
                    
                    Aluno[] aluno = turma.listaAluno();
                    int total = turma.getQtdeAluno();
                    for(int i = 0; i < total; i++){
                        System.out.println(aluno[i].getNome()); 
                    }
                    break;
                }
            }break;
            
            case 11:{
                while(true){
                    System.out.println("Digite o nome da Turma");
                    String nome = this.teclado.leiaString();
                    Turma turma = this.turmas.find(nome);
                    if(turma == null){
                        continue;
                    }
                    
                    turma.ordenaAlunos();
                    
                    Aluno[] aluno = turma.listaAluno();
                    int total = turma.getQtdeAluno();
                    for(int i = 0; i < total; i++){
                        System.out.println(aluno[i].getNome()); 
                    }
                    break;
                }
            }break;
            
            case 12:{
                if(!this.turmas.have()){
                    System.out.println("Cadastre turmas para poder cancelar matriculas de seus alunos");
                    return;
                }
                
                if(!this.alunos.have()){
                    System.out.println("Cadastre alunos para poder cancelar matricular");
                    return;
                }
                
                String nome = null;
                
                Turma turma = null;
                while(true){
                    System.out.println("Digite o nome da Turma");
                    nome = this.teclado.leiaString();
                    turma = this.turmas.find(nome);
                    if(turma == null){
                        continue;
                    }
                    System.out.println("Turma encontrada!");
                    break;
                }
                
                while(true){
                    System.out.println("Digite o nome do Aluno");
                    nome = this.teclado.leiaString();
                    Aluno aluno = this.alunos.find(nome);
                    if(aluno == null){
                        continue;
                    }
                    
                    turma.cancelarAluno(aluno.getNome());
                    System.out.println("Matricula Cancelada");
                    break;
                }
            }break;
            
            case 99:{
                Aluno a = new Aluno("Aluno 1");
                this.alunos.inserir(a);
                
                Aluno b = new Aluno("Aluno 2");
                this.alunos.inserir(b);
                
                Aluno c = new Aluno("Aluno 3");
                this.alunos.inserir(c);
                
                Disciplina d1 = new Disciplina();
                d1.setNome("Matematica");
                this.disciplinas.inserir(d1);
                
                Disciplina d2 = new Disciplina();
                d2.setNome("Programacao");
                this.disciplinas.inserir(d2);
                
                Disciplina d3 = new Disciplina();
                d3.setNome("Calculo");
                this.disciplinas.inserir(d3);
                
                Professor p1 = new Professor("Joao");
                this.professores.inserir(p1);
                
                Professor p2 = new Professor("Maria");
                this.professores.inserir(p2);
                
                Professor p3 = new Professor("Paulo");
                this.professores.inserir(p3);
            }break;
            
            default:{
                System.out.println("Opcao invalida");
            }break;
        }
            
        System.out.print("\n");
    }
}
