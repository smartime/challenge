# Smartime Challenge

A empresa ACME está migrando o sistema monolítico para uma arquitetura de microsserviço e você é responsável por criar o MVP (produto mínimo viável). https://en.wikipedia.org/wiki/Minimum_viable_product

Seu desafio é: criar uma aplicação com os recursos descritos abaixo. Se você acha que os requisitos não são detalhados o suficiente, deixe um comentário (português ou inglês) e proceda da melhor maneira possível.

Você pode incluir quantos recursos julgar necessários para o MVP. Você será avaliado pela qualidade da sua solução e de código.

Realizar fork deste repositório e realizar desenvolvimento com commits intermediários. Ao final do desenvolvimento, enviar pull request para este repositório.

### Requisitos
* Realizar chamada ao serviço REST viacep abaixo.
* Realizar transformação de JSON para objeto java (classe) com os devidos atributos.
* Realizar teste unitário da solução no código.

######  Deve utilizar
- Java 8.
- Spring boot 2.1.9.RELEASE.

###### Comandos
- mvn spring-boot:run (subir aplicação local).
- mvn test (testes unitários).

Estrutura: viacep.com.br/ws/{}/json/ 
URL exemplo: viacep.com.br/ws/01001000/json/ 
UNICODE: viacep.com.br/ws/01001000/json/unicode/

Exemplo de retorno

    {
      "cep": "01001-000",
      "logradouro": "Praça da Sé",
      "complemento": "lado ímpar",
      "bairro": "Sé",
      "localidade": "São Paulo",
      "uf": "SP",
      "unidade": "",
      "ibge": "3550308",
      "gia": "1004"
    }


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.0.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Using Apache Camel with Spring Boot](https://camel.apache.org/spring-boot)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)


