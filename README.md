# 📦 API Produtos

API REST para gerenciamento de produtos desenvolvida com Java, Spring Boot e PostgreSQL.

O projeto foi construído seguindo arquitetura em camadas, aplicando boas práticas de desenvolvimento backend, separação de responsabilidades e utilização de DTOs para comunicação entre cliente e servidor.

---

## 🚀 Tecnologias Utilizadas

* Java 21
* Spring Boot 4
* Spring Data JPA
* PostgreSQL
* Maven
* Swagger / OpenAPI
* Lombok

---

## 📁 Estrutura do Projeto

```text
src
├── configurations
├── controllers
├── dtos
├── entities
├── enums
├── exceptions
├── factories
├── repositories
├── services
└── sql
```

### Camadas

**Controllers**

* Recebem as requisições HTTP
* Retornam respostas para o cliente

**Services**

* Contêm as regras de negócio da aplicação

**Repositories**

* Responsáveis pela comunicação com o banco de dados

**DTOs**

* Objetos utilizados para entrada e saída de dados

**Entities**

* Representação das tabelas do banco de dados

**Exceptions**

* Tratamento de erros personalizados

**Configurations**

* Configurações de Swagger, CORS e serialização JSON

---

## ⚙️ Funcionalidades

### Criar produto

```http
POST /api/v1/produtos
```

### Atualizar produto

```http
PUT /api/v1/produtos/{id}
```

### Excluir produto

```http
DELETE /api/v1/produtos/{id}
```

### Consultar todos os produtos

```http
GET /api/v1/produtos
```

### Consultar produto por ID

```http
GET /api/v1/produtos/{id}
```

---

## 📊 Exemplo de Resposta

```json
{
  "id": 1,
  "nome": "Notebook",
  "preco": 4500.00,
  "quantidade": 2,
  "total": 9000.00
}
```

---

## 🗄️ Banco de Dados

O projeto utiliza PostgreSQL.

Script SQL disponível em:

```text
src/main/java/br/com/cotiinformatica/api_produtos/sql
```

---

## 📖 Documentação

A API possui documentação Swagger/OpenAPI configurada para facilitar testes e integração dos endpoints.

---

## 🎯 Objetivos do Projeto

* Praticar desenvolvimento de APIs REST
* Aplicar arquitetura em camadas
* Utilizar Spring Data JPA
* Trabalhar com PostgreSQL
* Implementar tratamento de exceções
* Consumir a API através de uma aplicação Angular

---

## 👩‍💻 Desenvolvido por

Beatriz Lima

Desenvolvedora Java Full Stack em formação, com foco em desenvolvimento backend utilizando Java, Spring Boot, APIs REST e bancos de dados relacionais.
