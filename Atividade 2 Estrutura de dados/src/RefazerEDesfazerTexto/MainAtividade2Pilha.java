package RefazerEDesfazerTexto;

public class MainAtividade2Pilha {
    static void main(String[] args) {
        PilhaTexto desfazer = new PilhaTexto(5);
        PilhaTexto refazer = new PilhaTexto(5);
        RefazerEDesfazerTexto texto = new RefazerEDesfazerTexto(desfazer, refazer);

        texto.inserirTexto("Texto1");
        texto.ExibirTexto();
        texto.inserirTexto("Texto2");
        texto.ExibirTexto();
        texto.inserirTexto("Texto3");
        texto.ExibirTexto();
        texto.desfazerTexto();
        texto.ExibirTexto();
        texto.desfazerTexto();
        texto.ExibirTexto();
        texto.refazerTexto();
        texto.ExibirTexto();
        texto.refazerTexto();
        texto.ExibirTexto();
    }
}
