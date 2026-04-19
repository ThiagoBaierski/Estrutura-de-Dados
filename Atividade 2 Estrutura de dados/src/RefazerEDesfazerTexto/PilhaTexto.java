package RefazerEDesfazerTexto;

public class PilhaTexto {

    private String[] vetor;
    private int tamanho;
    private int numElementos;

    public PilhaTexto(int tamanho) {
        this.vetor = new String[tamanho];
        this.tamanho = tamanho;
        this.numElementos = 0;
    }

    public void inserir(String valor) {
        if(!isFull()) {
            vetor[numElementos] = valor;
            numElementos++;
        } else {
            dobrarTamanhoPilha(valor);
        }
    }

    public void remover() {
        if(!isEmpty()) {
            vetor[numElementos-1] = null;
            numElementos--;
        }
    }
    public void limpar() {
        while(numElementos != 0) {
            remover();
        }
    }

    private void dobrarTamanhoPilha(String valor) {
        PilhaTexto novaPilha = new PilhaTexto(this.tamanho*2);
        for(int i = 0; i < this.tamanho; i++) {
            novaPilha.inserir(this.vetor[i]);
        }
        novaPilha.inserir(valor);
        this.vetor = novaPilha.vetor;
        this.tamanho = novaPilha.tamanho;
        this.numElementos = novaPilha.numElementos;
    }

    public boolean isEmpty() {
        return numElementos == 0;
    }
    public boolean isFull() {
        return numElementos == tamanho;
    }

    public String getTopo() {
        if(!isEmpty()) {
            return vetor[numElementos - 1];
        } else {
            return null;
        }
    }

    public int getTamanho() {
        return tamanho;
    }
    public int getNumElementos() {
        return numElementos;
    }
    public String[] getVetor() {
        return vetor;
    }

}
