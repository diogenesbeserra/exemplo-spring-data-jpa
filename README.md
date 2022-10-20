# exemplo-spring-data-jpa
## Curso DIO Imersão no Spring Framework com Spring Boot 
## Aula Spring Data JPA

Para iniciar devemos criar o projeto no Spring Initializr https://start.spring.io/ acrescentando as dependencias do Spring Data JPA e do banco de dados que iremos utilizar no projeto. Nesse exemplo usamos o H2 Database

Estrutura Básica para Mapeamento de Objeto Relacional(ORM)
- na camada model onde estão modelados os objetos da nossa aplicação vamos fazer o mapeamento desses objetos para o banco de dados utilizando anotações;
- a classe é do tipo @Entity e os atributos da classe recebem anotações de configuração especificas para cada necessidade(Ex. @Id, @GeneratedValue,  @Column(name =""),     @Column(length = 50, nullable = false), etc)
- criamos na camada repositório simplesmente uma interface que extende de outra interface, a JpaRepository<Tipo do Objeto, Tipo do ID>. E só. o frameowrk já implementa todos os métodos necessários para persistencia dos dados.

No mais, ao startar a aplicação, no CommandLineRunner injetamos um repositório, criamos um Bean do Usuário e passamos ele para o repositorio.

## 

## Aula Conexão com Postgres

- Apaga a dependencia do H2 Database no Pom.xml e insere a dependencia do PostgreSql
  
  <!-- POSTGRES -->
		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>
    
- adiciona no application.properties as configurações do databasa


    #Opcional
    spring.jpa.show-sql=true

    #se existe tabela faz update. Se não existe tabela cria nova
    spring.jpa.hibernate.ddl-auto=update

    #Obrigátorio de acordo com o seu banco de dados
    spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
    spring.datasource.driverClassName=org.postgresql.Driver
    spring.datasource.url=jdbc:postgresql://localhost:5432/DIO-aula-SpringDataJpa
    spring.datasource.username=postgres
    spring.datasource.password=postgres

- E só!!! 

##
## Aula JPA Repository

- Query méthod: o JPA constrói o método dinamicamente para nós. Só precisamos criar a assinatura do método na interface que implementa a JpaRepository passando algumas 		palavras chaves e o framework cria o método com uma consulta customizada para a situação desejada.
- Query override: usando a anotação @Query associamos um método da interface a um comando sql que podemos escrever explicitamente recebendo os parametros desejados. 



