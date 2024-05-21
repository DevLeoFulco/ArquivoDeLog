import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

/**
 * Classe principal para processamento de arquivos de log.
 * Esta classe é responsável por iniciar o processamento do arquivo de log
 * e imprimir o número total de contatos e o tempo de processamento.
 */
public class Program {
    /**
     * O método main inicia o aplicativo.
     * @throws IOException é acionado se ocorrer um erro de leitura do arquivo de log.
     */
    public static void main(String[] args) throws IOException {
        // Marca o início do processamento
        Instant start = Instant.now();

        // Chama o método total da classe ContadorLog para obter o número de contatos
        var count = ContadorLog.total("caminho para arquivo de log");

        // Marca o fim do processamento
        Instant finish = Instant.now();

        // Calcula o tempo total de processamento em segundos
        var time = Duration.between(start,finish).toMillis()/60;

        // Imprime o número total de contatos
        System.out.println("Contatos: "+ count);
        // Imprime o tempo de processamento
        System.out.printf("Tempo = %.2f segundos%n", time);
    }
}
