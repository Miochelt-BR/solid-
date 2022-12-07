package solid_srp_v1;

public class TestaLivro {

	public static void main(String[] args) {
		
		Livro livro = new Livro("Clean Code", "Tobert Cecil Martin", 2008, 390.99, "9780132350884");
		
		Fatura fatura = new Fatura(livro,1, 0.10, 0.05);
		
		ImpressaoDeFatura impressao = new ImpressaoDeFatura(fatura);
		
		impressao.imprimir();

	}

}
