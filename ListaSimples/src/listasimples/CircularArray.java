package listasimples;

public class CircularArray {

    public int[] array;
    private int inicio = 0;
    private int fim = -1;
    private int tamanho = 10;

    public CircularArray(){
        this.array = new int[this.tamanho];
    }

    public CircularArray(int tamanho){
        this.array = new int[tamanho];
        this.tamanho = tamanho;
    }

    public int adicionaElemento(int elemento){
        if(this.fim + 1 == this.tamanho){
            System.out.println("O vetor está cheio");
            return -1;
        }

        array[++this.fim] = elemento;
        return elemento;
    }

    public int removeElemento(){
        if(this.vazio()){
            System.out.println("A lista está vazia, adicione pelo menos um elemento na lista");
            return -1;
        }

        int elemento_removido = array[inicio];
        int[] new_array = new int[this.tamanho];

        for(int index = 0; index < fim; index++){
            new_array[index] = array[index + 1];
        }

        this.array = new_array;
        --this.fim;

        return elemento_removido;
    }

    public int size(){
        return this.fim + 1;
    }

    private boolean vazio(){
        return this.size() == 0;
    }
}
