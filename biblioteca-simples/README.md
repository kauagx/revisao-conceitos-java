# 📚 Sistema de Biblioteca em Java

Este projeto é um sistema simples de **cadastro e gerenciamento de livros**, feito para demonstrar o uso dos **pilares da Programação Orientada a Objetos (POO)** e o **padrão MVC (Model-View-Controller)** em Java.

---

## 🧠 Objetivo do Projeto

Criar um programa que:
- Permita cadastrar livros informando título, autor e ano de publicação;
- Liste os livros cadastrados;
- Utilize o **Scanner** para entrada de dados via console;
- Organize o código utilizando os conceitos de POO e o padrão MVC.


---

## ⚙️ Padrão MVC

O projeto segue o padrão **MVC**, dividido da seguinte forma:

- **Model:**  
  Representa os dados e regras de negócio.  
  Exemplo: `Livro.java` contém os atributos (`titulo`, `autor`, `ano`) e os métodos `get` e `set`.

- **View:**  
  Responsável pela **interação com o usuário** (entrada e saída de dados).  
  Exemplo: `LivroView.java` usa o `Scanner` para ler informações e exibe os resultados no console.

- **Controller:**  
  Faz a **ponte entre o Model e o View**.  
  Exemplo: `LivroController.java` recebe os dados da view, cria objetos `Livro` e armazena em uma lista.

---

## 💡 Pilares da POO Utilizados

1. **Encapsulamento:**  
   Os atributos da classe `Livro` são privados, acessados apenas por meio de getters e setters.

2. **Abstração:**  
   Cada classe tem uma responsabilidade clara e isolada.

3. **Modularização:**  
   O código foi separado em pacotes (`model`, `view`, `controller`) para melhor organização.

4. **Reutilização de código:**  
   O sistema pode ser expandido facilmente, por exemplo, adicionando métodos de busca ou remoção de livros.

---

## 🧰 Tecnologias Utilizadas

- Linguagem: **Java**
- IDE: **VS Code** ou **IntelliJ**
- Entrada de dados: **Scanner**

---

## ▶️ Como Executar

1. Abra o terminal na pasta do projeto;
2. Compile os arquivos Java:

   ```bash
   javac Main.java

 execute o programa java Main

---

 ## ✍️ Exemplo de Execução

 === Sistema de Biblioteca ===
1. Cadastrar livro
2. Listar livros
3. Sair
Escolha uma opção: 1

Digite o título: Dom Casmurro
Digite o autor: Machado de Assis
Digite o ano: 1899

Livro cadastrado com sucesso!