# Order Management System API

[![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen?style=for-the-badge&logo=springboot)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Ready-blue?style=for-the-badge&logo=postgresql)](https://www.postgresql.org/)

Este projeto consiste em uma API RESTful completa, desenvolvida com o ecossistema Spring Boot, voltada para a gestão de operações de e-commerce. A implementação prioriza a escalabilidade, a manutenibilidade e a aplicação rigorosa de regras de negócio fundamentadas em modelagem relacional.

---

## Diferenciais Técnicos

A aplicação demonstra o domínio de conceitos avançados de Engenharia de Software e Análise de Sistemas:

* **Mapeamento Objeto-Relacional (ORM):** Implementação de associações complexas, incluindo relacionamentos Muitos-para-Muitos e Um-para-Um, com gestão de referências cíclicas via Jackson.
* **Arquitetura em Camadas:** Estruturação do projeto seguindo os padrões de Controller, Service e Repository, garantindo o desacoplamento e a testabilidade do código.
* **Tratamento Global de Exceções:** Padronização de respostas de erro HTTP (400, 404, 500) por meio de um Handler centralizado, assegurando previsibilidade para o consumo da API.
* **Otimização de Performance:** Emprego de métodos como `getReferenceById` para otimizar o ciclo de vida das entidades JPA durante operações de atualização.
* **Perfis de Configuração:** Isolamento de ambientes de teste (H2) e desenvolvimento (PostgreSQL) através de perfis específicos.

---

## Tecnologias Utilizadas

* **Linguagem:** Java 21
* **Framework:** Spring Boot 3.x
* **Persistência:** Spring Data JPA / Hibernate
* **Bancos de Dados:** H2 (Testes) e PostgreSQL (Produção)
* **Gerenciador de Dependências:** Maven

---

## Estrutura do Projeto

```text
src/main/java/com/educandoweb/course/
├── entities/     # Entidades JPA e mapeamento relacional
├── repositories/ # Interfaces de acesso a dados (JPA)
├── services/     # Camada de lógica de negócio e regras operacionais
├── resources/    # REST Controllers e exposição de Endpoints
├── config/       # Configurações de infraestrutura e Seed de dados
└── exceptions/   # Gestão de exceções e respostas de erro customizadas
```

## Modelagem de Dados
O sistema foi estruturado com base em uma modelagem de domínio robusta para garantir a integridade das informações.

## Modelo Conceitual (Domain Model)

## Instância do Domínio (Domain Instance)

## Relacionamentos de Entidades
Usuário e Pedido: Associação de um para muitos.
Pedido e Item de Pedido: Composição de itens dentro de uma ordem de venda.
Produto e Categoria: Relacionamento muitos para muitos para classificação de catálogo.
Pedido e Pagamento: Associação um para um para registro de transação financeira.

## Execução da Aplicação
**Pré-requisitos:**
Java JDK 21 ou superior.
Maven 3.8 ou superior.
Git para controle de versão.

## Instruções de Instalação
Clonar o repositório: git clone https://github.com/seu-usuario/repositorio.git
Acessar o diretório do projeto: cd nome-do-projeto
Realizar o build do projeto: mvn clean install
Executar a aplicação: mvn spring-boot:run
*A API estará operando no endereço padrão: http://localhost:8080.*

## Endpoints Principais
Gestão de Usuários (/users)
GET /users - Recuperação de todos os registros de usuários.
GET /users/{id} - Consulta de usuário por identificador único.
POST /users - Persistência de um novo usuário.
PUT /users/{id} - Atualização de dados cadastrais (Otimizado com getReferenceById).
DELETE /users/{id} - Exclusão de registro com validação de integridade.

## Pedidos e Catálogo
**GET /orders -** Listagem de ordens de serviço e status.
**GET /products -** Consulta ao catálogo de produtos.
**GET /categories -** Consulta às categorias cadastradas.

## Autor
Ryan Ricardo Nunes Tavares
