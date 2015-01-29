/**
 * Classe ListaTurma
 * 
 * @author Bruno
 * @version 1.0
 */
public class ListaTurma extends Lista
{
    /**
     * Procura turma
     * 
     * @param nome  nome do turma
     * @return obj  objeto turma
     */
    public Turma find(String nome){
         Turma obj;
         for(int i = 0; i < this.length(); i++){
            obj = (Turma)this.get()[i];
            if(obj.getNome().equalsIgnoreCase(nome)){
                return obj;
            }
        }
        return null;
    }
}
