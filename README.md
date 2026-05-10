# 🛠️ HelpDesk System — Java + JDBC + DAO Pattern

Sistema de gerenciamento de chamados (HelpDesk) desenvolvido em **Java** utilizando **JDBC**, **MySQL** e organização profissional em camadas.

Este projeto foi criado com foco em aprendizado prático de:

* Arquitetura de Software
* Persistência de Dados
* DAO Pattern
* Organização profissional de projetos backend
* Preparação para APIs REST

---

## 📌 Sobre o Projeto

O sistema simula um ambiente real de suporte técnico onde usuários podem registrar e gerenciar chamados.

O objetivo principal foi aplicar boas práticas utilizadas no mercado para desenvolvimento backend em Java.

---

## ✨ Funcionalidades

✅ Cadastrar chamado
✅ Listar chamados
✅ Atualizar chamado
✅ Excluir chamado
✅ Persistência em banco MySQL
✅ Separação em camadas (Model / DAO / Service / Application)
✅ Menu interativo via console

---

## 🧱 Arquitetura Utilizada

O projeto segue princípios inspirados em **MVC** e **Clean Architecture**.

### 🔹 Model

Responsável pelas entidades do sistema.

Exemplo:

* Chamado

---

### 🔹 DAO (Data Access Object)

Camada responsável por toda comunicação com o banco de dados.

Responsabilidades:

* INSERT
* SELECT
* UPDATE
* DELETE

---

### 🔹 Service

Camada de regras de negócio.

Responsável por:

* Validar dados
* Controlar operações
* Intermediar Application ↔ DAO

---

### 🔹 Application

Camada responsável pela execução do sistema e interface via terminal.

---

## 📂 Estrutura de Pastas

```
helpdesk/
│
├── src/
│   ├── connection/
│   │   └── ConnectionFactory.java
│   │
│   ├── model/
│   │   └── Chamado.java
│   │
│   ├── dao/
│   │   └── ChamadoDAO.java
│   │
│   ├── service/
│   │   └── ChamadoService.java
│   │
│   └── application/
│       └── Main.java
│
├── database/
│   └── script.sql
│
├── .gitignore
└── README.md
```

---

## 🗄️ Banco de Dados

### Criar o Database

```sql
CREATE DATABASE helpdesk;
```

---

### Criar a Tabela

```sql
CREATE TABLE chamado (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    descricao TEXT NOT NULL,
    status VARCHAR(20) DEFAULT 'ABERTO'
);
```

---

## ⚙️ Tecnologias Utilizadas

* Java
* JDBC
* MySQL
* DAO Pattern
* MVC Concepts
* Git
* GitHub

---

## 🔌 Configuração da Conexão

Arquivo:

```
connection/ConnectionFactory.java
```

Configure conforme seu ambiente:

```java
String URL = "jdbc:mysql://localhost:3306/helpdesk";
String USER = "root";
String PASSWORD = "";
```

---

## 🚀 Como Executar o Projeto

### 1️⃣ Clonar o repositório

```
git clone https://github.com/seu-usuario/helpdesk.git
```

---

### 2️⃣ Abrir na IDE

Pode usar:

* IntelliJ IDEA
* NetBeans
* Eclipse
* VS Code

---

### 3️⃣ Configurar MySQL

Criar o banco e executar o script SQL.

---

### 4️⃣ Executar

Rodar:

```
Main.java
```

---

## 🧠 Conceitos Praticados

* Separação de responsabilidades
* Persistência com JDBC
* Organização em camadas
* CRUD completo
* Boas práticas de backend Java

---

## 🔮 Roadmap (Evolução do Projeto)

Este projeto continuará evoluindo para um sistema completo.

### Backend

* [ ] Transformar em API REST
* [ ] Implementar Spring Boot
* [ ] Validações avançadas
* [ ] Tratamento global de exceções
* [ ] Logs profissionais

### Frontend

* [ ] Integração com HTML + CSS
* [ ] Dashboard Web
* [ ] Consumo via Fetch API

### DevOps

* [ ] Docker
* [ ] Deploy em Cloud
* [ ] CI/CD

---

## 📸 Demonstração

Menu atual via terminal:

```
===== SISTEMA HELP DESK =====
1 - Cadastrar Chamado
2 - Listar Chamados
3 - Atualizar Chamado
4 - Excluir Chamado
0 - Sair
```

---

## 🎯 Objetivo Profissional

Projeto desenvolvido para consolidar conhecimentos em **Desenvolvimento Backend Java** e construção de portfólio para oportunidades de:

* Estágio em Desenvolvimento
* Backend Java Junior
* Engenharia de Software

---

## 👨‍💻 Autor

**Bryan Palacio**

🔗 GitHub: https://github.com/bryanrubinho
🔗 LinkedIn: https://linkedin.com/in/bryan-palácio-rubinho-424b991b8/

---

## ⭐ Status do Projeto

🚧 Em evolução contínua

Novas funcionalidades serão adicionadas conforme avanço dos estudos em backend e APIs.
