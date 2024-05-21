
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Classe ContadorLog para contabilizar acessos únicos em um arquivo de log.
 * Esta classe utiliza um HashSet para armazenar e verificar nomes únicos.
 */
public class ContadorLog {
    /**
     * Conta o número total de pessoas únicas que acessaram o site.
     *
     * @param filename -> O caminho para o arquivo de log CSV.
     * @return -> O número total de acessos únicos ao site.
     * @throws IOException -> Se ocorrer um erro ao ler o arquivo.
     */

    public static int total (String filename) throws IOException{
        // Cria um buffer para ler o arquivo de log
        var file = new BufferedReader(new FileReader(filename));
        // Utiliza um HashSet para armazenar nomes únicos
        var names = new HashSet<>();

        // Lê a primeira linha do arquivo
        String line = file.readLine();

        while (line != null){
            // Extrai o nome da pessoa a partir da linha, assumindo que o nome é o primeiro elemento separado por vírgula
            String name = line.split(",")[0];

            // Adiciona o nome ao conjunto se ainda não estiver presente
            if (!names.contains(name)){
               names.add(name);

            }
            // Lê a próxima linha do arquivo
           line = file.readLine();
       }
        // Fecha o arquivo após terminar a leitura
        file.close();

        // Retorna o tamanho do conjunto, que representa o número de nomes únicos
        return names.size();
    }
}
