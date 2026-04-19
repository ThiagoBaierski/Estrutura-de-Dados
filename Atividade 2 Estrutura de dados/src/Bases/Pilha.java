package Bases;

public class Pilha {

    private Integer[] pilha;
    private int tamanho;
    private int numElementos;

    public Pilha(int tamanho) {
        this.pilha = new Integer[tamanho];
        this.tamanho = tamanho;
        this.numElementos = 0;
    }


    public void InserirNaPilha(int valor) {
        if(this.EstaVazia()){
            this.pilha[numElementos] = valor;
        } else if (EstaCheio()) {
            System.out.println("Bases.Pilha cheia");
        } else{
            for(int i= numElementos; i>0; i--){
                this.pilha[i] = this.pilha[i-1];
            }
            this.pilha[0] = valor;
        }
        numElementos++;
    }
    public void RemoverDaPilha(){
        for(int i=0;i<this.numElementos-1;i++){
            this.pilha[i] = this.pilha[i+1];
        }
        this.numElementos--;
        this.pilha[this.numElementos] = null;
    }

    public boolean EstaVazia() {
        return this.numElementos == 0;
    }
    public boolean EstaCheio(){
        return this.numElementos == tamanho;
    }
    public void Mostrar(){
        for (int i = 0; i<numElementos;i++){
            System.out.print("["+this.pilha[i]+"]");
        }
        System.out.println(" ");
    }

}