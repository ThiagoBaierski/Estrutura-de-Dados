public class Vetor {

    private Integer[] vetor;
    private int tamanho;
    private int numElementos;

    public Vetor(int tamanho) {
        this.vetor = new Integer[tamanho];
        this.tamanho = tamanho;
        this.numElementos = 0;
    }

    // Insere no final; se cheio, dobra o tamanho do vetor
    public void inserir(int valor) {
        //verifica se está cheio o vetor
        if (numElementos != tamanho){
            this.vetor[numElementos]= valor;
            numElementos++;//preenche com o valor
        } else{
            //dobrar o tamanho do vetor caso estoure o valor
            //No caso precisa criar um vetor novo e depois popular com o original.
            Vetor NovoVetor = new Vetor(tamanho*2);
            for (int i = 0; i<this.tamanho;i++){
                NovoVetor.inserir(this.vetor[i]);
            }
            this.vetor = NovoVetor.vetor;
            this.tamanho = NovoVetor.tamanho;
            this.numElementos = NovoVetor.numElementos;
        }
    }

    // Percorre item por item e retorna a posição; -1 se não encontrado
    public int buscar(int valor) {
        //percorre o vetor por completo
        for(int i=0; i < this.tamanho; i++){
            if(this.vetor[i] == valor){
                return i;//retorna posição caso ache
            }
        }
        return -1;//retorna -1 caso não encontre
    }

    // Encontra o elemento e realoca os próximos uma posição para trás
    public boolean remover(int valor) {
        int posicao = this.buscar(valor);
        //verificar se posição existe
        if(posicao != -1){
            //percorre o vetor, nesse caso precisa do -1 para não ir outOfBounds no vetor
            for (int i = posicao; i<numElementos-1;i++){
               this.vetor[i] = this.vetor[i+1];
            }
            //zera o item removido
            this.vetor[numElementos-1] = 0;
            numElementos--;
            return true;
        }
        return false;
    }

    // Printa elemento por elemento do vetor
    public void exibir() {
        if (numElementos !=0){
            //percorre todo o vetor printando cada elemento
            for (int i = 0;i<numElementos;i++){
                System.out.print("["+this.vetor[i]+"]");
            }
            System.out.println(" ");//separação por linha
        }else{
            System.out.println("Vetor vazio");
        }
    }

    // Insere na posição indicada, realocando os próximos; se cheio, dobra o tamanho
    public void inserirNaPosicao(int posicao, int valor) {
        if(numElementos!=this.tamanho){
            //percorre vetor realocando os valores
            for(int i =this.numElementos; i > posicao; i--){
                this.vetor[i] = this.vetor[i-1];
            }
            this.vetor[posicao] = valor;//insere na posição
            numElementos++;
        } else{
            //mesma função de dobrar o vetor que no inserir mas repetida aqui.. o certo é transformar em uma
            //função standalone e daí chamar aqui para evitar ficar reescrevendo código, mas é muito complexo essa parte
            Vetor NovoVetor = new Vetor(tamanho*2);
            for (int i = 0; i<this.tamanho;i++){
                NovoVetor.inserir(this.vetor[i]);
            }
            this.vetor = NovoVetor.vetor;
            this.tamanho = NovoVetor.tamanho;
            this.numElementos = NovoVetor.numElementos;
            this.inserirNaPosicao(posicao,valor);
        }
    }

    public int getNumElementos() { return numElementos; }

    public int getTamanho() { return tamanho; }
}
