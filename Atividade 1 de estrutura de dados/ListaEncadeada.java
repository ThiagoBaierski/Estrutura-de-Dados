public class ListaEncadeada {

    No inicio;
    No fim;

    public ListaEncadeada() {}

    public void inserirInicio(int valor) {
        No NovoNo = new No(valor);
        //verifica se está vazia a lasta e marca o nono No como
        //inicio e fim para inicializar a lista
        if(estaVazia()){
            inicio = NovoNo;
            fim = NovoNo;
        }else{
            //não estando vazia
            NovoNo.proximo = inicio;//aponta o proximo do node que acabou de ser adicionado como antigo início
            inicio.anterior = NovoNo;//o anterior do antigo inicio é igualado ao no novo
            this.inicio = NovoNo;//no novo agora é o início
        }
    }

    public void inserirFim(int valor) {
        No NovoNo = new No(valor);
        if(estaVazia()){
            inicio = NovoNo;
            fim = NovoNo;
        } else{
            NovoNo.anterior = fim;//aponta o anterior do novo no como a antigo fim da lista
            fim.proximo = NovoNo;//o proximo do antigo fim é o novo no
            this.fim = NovoNo;//novo no vira o novo fim
        }
    }

    public No buscar(int valor) {
        No NoLocal = this.inicio;//no que servirá de endereço para procurar na lista
        do{
            NoLocal = NoLocal.proximo;//atribui o no de localização igual ao proximo
            if(NoLocal.valor == valor){//verifica se o valor dentro do no é o valor procurado
             return NoLocal;//se achar ele retorna o NoLocal que é equivalente ao no na lista
            }

        }while(NoLocal.proximo !=null);//verifica se existe proximo no na lista
        return null;//retorna null se nao achar valor
    }

    public void inserirApos(int valorProcurado, int valorInserido) {
        No NoLocal = this.buscar(valorProcurado);//procura o no com o valor respectivo
        No NovoNo = new No(valorInserido);//no com valor que sera inserido
            if(NoLocal.proximo != null) {//se o proximo não for nulo ele não está no fim da lista
                NovoNo.proximo = NoLocal.proximo;//o nó após o nó encontrado vira o proximo do no novo
                NovoNo.anterior = NoLocal;// o anterior do novo nó vira o no localizado
                NoLocal.proximo = NovoNo;//o proximo do no localizado vira o novo no
                NovoNo.proximo.anterior = NovoNo;//o anterior do no depois do novo no vira o novo no
            }else{
                inserirFim(valorInserido);
            }

    }

    public void removerInicio() {
        if(estaVazia()){
            System.out.println("Lista Vazia");
        }else{
            this.inicio = this.inicio.proximo;//o inicio vira o proximo depois do velho antigo
            this.inicio.anterior = null;//o anterior do novo inico vira nulo, acabando com a referencia
        }
    }

    public void removerFim() {
        if (estaVazia()){
            System.out.println("Lista Vazia");
        }else{
            this.fim = this.fim.anterior;//o no anterior ao fim vira o novo fim
            fim.proximo = null;//o proximo do novo fim vira nulo, acabando com a referencia
        }
    }

    public void remover(int valor) {
        No NoLocal = buscar(valor);
        if (NoLocal.anterior == null) {//se não tem anterior é o inicio da lista
            removerInicio();
        } else if (NoLocal.proximo == null) {//se não tem proximo é o fim da lista
            removerFim();
        } else {
            NoLocal.anterior.proximo = NoLocal.proximo;//o proximo do anterior ao no a ser removido vira o depois dele
            NoLocal.proximo.anterior = NoLocal.anterior;//o anterior do no proximo ao no a ser removido vira o antes dele
        }
    }

    public boolean estaVazia() {
        return this.inicio == null && this.fim == null;
    }//verifica se está vazia

    public int tamanho() {
        if(estaVazia()){
            return 0;
        }//se está vazia o tamanho é 0
        No NoLocal = this.inicio;
        int cont = 1;
        do{
            cont++;//conta o numero de vezes que passa pelo while assim contando quantos nós tem dentro da lista
            NoLocal = NoLocal.proximo;
        } while (NoLocal.proximo != null);
        return cont;
    }
}
