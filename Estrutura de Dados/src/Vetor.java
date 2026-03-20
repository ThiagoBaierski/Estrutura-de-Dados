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
    public int buscar(int valor){

        for(int i = 0; i < numElementos; i++){
            if(vetor[i] == valor){
                return i;
            }
        }
        return -1;
    }

    public int buscaBinaria(int valor){

        int inicio = 0;
        int fim = numElementos;
        int chute =(fim-inicio)/2;

        while(inicio < fim){

            if (vetor[chute] == valor) {
                return chute;
            }
            if(valor>vetor[chute]){
                inicio = chute;
                chute =(fim+inicio)/2;
            }
            else{
                fim = chute;
                chute =(fim-inicio)/2;
            }
        }
    return -1;
    }
    public boolean remover(int valor){
        int posicao = buscar(valor);
        if (posicao !=1){
            for(int i = posicao; i < numElementos-1;i++){
                vetor[i] = vetor[i+1];
            }
            vetor[numElementos-1] = 0;
            numElementos--;
            return true;
        }
        return false;
    }


    public int getNumElementos(){
        return numElementos;
    }

}
