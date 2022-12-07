package solid_lsp_v1;

public class AtendenteCaixa extends Funcionario{

	
	public AtendenteCaixa(float salario, String cargo, String nome) {
		super(salario, cargo, nome);
	}

	// Método Calcular Salário
	@Override
	float calcularSalario() {
		return this.getSalario();
	}

}