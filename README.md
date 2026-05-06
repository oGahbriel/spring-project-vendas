***

# Sistema de Compras

## 📝 Descrição
O **Sistema de Compras** é uma aplicação web desenvolvida em Java utilizando o framework Spring Boot. O objetivo do sistema é registrar e calcular operações de vendas/compras. Ele recebe dados inseridos pelo utilizador (nome do cliente, produto, quantidade e valor unitário) e, através de uma interface web responsiva, calcula e exibe:
* Valor Bruto da compra
* Desconto aplicado
* Valor Final
* Classificação da venda

## 🚀 Tecnologias Utilizadas
* **Java** (Linguagem principal)
* **Spring Boot** (Framework base)
* **Spring Web MVC** (Para roteamento e controlo)
* **Thymeleaf** (Motor de templates para renderização do HTML)
* **Maven** (Gestor de dependências e build)
* **HTML5 / CSS3** (Estruturação e estilização da interface)

## 📁 Estrutura do Projeto
O projeto segue o padrão MVC (Model-View-Controller) do Spring Boot:
* `src/main/java/br/edu/ifsp/SistemaDeCompras/controller/`: Controladores da aplicação, responsáveis por receber as requisições e processar os dados.
* `src/main/java/br/edu/ifsp/SistemaDeCompras/model/`: Classes de domínio/modelo, responsáveis pelas regras de negócio e estrutura de dados.
* `src/main/resources/templates/`: Ficheiros de visualização HTML usando Thymeleaf (ex: `index.html`).
* `src/main/resources/static/`: Ficheiros estáticos, como folhas de estilo (`style.css`).


