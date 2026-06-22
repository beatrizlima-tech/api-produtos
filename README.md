# 📦 API Produtos

API REST desenvolvida com **Java, Spring Boot e PostgreSQL** para gerenciamento de produtos, seguindo arquitetura em camadas e boas práticas de desenvolvimento backend.

A aplicação disponibiliza endpoints para cadastro, consulta, atualização e exclusão de produtos, utilizando **Spring Data JPA**, tratamento de exceções customizadas e documentação automática com **Swagger/OpenAPI**.

---

## 🚀 Tecnologias Utilizadas

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.x-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-Persistence-success)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-brightgreen)
![Maven](https://img.shields.io/badge/Maven-Build-red)

---

## 🎯 Objetivo do Projeto

Desenvolver uma API REST para gerenciamento de produtos aplicando conceitos fundamentais do ecossistema Spring Boot, incluindo:

* Arquitetura em camadas
* Persistência de dados com JPA
* Integração com PostgreSQL
* DTOs para transferência de dados
* Tratamento de exceções
* Documentação de endpoints
* Integração com aplicação frontend Angular

---

## 🏗️ Arquitetura da Solução

```text
Frontend Angular
        │
        ▼
API REST Spring Boot
        │
        ▼
Service Layer
        │
        ▼
Spring Data JPA
        │
        ▼
PostgreSQL
```

---

## ✨ Funcionalidades

### Produtos

* Cadastro de produtos
* Consulta de todos os produtos
* Consulta de produto por ID
* Atualização de produtos
* Exclusão de produtos

### Recursos Técnicos

* DTOs para entrada e saída de dados
* Tratamento de exceções customizadas
* Configuração de CORS
* Documentação Swagger/OpenAPI
* Persistência com Spring Data JPA
* Organização em camadas

---

## 📂 Estrutura do Projeto

```text
src
├── configurations
│   ├── CorsConfiguration
│   ├── ObjectMapperConfiguration
│   └── SwaggerConfiguration
│
├── controllers
│   └── ProdutosController
│
├── dtos
│   ├── ProdutoRequestDto
│   └── ProdutoResponseDto
│
├── entities
│   └── Produto
│
├── enums
│   └── Categoria
│
├── exceptions
│   └── ProdutoNaoEncontradoException
│
├── factories
│   └── ConnectionFactory
│
├── repositories
│   └── ProdutoRepository
│
├── services
│   └── ProdutoService
│
└── sql
    └── Script de criação da tabela
```

---

## 🔗 Endpoints

### Criar Produto

```http
POST /api/v1/produtos
```

### Atualizar Produto

```http
PUT /api/v1/produtos/{id}
```

### Excluir Produto

```http
DELETE /api/v1/produtos/{id}
```

### Consultar Todos

```http
GET /api/v1/produtos
```

### Consultar Por ID

```http
GET /api/v1/produtos/{id}
```

---

## 📝 Exemplo de Requisição

```json
{
  "nome": "Notebook Dell",
  "preco": 4500.00,
  "quantidade": 2
}
```

---

## 📤 Exemplo de Resposta

```json
{
  "id": 1,
  "nome": "Notebook Dell",
  "preco": 4500.00,
  "quantidade": 2,
  "total": 9000.00
}
```

---

## 🗄️ Banco de Dados

O projeto utiliza PostgreSQL para persistência dos dados.

### Estrutura principal

```sql
CREATE TABLE produtos (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    quantidade INTEGER NOT NULL
);
```

O script completo encontra-se na pasta:

```text
src/main/java/br/com/cotiinformatica/api_produtos/sql
```

---

## 📖 Documentação da API

A aplicação possui integração com Swagger/OpenAPI para facilitar testes e validação dos endpoints.

Após executar o projeto, acesse:

```text
/swagger-ui/index.html
```

---

## 🌐 Integração Frontend

Esta API é consumida pela aplicação Angular:

➡️ https://github.com/beatrizlima-tech/web-produtos

O frontend permite:

* Cadastro de produtos
* Consulta em tabela
* Atualização de registros
* Exclusão de produtos
* Interface responsiva

---

## 📚 Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* Arquitetura em Camadas
* API REST
* DTO Pattern
* Repository Pattern
* Exception Handling
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Integração Frontend e Backend

---

## 👩‍💻 Desenvolvido por

**Beatriz Lima**

Desenvolvedora Java Full Stack em formação, com foco em desenvolvimento backend utilizando Java, Spring Boot, APIs REST, bancos de dados relacionais e integração com aplicações frontend.
