# CRUD-Java-Spring-Boot

**Este projeto tem como propósito apresentar funcionalidades básicas de um site de e-commerce, explorando operações de criação, 
leitura, atualizações/edições e remoções de conteúdo.**

## Equipe de desenvolvedores:

- ALONSO EHLERT
- GABRIELA ANDRADE
- GUILHERME BRUNES
- LUCAS PRATES REGINALDO

   ## Tecnologias utilizadas:

- Gerenciador de pacotes Maven
- Java 8 (utilizando a faceta de projeto 1.8 para Java na IDE Eclipse)
- Eclipse IDE for Enterprise Java and Web Developers
- Framework Spring Boot 2.7.1
- Tipo de pacote tipo Jar
- Dependência Spring Boot Dev Tools
- Dependência Spring Web
- Dependência Thymeleaf
- Dependência MySQL Driver 
- Dependência Spring Data JPA
- Banco de dados MySQL Community Server 5.7.31
- Bootstrap 4.5.2

Toda configuração inicial do projeto com suas dependências pode ser obtido no site do Spring Initializr, 
disponível em https://start.spring.io/ 



## Rodando o projeto a nível local na porta 8080:

- Iniciar servidor MySQL e usar um SGBD qualquer para criar um novo Schema chamado: ecommerce
- Certificar-se de que a porta MySQL é 3306 em ambiente local. 
- Certificar-se de que a porta 8080 esteja disponível. Caso não estiver, é necessário parar e terminar processos 
sendo excutados nesta porta ou ainda alterar configurações de porta do servidor de aplicação. 
- Criar um usuário no MySQL com o nome: admin
- Definir a senha do usuário anterior como: DesSis2022.
- Dentro do SGBD, conferir ainda privilégios de DBA para o usuário *admin* recém-criado.
- Baixar o repositório CRUD-Java-Spring-Boot em uma pasta do ambiente de trabalho local.
- Abrir o Eclipse IDE for Enterprise Java and Web Developers e dentro da janela Project Explorer, 
clicar com o botão auxiliar do mouse e selecionar *Import*. Na sequência selecionar *Maven > Existing Maven Projects*.
- Clicar em *Browse* e navegar até a pasta em que o projeto foi salvo, selecionando apenas a pasta raiz do projeto. Finalmente
basta clicar em *Finish* para visualizar o projeto listado na interface Project Explorer.
- Para executar o projeto basta navegar até *\src\main\java\org.br.senai.sc.ecommerce* a partir da pasta raiz do projeto no 
Project Explorer do Eclipse.
- Selecione o arquivo EcommerceApplication.java e aperte o botão auxiliar do mouse, selecionando "Run As" e "Java Application" 
- Esperar alguns segundos até a aplicação ser executada e abrir um navegador web.

## Telas da aplicação até o momento

### Tela de listagem de produtos: disponível em http://localhost:8080/comercial/produtos

![image](https://user-images.githubusercontent.com/53625782/179882786-059e8dd6-5e7b-4591-bb49-fde72ed96990.png)

### Tela de inclusão de novos produtos: disponível em http://localhost:8080/comercial/produtos/novo

![image](https://user-images.githubusercontent.com/53625782/179883387-f42b3ccc-bce8-48a3-9965-c98266702f1a.png)

### Tela de alteração de produtos: disponível em http://localhost:8080/comercial/produtos/2 

![image](https://user-images.githubusercontent.com/53625782/179883926-04ac902e-0f23-4458-ab05-1eb8f7e09759.png)

### Demonstrando a exclusão de algum item na tela principal, clicando em Exluir o Boné:

![image](https://user-images.githubusercontent.com/53625782/179884591-2ee0ed93-4987-4206-bccb-3240d339ef6c.png)

Após a exlusão: 

![image](https://user-images.githubusercontent.com/53625782/179884747-bd9fd2b0-fe38-4f25-a47d-40eb882a5a1c.png)

### Visualização da persistência de dados no MySQL usando o MySQL Workbench:

![image](https://user-images.githubusercontent.com/53625782/179885247-7325f751-0ed8-4e1e-b182-46c9541eb7e2.png)









