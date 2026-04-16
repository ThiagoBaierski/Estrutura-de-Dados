package Bases;

public class Fila {
    private Integer[] fila;
    private int tamanho;
    private int numElementos;

    public Fila(int tamanho) {
        this.fila = new Integer[tamanho];
        this.tamanho = tamanho;
        this.numElementos = 0;
    }

    public void Enfileirar(int valor){
        if(this.EstaVazia()){
            this.fila[numElementos] = valor;
        } else if (EstaCheio()) {
            System.out.println("Bases.Pilha cheia");
        } else{
            this.fila[numElementos] = valor;
            }
        numElementos++;
        }


    public void Desenfileirar(){
        if(this.EstaVazia()){
            System.out.println("Bases.Fila já está vazia");
        }else{
            for(int i = 0;i<numElementos-1;i++){
                this.fila[i]=this.fila[i+1];
            }
            numElementos--;
            this.fila[numElementos] = 0;

        }
    }
    public boolean EstaVazia() {
        return this.numElementos == 0;
    }
    public boolean EstaCheio(){
        return this.numElementos == tamanho;
    }
    public void Mostrar(){
        for (int i = 0; i<numElementos;i++){
            System.out.print("["+this.fila[i]+"]");
        }
        System.out.println(" ");
    }
}
