# gravarArquivoByClass
Inserir dados de um arquivo .txt no banco de dados, utilizando uma classe POJO para configuracao.

<b>Spring Batch</b> (http://projects.spring.io/spring-batch/)<br>
<b>Spring Boot</b>  (http://projects.spring.io/spring-boot)<br>
<b>Java</b><br>
<b>STS</b>


<b>Requisitos:</b><br>
Receber arquivos csv / txt com diferntes configurações e inserir no banco de dados SQL server.

<b>Solução:</b><br>
Criação de um serviço com Spring Batch, para fazer a inserção desses arquivos no banco de dados.<br>
Criação de uma classe Util, para auxilia a aplicação e fazer com que as configurações fiquem dinâmicas, assim, <br>
o sistema ler a classe POJO, e cria toda a infra estrutura necessaria, para a leitura do arquivo...


<b>Requisito:</b><br>
Classe POJO, precisar ter a mesma quantidade de campos que os requisitados pelo arquivo.
