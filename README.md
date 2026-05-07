# 🛒 Sistema de Compras Online

Sistema de compras online via terminal desenvolvido em Java, com funcionalidades de cadastro de usuário, autenticação, redefinição de senha e exibição de estoque de produtos.

---

## 📋 Funcionalidades

- **Cadastro de usuário** — registro com email, CPF e senha
- **Login com autenticação** — validação de credenciais com limite de tentativas
- **Redefinição de senha** — recuperação via email e CPF cadastrados
- **Exibição de estoque** — listagem dos produtos disponíveis para compra

---

## 🗂️ Estrutura do Projeto

```
sistemacompra/
├── SistemaCompra.java      # Classe principal (main)
├── Estoque.java            # Gerenciamento dos produtos disponíveis
└── services/
    ├── Cadastro.java       # Model com dados do cadastro
    ├── Login.java          # Model com dados do login
    ├── ServiceCadastro.java # Lógica de cadastro
    ├── ServiceLogin.java    # Lógica de autenticação
    └── RedefinirSenha.java  # Lógica de redefinição de senha
```

---

## ▶️ Como executar

### Pré-requisitos

- Java JDK 8 ou superior instalado
- IntelliJ IDEA (ou outra IDE Java)

### Passos

1. Clone ou baixe o repositório
2. Abra o projeto no IntelliJ IDEA
3. Localize a classe `SistemaCompra.java`
4. Clique com o botão direito e selecione **Run 'SistemaCompra.main()'**

---

## 🖥️ Como usar o sistema

Ao iniciar o programa, o usuário verá o menu principal:

```
Olá, bem vindo ao sistema de compras online!

1 - Cadastrar-se agora
2 - Encerrar programa
```

**Fluxo completo:**

1. **Cadastro** — informe email, CPF e senha (a senha deve ser confirmada)
2. **Login** — informe email e senha cadastrados
   - Após 3 tentativas incorretas de email, o programa é encerrado
   - Em caso de senha errada, é possível redefinir a senha ou tentar novamente
3. **Estoque** — após login bem-sucedido, os produtos disponíveis são exibidos

---

## 📦 Produtos no Estoque

| Produto              |
|----------------------|
| iPhone 13            |
| iPhone 13 Pro        |
| iPhone 13 Pro Max    |
| iPhone 14 Pro        |
| iPhone 14 Pro Max    |
| iPhone 15 Pro        |
| iPhone 16 Pro        |
| iPhone 17            |
| iPhone 17 Pro Max    |

---

## 🛠️ Tecnologias utilizadas

- **Java** — linguagem principal
- **Scanner** — leitura de entrada do usuário via terminal
- **ArrayList** — gerenciamento da lista de produtos