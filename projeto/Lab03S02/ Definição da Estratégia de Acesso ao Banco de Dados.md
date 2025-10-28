# Definição da Estratégia de Acesso ao Banco de Dados

## 1. Objetivo

A estratégia de acesso ao banco de dados tem como objetivo garantir uma comunicação eficiente, segura e desacoplada entre a aplicação e o banco MySQL. O foco é manter uma arquitetura limpa, com responsabilidades bem definidas, facilitando manutenção, testes e futuras evoluções.

## 2. Estratégia Adotada

Será utilizada uma combinação de **ORM (Object-Relational Mapping)** com o **Padrão DAO (Data Access Object)**, implementados por meio do **Spring Data JPA**.

### ORM (Hibernate/JPA)

O ORM permitirá o mapeamento automático das entidades Java para as tabelas do banco MySQL, evitando a necessidade de escrever SQL manualmente. O framework Hibernate, integrado ao Spring Boot via Spring Data JPA, será responsável por essa abstração.

### Padrão DAO

O padrão DAO garante a separação entre a lógica de negócio e o acesso aos dados. Ele será implementado através de **interfaces Repository**, fornecidas pelo Spring Data JPA, que encapsulam todas as operações de persistência (CRUD, consultas e transações).

## 3. Arquitetura de Camadas

A arquitetura segue o padrão de separação em camadas, garantindo modularidade e reuso:

```
Controller  →  Service  →  Repository (DAO)  →  JPA/Hibernate  →  MySQL
```

* **Controller:** camada responsável por receber as requisições HTTP do frontend e enviar as respostas.
* **Service:** contém as regras de negócio e coordena as operações entre controladores e repositórios.
* **Repository (DAO):** camada de acesso a dados, responsável por persistir, buscar e remover informações no banco.
* **Entity:** representação das tabelas do banco em classes Java.

## 4. Tecnologias Utilizadas

* **Spring Boot:** estrutura base do backend.
* **Spring Data JPA:** abstração do padrão DAO.
* **Hibernate:** implementação ORM utilizada pelo JPA.
* **MySQL:** sistema de gerenciamento de banco de dados relacional.
* **Java Persistence API (JPA):** especificação para mapeamento objeto-relacional.

## 5. Funcionamento Geral

1. O frontend realiza uma requisição HTTP (via fetch para `localhost:8080`).
2. O **Controller** recebe a requisição e delega a execução para o **Service**.
3. O **Service** aplica regras de negócio e chama os métodos da camada **Repository**.
4. O **Repository** utiliza o **Spring Data JPA** para interagir com o banco MySQL, convertendo automaticamente as entidades Java em registros nas tabelas.
5. As respostas retornam de forma hierárquica até o frontend.

## 6. Benefícios da Estratégia

* **Desacoplamento:** o acesso ao banco é independente da lógica de negócio.
* **Manutenibilidade:** código mais limpo e organizado, seguindo princípios de separação de responsabilidades.
* **Reuso:** repositórios genéricos podem ser reutilizados em diversas partes do sistema.
* **Portabilidade:** é possível trocar o banco de dados (ex.: de MySQL para PostgreSQL) sem grandes alterações.
* **Produtividade:** o Spring Data JPA gera automaticamente as implementações de CRUD, reduzindo código repetitivo.

## 7. Padrões e Boas Práticas

* Utilização de **interfaces Repository** para implementar o padrão DAO.
* Mapeamento das classes de domínio com **anotações JPA** (`@Entity`, `@Table`, `@Id`, `@GeneratedValue`, etc.).
* Controle de transações com a anotação **`@Transactional`** na camada de serviço.
* Manutenção do princípio **“Service não acessa o banco diretamente”**, garantindo que toda comunicação passe pela camada DAO.
* Organização dos pacotes:

  ```
  com.moedaestudantil.model        → Entidades (ORM)
  com.moedaestudantil.repository   → Repositórios (DAO)
  com.moedaestudantil.service      → Regras de negócio
  com.moedaestudantil.controller   → Endpoints REST
  ```

## 8. Conclusão

A estratégia de acesso ao banco de dados baseada em **ORM com o padrão DAO via Spring Data JPA** oferece uma solução moderna e robusta para o projeto. Ela simplifica o acesso ao MySQL, elimina a necessidade de SQL explícito na aplicação e mantém o código limpo, modular e aderente às boas práticas de arquitetura em aplicações Java Spring Boot.
