/**
 * Classe ListaProfessor
 * 
 * @author Bruno
 * @version 1.0
 */
public class ListaProfessor extends Lista
{
    /**
     * Procura professor
     * 
     * @param nome  nome do professor
     * @return obj  objeto professor
     */
    public Professor find(String nome){
         Professor obj;
         for(int i = 0; i < this.length(); i++){
            obj = (Professor)this.get()[i];
            if(obj.getNome().equalsIgnoreCase(nome)){
                return obj;
            }
        }
        return null;
    }

}
