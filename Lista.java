/**
 * Classe Lista
 * 
 * @author Bruno
 * @version 1.0
 */
public class Lista
{
    private Object[] array;
    private int i;
    
    /**
     * Construtor da Lista
     */
    public Lista(){
        this.array = new Object[100];
        this.i = 0;
    }
    
    /**
     * Verifica se array tem algum objeto
     * 
     * @return boolean se array tem objeto
     */
    public boolean have(){
        return (this.i > 0)?true:false;
    }
    
    /**
     * Insere obj na lista
     * 
     * @param obj   obj a ser adicionado na lista
     */
    public void inserir(Object obj){
        /*this.array[this.i] = obj;
        int i = this.i - 1;
        Object temp;
        while((i >= 0) && obj.compareTo(this.array[i]) < 0){
            temp = this.array[i] ;
            this.array[i] = this.array[i+1] ;
            this.array[i+1] = temp;
            i--;
        }
        this.i++;
        return 0;*/
        this.array[this.i] = obj;
        this.i++;
    }
    
    /**
     * Remove um objeto da lista
     * 
     * @param pos   posicao do array a ser removida
     * @return 1 para posicao invalida e 0 para invalida
     */
    public int remover(int pos){
        if(pos >= 0 && pos < this.i){
            for(int i = pos; i < this.i; i++){
                this.array[i] = this.array[i+1];
            }
            this.i--;
            return 1;
        }else{
            return 0;
        }
    }
    
    /**
     * Tamanho da lista
     * 
     * @return i    tamanho do array
     */
    public int length(){
        return this.i;
    }
    
    /**
     * Retorna objeto da lista
     * 
     * @param pos   posicao da lista
     * @return objeto da lista
     */
    public Object get(int pos){
        return this.array[pos];
    }
    
    /**
     * Retorna a lista inteira
     * 
     * @return lista inteira de objetos
     */
    public Object[] get(){
        return this.array;
    }

    /*
    public void quickSort(int arr[], int left, int right){
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }
    
    private int partition(int arr[], int left, int right){
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        };

        return i;
    }
    */
}
