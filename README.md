\# Jogo de Sudoku em JavaFX



> Um clássico jogo de Sudoku com uma interface gráfica limpa e funcional, construído utilizando Java e a biblioteca JavaFX. O projeto é gerenciado com Apache Maven para fácil compilação e execução.



!\[Screenshot do Jogo](URL\_DA\_SUA\_IMAGEM\_AQUI)



---



\## 📋 Índice



\- \[Sobre o Projeto](#-sobre-o-projeto)

\- \[✨ Funcionalidades](#-funcionalidades)

\- \[🛠️ Tecnologias Utilizadas](#-tecnologias-utilizadas)

\- \[🚀 Como Executar o Projeto](#-como-executar-o-projeto)

&nbsp; - \[Pré-requisitos](#pré-requisitos)

&nbsp; - \[Instalação e Execução](#instalação-e-execução)

\- \[룰 Como Jogar](#-como-jogar)

\- \[📂 Estrutura do Projeto](#-estrutura-do-projeto)

\- \[📄 Licença](#-licença)



---



\## 💻 Sobre o Projeto



Este projeto foi desenvolvido como uma aplicação desktop para jogar Sudoku. Ele apresenta um tabuleiro 9x9 pré-preenchido com um desafio, permitindo que o usuário preencha as células vazias. A aplicação valida as entradas e exibe uma mensagem de conclusão quando o quebra-cabeça é resolvido corretamente.



O foco foi criar uma aplicação robusta, seguindo princípios de separação de responsabilidades (lógica, dados e interface do usuário).



---



\## ✨ Funcionalidades



\-   \*\*Interface Gráfica Intuitiva:\*\* Tabuleiro 9x9 claro e fácil de usar.

\-   \*\*Tabuleiro Pré-definido:\*\* Inicia com um jogo pronto para ser solucionado.

\-   \*\*Validação de Entrada:\*\* Permite apenas a inserção de números de 1 a 9.

\-   \*\*Detecção de Vitória:\*\* Exibe uma mensagem de parabéns ao completar o jogo corretamente.

\-   \*\*Células Não Editáveis:\*\* Os números iniciais do desafio são bloqueados para evitar alterações.



---



\## 🛠️ Tecnologias Utilizadas



O projeto foi construído com as seguintes tecnologias:



\-   \*\*Java 11:\*\* Linguagem de programação principal.

\-   \*\*JavaFX 17:\*\* Biblioteca para a construção da interface gráfica do usuário (GUI).

\-   \*\*Apache Maven:\*\* Ferramenta de automação de compilação e gerenciamento de dependências.



---



\## 🚀 Como Executar o Projeto



Siga os passos abaixo para executar o jogo em sua máquina local.



\### Pré-requisitos



Antes de começar, você precisará ter o seguinte instalado em seu sistema:



\-   \*\*Java Development Kit (JDK) 11 ou superior:\*\* \[Link para download do OpenJDK](https://adoptium.net/)

\-   \*\*Apache Maven:\*\* \[Instruções de instalação](https://maven.apache.org/install.html)

\-   \*\*Git:\*\* \[Instruções de instalação](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)



\### Instalação e Execução



1\.  \*\*Clone o repositório:\*\*

&nbsp;   ```bash

&nbsp;   git clone \[https://github.com/josewilson/sudoku-java-corrigido.git](https://github.com/josewilson/sudoku-java-corrigido.git)

&nbsp;   ```

&nbsp;   \*(Lembre-se de usar a URL do seu próprio repositório se for diferente)\*



2\.  \*\*Navegue até o diretório do projeto:\*\*

&nbsp;   ```bash

&nbsp;   cd sudoku-java-corrigido

&nbsp;   ```



3\.  \*\*Compile e execute a aplicação com Maven:\*\*

&nbsp;   O plugin do JavaFX já está configurado no `pom.xml`, então basta executar o seguinte comando:

&nbsp;   ```bash

&nbsp;   mvn clean javafx:run

&nbsp;   ```

&nbsp;   A aplicação será iniciada e a janela do jogo Sudoku aparecerá.



---



\## 룰 Como Jogar



1\.  A aplicação abrirá com um tabuleiro de Sudoku parcialmente preenchido.

2\.  Clique em uma das células vazias (brancas).

3\.  Digite um número de `1` a `9`.

4\.  Para apagar um número, selecione a célula e pressione a tecla `Backspace`.

5\.  Continue preenchendo até que todas as células estejam corretas. Uma mensagem de sucesso será exibida!



---



\## 📂 Estrutura do Projeto


src/main/java/com/sudoku/
├── SudokuApplication.java       // Ponto de entrada da aplicação JavaFX
├── constants/                   // Enums e constantes, como o estado do jogo
├── domain/                      // Classes de modelo (SudokuGame, Coordinates)
├── logic/                       // Lógica do jogo (regras de validação, etc.)
└── ui/                          // Classes da interface do usuário com JavaFX


O código-fonte está organizado em pacotes para manter uma arquitetura limpa:

