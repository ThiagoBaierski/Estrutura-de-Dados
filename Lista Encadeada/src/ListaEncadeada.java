public class ListaEncadeada {

    No inicio;

    public ListaEncadeada(){}

    public void inserirNoInicio(int valor){
        No novoNo = new No(valor);
        novoNo.proximo = inicio;
        inicio = novoNo;
    }

    public void removerInicio(){
        No novoInicio = inicio;
        this.inicio = novoInicio.proximo;
    }

}
