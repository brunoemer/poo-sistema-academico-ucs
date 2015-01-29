/**
 * Classe ListaDisciplina
 * 
 * @author Bruno
 * @version 1.0
 */
public class ListaDisciplina extends Lista
{
    /**
     * Procura disciplina
     * 
     * @param nome  nome do disciplina
     * @return obj  objeto disciplina
     */
    public Disciplina find(String nome){
         Disciplina obj;
         for(int i = 0; i < this.length(); i++){
            obj = (Disciplina)this.get()[i];
            if(obj.getNome().equalsIgnoreCase(nome)){
                return obj;
            }
        }
        return null;
    }
}
