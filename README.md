







---

# 🎮 Jogo de Sudoku em JavaFX

Aplicativo desktop clássico de Sudoku com interface gráfica, desenvolvido em **Java 11** e **JavaFX 17**, utilizando **Apache Maven** para gerenciamento de dependências e execução.  
Projeto criado durante o Bootcamp **GFT Start#7 (DIO)** com foco em lógica de programação, separação de responsabilidades e boas práticas de desenvolvimento.

!\[Screenshot do Jogo](https://github.com/josewilson/Jogo_Sudoku_Game/blob/main/screenshot.png))
---

## 📋 Índice
- [💻 Sobre o Projeto](#-sobre-o-projeto)  
- [✨ Funcionalidades](#-funcionalidades)  
- [🛠️ Tecnologias Utilizadas](#-tecnologias-utilizadas)  
- [🚀 Como Executar o Projeto](#-como-executar-o-projeto)  
  - [Pré-requisitos](#pré-requisitos)  
  - [Instalação e Execução](#instalação-e-execução)  
- [🎯 Como Jogar](#-como-jogar)  
- [📂 Estrutura do Projeto](#-estrutura-do-projeto)  
- [👨‍💻 Autor](#-autor)  
- [📄 Licença](#-licença)  



---

## 💻 Sobre o Projeto
Este projeto implementa um jogo de Sudoku em desktop com um tabuleiro **9x9** pré-definido.  
O usuário pode preencher as células vazias, e o sistema valida automaticamente cada jogada.  
Ao finalizar corretamente, uma mensagem de vitória é exibida.  

O design segue princípios de **responsabilidade separada**:  
- **Model** → regras e lógica do Sudoku  
- **View** → interface gráfica com JavaFX  
- **Controller** → integração entre regras e UI  

---

## ✨ Funcionalidades
- 🎨 **Interface gráfica intuitiva** com JavaFX  
- 🧩 **Tabuleiro 9x9 pré-carregado** com desafio inicial  
- ⛔ **Células fixas bloqueadas** (não editáveis)  
- 🔢 **Validação automática** de entradas (1–9)  
- 🏆 **Mensagem de vitória** ao completar corretamente  

---

## 🛠️ Tecnologias Utilizadas
- ☕ **Java 11**  
- 🎨 **JavaFX 17**  
- 📦 **Apache Maven**  

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
Instale em sua máquina:  
- **Java Development Kit (JDK) 11 ou superior** → [Download OpenJDK](https://adoptium.net/)  
- **Apache Maven** → [Instruções de instalação](https://maven.apache.org/install.html)  
- **Git** → [Instruções de instalação](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)  

### Instalação e Execução
1. Clone o repositório:  
   ```bash
   git clone https://github.com/josewilson/Jogo_Sudoku_Game.git

2. Entre no diretório do projeto:
   ```bash
   cd Jogo_Sudoku_Game

3. Compile e execute:
   ```bash
   mvn clean javafx:run

## 🎯 Como Jogar

1. O tabuleiro abre parcialmente preenchido.

2. Clique em uma célula vazia e insira um número de 1 a 9.

3. Para apagar, selecione a célula e pressione Backspace.

4. Continue preenchendo até que todas as células estejam corretas.

5. Uma mensagem de “Parabéns” será exibida ao completar o jogo.


## 📂 Estrutura do Projeto
- 📂 src/ → Código-fonte (Model, View, Controller)  
- 📜 pom.xml → Configuração do Maven  
- 📜 README.md → Documentação  


 ## 👨‍💻 Autor

José Wilson – Desenvolvedor Backend Júnior
-📌 [LinkedIn](https://www.linkedin.com/in/jose-wilson-alves-de-souza/)
-📌 [GitHub](https://github.com/josewilson)

⭐ Se este projeto foi útil para você, não esqueça de deixar sua estrela!

## 📄 Licença

Este projeto é de uso **educacional** e pode ser utilizado para estudos, testes e aprimoramento.







