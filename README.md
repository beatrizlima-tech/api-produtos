# 📦 API Produtos

![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge\&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.x-green?style=for-the-badge\&logo=springboot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue?style=for-the-badge\&logo=postgresql)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-85EA2D?style=for-the-badge\&logo=swagger)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge\&logo=apachemaven)
![License](https://img.shields.io/badge/license-MIT-lightgrey?style=for-the-badge)

---

# 📌 Sobre o projeto

A **API Produtos** é uma aplicação backend desenvolvida com **Java**, **Spring Boot** e **PostgreSQL** para gerenciamento de produtos através de uma API REST.

O projeto foi desenvolvido com foco na construção de APIs, integração com banco de dados relacional utilizando JDBC, documentação com Swagger/OpenAPI e comunicação com aplicações frontend desenvolvidas em Angular.

---

# 🚀 Funcionalidades

* Cadastro de produtos
* Consulta de produtos por nome
* Persistência em PostgreSQL
* API REST desenvolvida com Spring Boot
* Documentação da API via Swagger/OpenAPI
* Configuração de CORS para integração com aplicações frontend

> **Observação:** As operações de atualização e exclusão já possuem endpoints definidos e estão previstas para evolução do projeto.

---

# 🧱 Tecnologias utilizadas

* Java 21
* Spring Boot
* Spring Web MVC
* PostgreSQL
* JDBC
* Swagger / OpenAPI
* Maven
* REST API

---

# 🏗️ Estrutura do projeto

```text
src/main/java/br/com/cotiinformatica/produtos_api/

├── configurations
├── controllers
├── dtos
├── entities
├── factories
└── repositories
```

---

# 🔗 Endpoints

| Método | Endpoint                   | Descrição          |
| ------ | -------------------------- | ------------------ |
| POST   | `/api/v1/produtos/criar`   | Cadastrar produto  |
| GET    | `/api/v1/produtos/listar`  | Consultar produtos |
| PUT    | `/api/v1/produtos/alterar` | Endpoint previsto  |
| DELETE | `/api/v1/produtos/excluir` | Endpoint previsto  |

---

# ⚙️ Como executar o projeto

## 1. Clone o repositório

```bash
git clone https://github.com/beatrizlima-tech/produtos-api.git
```

## 2. Crie o banco de dados

Crie o banco PostgreSQL e execute o script SQL disponível no projeto.

## 3. Configure a conexão

Caso necessário, ajuste as credenciais da classe:

```text
ConnectionFactory.java
```

## 4. Execute a aplicação

```bash
mvn spring-boot:run
```

---

# 🗄️ Banco de dados

Tabela principal:

```sql
CREATE TABLE produtos(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    descricao TEXT NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    quantidade INTEGER NOT NULL,
    data_cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_atualizacao TIMESTAMP,
    data_exclusao TIMESTAMP,
    ativo INT DEFAULT 1
);
```

Banco utilizado:

```text
PostgreSQL
```

---

# 📖 Documentação

Após executar a aplicação:

```text
http://localhost:8081/swagger-ui.html
```

---

# 🌐 Integração com Frontend

Este projeto possui integração com a aplicação Angular:

**Web Produtos**

https://github.com/beatrizlima-tech/web-produto

---

# 📚 Conceitos aplicados

* Programação Orientada a Objetos
* API REST
* JDBC
* PostgreSQL
* DTO Pattern
* Arquitetura em Camadas
* Swagger/OpenAPI
* Integração Frontend × Backend

---

# 📌 Melhorias futuras

* Implementar atualização de produtos
* Implementar exclusão lógica
* Adicionar camada de serviços
* Migrar para Spring Data JPA
* Criar testes automatizados
* Dockerizar a aplicação

---

# 👩‍💻 Autora

Desenvolvido por **Beatriz Lima**

🔗 GitHub
https://github.com/beatrizlima-tech

💼 LinkedIn
https://www.linkedin.com/in/beatrizlima-tech
