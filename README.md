# gravarArquivoByClass
Inserir dados de um arquivo .txt no banco de dados, utilizando uma classe POJO para configuracao.

Tecnologias:
Spring Batch (http://projects.spring.io/spring-batch/)
Spring Boot  (http://projects.spring.io/spring-boot)
Java
STS


Requisito:
Receber arquivos csv / txt com diferntes configurações e inserir no banco de dados SQL server.

Solução:
Criação de um serviço com Spring Batch, para fazer a inserção desses arquivos no banco de dados.
Criação de uma classe Util, para auxilia a aplicação e fazer com que as configurações fiquem dinâmicas, assim, 
o sistema ler a classe POJO, e cria toda a infra estrutura necessaria, para a leitura do arquivo...


Requisito:
Classe POJO, precisar ter a mesma quantidade de campos que os requisitados pelo arquivo.
