package FilaImpressao;

public class MainFilaImpressao {
    static void main(String[] args) {
        FilaImpressao filaDoc = new FilaImpressao();
        filaDoc.AdicionarDoc("Adrian",5);

        filaDoc.MostrarFila();
        System.out.println("---");
        filaDoc.AdicionarDoc("Miguel",7);
        filaDoc.MostrarFila();
        System.out.println("---");
        filaDoc.AdicionarDoc("Lucas",22);
        filaDoc.MostrarFila();
        System.out.println("---");
        filaDoc.ImprimirDoc();
        System.out.println("---");
        filaDoc.MostrarFila();
        System.out.println("---");


    }
}
