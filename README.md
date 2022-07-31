# CRUD-Java-Spring-Boot

**Este projeto tem como propósito apresentar funcionalidades básicas de um site de e-commerce, explorando operações de criação, 
leitura, atualizações/edições e remoções de conteúdo.**

## Equipe de desenvolvedores:

- ALONSO EHLERT
- GABRIELA ANDRADE
- GUILHERME BRUNES
- LUCAS PRATES REGINALDO

   ## Principais tecnologias utilizadas:

- Gerenciador de pacotes Maven
- Java 8 (utilizando a faceta de projeto 1.8 para Java na IDE Eclipse)
- Eclipse IDE for Enterprise Java and Web Developers
- Framework Spring Boot 2.7.1
- Tipo de pacote tipo Jar
- Dependência Spring Boot Dev Tools
- Dependência Spring Web
- Dependência Spring Boot Starter Security
- Framework Thymeleaf
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
- Dentro do SGBD, atribuir ainda privilégios de DBA para o usuário *admin* recém-criado.
- Baixar o repositório CRUD-Java-Spring-Boot em uma pasta do ambiente de trabalho local.
- Abrir o Eclipse IDE for Enterprise Java and Web Developers e dentro da janela Project Explorer, 
clicar com o botão auxiliar do mouse e selecionar *Import*. Na sequência selecionar *Maven > Existing Maven Projects*.
- Clicar em *Browse* e navegar até a pasta em que o projeto foi salvo, selecionando apenas a pasta raiz do projeto. Finalmente
basta clicar em *Finish* para visualizar o projeto listado na interface Project Explorer.
- Para executar o projeto basta navegar até *\src\main\java\org.br.senai.sc.ecommerce* a partir da pasta raiz do projeto no 
Project Explorer do Eclipse.
- Selecione o arquivo EcommerceApplication.java e aperte o botão auxiliar do mouse, selecionando "Run As" e "Java Application" 
- Esperar alguns segundos até a aplicação ser executada.

## Telas da aplicação

### Tela de de login do administrador: disponível em http://localhost:8080/comercial/produtos (Esta tela irá inicialmente ser redirecionada para a tela de login)

![Tela01](https://user-images.githubusercontent.com/53625782/182045307-302fde11-3def-45df-a166-5bcae7d4c7b6.png)

Para logar, o nome do usuário e senha são: *administrator*

### Tela de listagem de produtos iniciais cadastrados: disponível em http://localhost:8080/comercial/produtos

![Tela02](https://user-images.githubusercontent.com/53625782/182045836-f5cd14b9-e82c-43e2-ae9e-e86319754149.png)


### Tela de inclusão de novos produtos: disponível em http://localhost:8080/comercial/produtos/novo (esta tela permite a selecão de um departamento do produto, no último campo do formulário através do menu drop-down.

![Tela03](https://user-images.githubusercontent.com/53625782/182045988-6c2d2aae-5ec4-4eeb-9a71-5a5a35e34cfa.png)


### Tela de alteração de produtos: exemplo do item "Boné", disponível em http://localhost:8080/comercial/produtos/3 

![Tela04](https://user-images.githubusercontent.com/53625782/182046409-99875e4f-f445-4804-b8bb-327ebedc484b.png)


### Demonstrando a exclusão de algum item na tela principal, clicando em Exluir o Boné:

![Tela05](https://user-images.githubusercontent.com/53625782/182046493-9243dc57-785e-4ad8-9e6c-68b434c458f4.png)

Após a exlusão: 

![Tela06](https://user-images.githubusercontent.com/53625782/182046570-ef9d4bfb-bcb8-44a9-b88a-38467ad00794.png)

### Visualização da persistência de dados no MySQL usando o MySQL Workbench:

![Tela07](https://user-images.githubusercontent.com/53625782/182046621-49749e6f-f1e8-4e94-8617-de44f99a3b33.png)

### Diagrama de entidade relacionamento 

![EER_diagram](https://user-images.githubusercontent.com/53625782/182046786-7f55b2c1-01f7-4032-bbd0-2333b0c322c1.png)











