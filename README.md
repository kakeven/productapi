# 📦 Product API

API REST desenvolvida com Spring Boot para gerenciamento de produtos.  
O projeto segue uma arquitetura em camadas (Controller → Service → Repository), com foco em organização e clareza.

---

## 🚀 Tecnologias utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Jakarta Validation
- Gradle

---

## 📁 Estrutura do projeto

```bash
productapi/
├── controller/     # Camada de entrada (endpoints REST)
├── service/        # Regras de negócio
├── repository/     # Acesso ao banco de dados
├── model/          # Entidades
├── exception/      # Tratamento de erros
└── ProductapiApplication.java

```
---

## 📌 Funcionalidades

- Criar produto  
- Listar todos os produtos  
- Buscar produto por ID  
- Atualizar produto  
- Atualização parcial  
- Deletar produto  

---

## 🔗 Endpoints

### Criar produto

POST /produtos


### Listar produtos

GET /produtos


### Buscar por ID

GET /produtos/{id}


### Atualizar produto

PUT /produtos/{id}


### Atualização parcial

PATCH /produtos/{id}


### Deletar produto

DELETE /produtos/{id}


---

## ▶️ Como executar

```bash
./gradlew bootRun

ou

gradle bootRun

A API estará disponível em:

http://localhost:8080
