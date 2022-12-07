package solid_ocp_v1;

public class TestaLivro {
    public static void main(String[] args) {
        Fatura fatura = new Fatura(new Livro("NomeLivro", "NomeAutor", 2000, 100, "989-0-733-9987-5"), 2, 0.1, 0);
        ImpressaoDeFatura impressaoDeFatura = new ImpressaoDeFatura(fatura);
        Livro livros = new Livro("NomeLivro1", "NomeAutor1", 1099, 10, "isbm1");
        PersistenciaEmBD persistenciaEmBD = new PersistenciaEmBD(new Fatura(livros, 2, 0.1, 0));
        PersistenciaEmArquivoPdf pdf = new PersistenciaEmArquivoPdf(fatura);

        persistenciaEmBD.salvar(fatura);

        impressaoDeFatura.imprimir();
        
    }
}