import java.util.ArrayList;
import java.util.List;

public class SistemaRecompensas {
    public List<String> recompensas;

    public SistemaRecompensas() {
        this.recompensas = new ArrayList<>();
        inicializarRecompensas();
    }

    private void inicializarRecompensas() {
        recompensas.add("Parabéns! Você alcançou sua primeira meta de economia.");
        recompensas.add("Excelente trabalho! Continue assim.");
        recompensas.add("Você está indo muito bem. Ganhou uma recompensa especial!");
    }

    public void fornecerRecompensa() {
        int indiceRecompensa = (int) (Math.random() * recompensas.size());
        System.out.println("Recompensa: " + recompensas.get(indiceRecompensa));
    }
}
