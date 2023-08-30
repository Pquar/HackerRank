import java.util.*;
import java.util.stream.Collectors;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner


        String s3, ec2;
        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];
            //TODO: Utilize o mapa para registrar/incrementar o serviço em questão.
            eventosPorServico.put(servico, eventosPorServico.getOrDefault(servico, 0L)+ 1);
        }
        //TODO: Identifique no mapa os serviços com maior e menor quantidade de logs.
        //      Dica: Utilize Java Streams para tornar essa tarefa mais simples.
        String servicoMaior = eventosPorServico.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        String servicoMenor = eventosPorServico.entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        //TODO: Imprima a saída no padrão definido no enunciado deste desafio.
        System.out.println("Eventos por servico:" );
        eventosPorServico.forEach((servico, quantidade)-> System.out.println(servico+":"+quantidade));
        System.out.println("Maior:"+ servicoMaior);
        System.out.println("Menor:"+ servicoMenor);

    }
}