# Sistema de Análise de Logs de Acesso

Este sistema é uma ferramenta desenvolvida em Java que processa arquivos de log de websites em formato CSV. O objetivo é fornecer informações estatísticas sobre o acesso dos usuários ao site, como o número total de visitantes únicos, os nomes dos visitantes e os horários de acesso.

## Funcionalidades

- **Leitura de Arquivos CSV**: Processa arquivos de log em formato CSV para extrair informações relevantes.
- **Contagem de Acessos Únicos**: Identifica e conta o número de visitantes únicos que acessaram o site.
- **Performance**: Mede o tempo necessário para processar o arquivo de log.

## Conceitos Aplicados

- **Programação Orientada a Objetos**: O sistema é estruturado em classes com responsabilidades bem definidas.
- **Coleções em Java**: Utilização de `HashSet` para armazenamento e verificação rápida de nomes únicos.
- **Tratamento de Exceções**: O sistema lida com possíveis erros de I/O de forma robusta.
- **Medição de Tempo de Execução**: Uso das classes `Instant` e `Duration` para calcular o tempo de processamento.

## Como Utilizar

Para executar o sistema na sua máquina local, siga os passos abaixo:

1. **Pré-requisitos**: Certifique-se de ter o Java instalado em sua máquina. Você pode verificar isso executando `java -version` no terminal.

2. **Compilação**: Compile os arquivos `.java` do projeto. Isso pode ser feito através do comando `javac NomeDoArquivo.java`.

3. **Execução**: Após a compilação, execute o programa com o comando `java Program`. Certifique-se de substituir `caminho para arquivo de log` pelo caminho real do seu arquivo CSV.

4. **Resultados**: O sistema imprimirá no terminal o número total de contatos únicos e o tempo de processamento em segundos.

## Contribuições

Contribuições são sempre bem-vindas! Se você tem alguma sugestão para melhorar o sistema, sinta-se à vontade para criar um `pull request`.

## Licença

Este projeto está sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.
