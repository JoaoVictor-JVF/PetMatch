package petmatch;

import java.util.*;

public class PetMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Questionário PetMatch ===");
        System.out.print("Qual seu nível de atividade física (1-5)? ");
        int atividade = sc.nextInt();

        System.out.print("Quanto espaço você possui para o animal (1-5)? ");
        int espaco = sc.nextInt();

        System.out.print("Quanto tempo por dia você pode dedicar a exercícios com o animal (1-5)? ");
        int exercicio = sc.nextInt();

        Map<String, Integer> resultados = new HashMap<>();

        for (Animal a : BaseAnimais.getAnimais()) {
            int score = Math.abs(atividade - a.atividade)
                    + Math.abs(espaco - a.espaco)
                    + Math.abs(exercicio - a.exercicio);
            resultados.put(a.nome, score);
        }

        System.out.println("\n=== Ranking de Compatibilidade ===");
        resultados.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> {
                    String nivel;
                    if (entry.getValue() <= 2) {
                        nivel = "🟢 Boa compatibilidade";
                    } else if (entry.getValue() <= 4) {
                        nivel = "🟡 Compatibilidade com ressalvas";
                    } else {
                        nivel = "🔴 Baixa compatibilidade";
                    }
                    System.out.println(entry.getKey() + ": " + nivel + " (diferença " + entry.getValue() + ")");
                });
    }
}
