package FilaImpressao;


public class Documento {

    Documento proximo;
    Documento anterior;
    String nome;
    int tamanho;

    public Documento(String nome,int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }
}
