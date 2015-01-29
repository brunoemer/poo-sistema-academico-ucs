/**
 * Classe ListaAluno
 * 
 * @author Bruno
 * @version 1.0
 */
public class ListaAluno extends Lista
{
    /**
     * Procura aluno
     * 
     * @param nome  nome do aluno
     * @return obj  objeto aluno
     */
    public Aluno find(String nome){
         Aluno obj;
         for(int i = 0; i < this.length(); i++){
            obj = (Aluno)this.get()[i];
            if(obj.getNome().equalsIgnoreCase(nome)){
                return obj;
            }
        }
        return null;
    }
}
