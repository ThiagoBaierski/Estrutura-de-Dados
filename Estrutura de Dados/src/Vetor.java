public class Vetor {
    private int[] vetor;
    private int tamanho;
    private int numElementos = 0;

    public Vetor(int tamanho){
         this.tamanho = tamanho;
         vetor = new int[tamanho];

    }

    public boolean inserir(int valor){
        if(numElementos == tamanho){
            return false;
        }
        vetor[numElementos] = valor;
        numElementos++;
        return true;
    }

    public boolean remover(int valor){
        return false;
    }
    public int buscar(int valor){
        for(int i = 0; i < numElementos; i++){
            if(vetor[i] == valor){
                return i;
            }
        }
        return -1;
    }
    public int getNumElementos(){
        return numElementos;
    }

}
