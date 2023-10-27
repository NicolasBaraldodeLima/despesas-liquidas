import java.util.ArrayList;
import java.util.List;

public class RegistroFinanceiro {
    private List<Transacao> transacoes;

    public RegistroFinanceiro() {
        this.transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public void exibirRelatorio() {
        System.out.println("------ Relatório Financeiro ------");
        for (Transacao transacao : transacoes) {
            System.out.println(transacao.getDescricao() + ": R$" + transacao.getValor());
        }
        System.out.println("----------------------------------");
    }
}
