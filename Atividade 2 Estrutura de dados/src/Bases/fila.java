package Bases;

public class fila {

    No inicio;
    No fim;

    public fila() {}


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



    public void removerFim() {
        if (estaVazia()){
            System.out.println("Lista Vazia");
        }else{
            this.fim = this.fim.anterior;//o no anterior ao fim vira o novo fim
            fim.proximo = null;//o proximo do novo fim vira nulo, acabando com a referencia
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
