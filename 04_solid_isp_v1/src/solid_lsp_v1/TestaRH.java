package solid_lsp_v1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestaRH {
    public static void main(String[] args) {
        AtendenteCaixa atendenteCaixa = new AtendenteCaixa(1000, "caixa", "Caixa1");
        Gerente gerente = new Gerente(3000, "gerente", "Gereten1", 1);
        Vendedor vendedor = new Vendedor(2000, "vendedor", "Vendedor1", 200);

        List<Gerente> gerentes = new ArrayList<>();
        List<Vendedor> vendedores = new ArrayList<>();
        List<AtendenteCaixa> atendenteCaixas = new ArrayList<>();

        List<Funcionario> funcionarios = new ArrayList<>();

        LocalDate data = LocalDate.now();
        FolhaSalarial folhaSalarial = new FolhaSalarial(data);

        gerentes.add(gerente);
        vendedores.add(vendedor);
        atendenteCaixas.add(atendenteCaixa);


        funcionarios.addAll(gerentes);
        funcionarios.addAll(vendedores);
        funcionarios.addAll(atendenteCaixas);

        folhaSalarial.imprimirFolhaSalarial(funcionarios);


    }
}