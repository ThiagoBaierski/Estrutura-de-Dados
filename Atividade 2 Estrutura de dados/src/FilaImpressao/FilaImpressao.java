package FilaImpressao;


import Bases.No;

public class FilaImpressao {
    Documento inicio;
    Documento fim;

    public FilaImpressao() {}


    public void AdicionarDoc(String nome,int tamanho ) {
        Documento NovoDoc = new Documento(nome, tamanho);
        if(estaVazia()){
            inicio = NovoDoc;
            fim = NovoDoc;
        } else{
            NovoDoc.anterior = fim;//aponta o anterior do novo no como a antigo fim da lista
            fim.proximo = NovoDoc;//o proximo do antigo fim é o novo no
            this.fim = NovoDoc;//novo no vira o novo fim
        }
    }

    public void MostrarFila() {
        Documento DocLocal = this.inicio;//no que servirá de endereço para procurar na lista
        //no que servirá de endereço para procurar na lista
        while(DocLocal !=null){
            //atribui o no de localização igual ao proximo
            System.out.println("Documento: "+DocLocal.nome+" ");
            System.out.println("Tamanho: "+ DocLocal.tamanho);
            System.out.print("");
            DocLocal = DocLocal.proximo;
        }
    }




    public void ImprimirDoc() {
        if(estaVazia()){
            System.out.println("Lista Vazia");
        }else{
            System.out.println("Documento: "+this.inicio.nome+" ");
            System.out.println("Tamanho: "+ this.inicio.tamanho);
            System.out.print("");
            this.inicio = this.inicio.proximo;//o inicio vira o proximo depois do velho antigo
            this.inicio.anterior = null;//o anterior do novo inico vira nulo, acabando com a referencia
        }
    }



    public boolean estaVazia() {
        return this.inicio == null && this.fim == null;
    }//verifica se está vazia

    public int tamanho() {
        if(estaVazia()){
            return 0;
        }//se está vazia o tamanho é 0
        Documento DocLocal = this.inicio;
        int cont = 1;
        do{
            cont++;//conta o numero de vezes que passa pelo while assim contando quantos nós tem dentro da lista
            DocLocal = DocLocal.proximo;
        } while (DocLocal != null);
        return cont;
    }
}
