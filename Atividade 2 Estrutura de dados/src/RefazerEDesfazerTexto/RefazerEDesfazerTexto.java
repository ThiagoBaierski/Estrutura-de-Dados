package RefazerEDesfazerTexto;

public class RefazerEDesfazerTexto {
    PilhaTexto desfazer;
    PilhaTexto refazer;
    String texto;

    public RefazerEDesfazerTexto(PilhaTexto pilhaDesfazer, PilhaTexto pilhaRefazer) {
        this.desfazer = pilhaDesfazer;
        this.refazer = pilhaRefazer;
    }

    public void inserirTexto(String valor) {
        desfazer.inserir(texto);
        texto = valor;
        refazer.remover();
    }

    public void desfazerTexto() {
        refazer.inserir(texto);
        texto = desfazer.getTopo();
        desfazer.remover();
    }
    public void refazerTexto() {
        desfazer.inserir(texto);
        texto = refazer.getTopo();
        refazer.remover();
    }

    public void ExibirTexto() {
        System.out.println(texto);
        System.out.println("---");
    }
}
