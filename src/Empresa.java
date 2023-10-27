import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    private RegistroFinanceiro registroFinanceiro;
    private HistoricoDicas historicoDicas;
    private boolean dicasAtivadas;
    private List<MetaEconomia> metasEconomia;
    private SistemaRecompensas sistemaRecompensas;

    public Empresa() {
        this.registroFinanceiro = new RegistroFinanceiro();
        this.historicoDicas = new HistoricoDicas();
        this.dicasAtivadas = true;
        this.metasEconomia = new ArrayList<>();
        this.sistemaRecompensas = new SistemaRecompensas();
    }










    public void exibirMetasEconomia() {
        System.out.println("------ Metas de Economia ------");
        for (MetaEconomia meta : metasEconomia) {
            System.out.println("Meta: R$" + meta.getValorMeta() + " - Alcançada: " + (meta.isAlcancada() ? "Sim" : "Não"));
        }
        System.out.println("-------------------------------");
    }




    public void adicionarMetaEconomia(double valorMeta) {
        MetaEconomia meta = new MetaEconomia(valorMeta);
        metasEconomia.add(meta);
        System.out.println("Meta de economia de R$" + valorMeta + " adicionada com sucesso.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa minhaEmpresa = new Empresa();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar Fatura");
            System.out.println("2 - Adicionar Despesa");
            System.out.println("3 - Exibir Relatório Financeiro");
            System.out.println("4 - Ativar/Desativar Dicas");
            System.out.println("5 - Adicionar Dica Manualmente");
            System.out.println("6 - Adicionar Meta de Economia");
            System.out.println("7 - Exibir Metas de Economia");
            System.out.println("8 - Exibir Recompensas Disponíveis");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();


        }
    }
}
