import java.util.ArrayList;
import java.util.List;

public class HistoricoDicas {
    private List<Dica> dicas;

    public HistoricoDicas() {
        this.dicas = new ArrayList<>();
    }

    public void adicionarDica(Dica dica) {
        dicas.add(dica);
    }

    public void exibirHistorico() {
        System.out.println("------ Histórico de Dicas ------");
        for (Dica dica : dicas) {
            System.out.println(dica.getMensagem());
        }
        System.out.println("---------------------------------");
    }
}

