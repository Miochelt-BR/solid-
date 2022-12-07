package solid_lsp_v1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestaRH {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente(5000, "Gerente", "Rodrigo", 100);
        Gerente gerente2 = new Gerente(10000, "Gerente", "Bianca", 200);
        Vendedor vendedor1 = new Vendedor(100, "Vendedor", "Diego", 10);
        Vendedor vendedor2 = new Vendedor(200, "Vendedor", "Perola", 20);

        List<Gerente> gerentes = new ArrayList<>();
        List<Vendedor> vendedores = new ArrayList<>();
        gerentes.add(gerente1);
        vendedores.add(vendedor1);

        gerentes.add(gerente2);
        vendedores.add(vendedor2);

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.addAll(vendedores);
        funcionarios.addAll(gerentes);
        
        LocalDate hoje = LocalDate.now();

        FolhaSalarial folhaSalarial = new FolhaSalarial(hoje);

        folhaSalarial.imprimirFolhaSalarial(funcionarios);
    }
}