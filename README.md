# exemplo-spring-data-jpa
## Curso DIO Imersão no Spring Framework com Spring Boot - Aula Spring Data JPA

Para iniciar devemos criar o projeto no Spring Initializr https://start.spring.io/ acrescentando as dependencias do Spring Data JPA e do banco de dados que iremos utilizar no projeto. Nesse exemplo usamos o H2 Database

Estrutura Básica para Mapeamento de Objeto Relacional(ORM)
- na camada model onde estão modelados os objetos da nossa aplicação vamos fazer o mapeamento desses objetos para o banco de dados utilizando anotações;
- a classe é do tipo @Entity e os atributos da classe recebem anotações de configuração especificas para cada necessidade(Ex. @Id, @GeneratedValue,  @Column(name =""),     @Column(length = 50, nullable = false), etc)
- criamos na camada repositório simplesmente uma interface que extende de outra interface, a JpaRepository<Tipo do Objeto, Tipo do ID>. E só. o frameowrk já implementa todos os métodos necessários para persistencia dos dados.

No mais, ao startar a aplicação, no CommandLineRunner injetamos um repositório, criamos um Bean do Usuário e passamos ele para o repositorio.
