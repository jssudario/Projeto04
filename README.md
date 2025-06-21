# Sistema de Gerenciamento para Feira de Livros

**Sistemas de Informação – Estrutura de Dados II**  
**Aluno(a):** Julia Sudário Silva  
**RA:** 007217  

---

Este projeto é um sistema simples em Java para gerenciar e catalogar livros. Ele foi desenvolvido para demonstrar o uso eficiente de `TreeMap` e `TreeSet` para manter listas ordenadas de autores e suas obras.

A classe `Livro` implementa `Comparable` para ordenar os livros pelo título. A classe `Main` utiliza um `TreeMap<String, TreeSet<Livro>>` para associar autores (em ordem alfabética) a um conjunto ordenado de seus livros.

## Funcionalidades

1. **Adicionar Livro:** Cadastra um novo livro com título, autor e ano.  
2. **Listar Todos os Livros:** Exibe todos os livros em ordem alfabética de título.  
3. **Listar por Autor:** Mostra os autores em ordem alfabética, cada um com sua lista de livros também ordenada.  
4. **Sair:** Encerra o programa.

### Exemplo de Saída

```bash
- - - - Autores & Livros - - - -
Autor: Fiódor Dostoiévski
   - Crime e Castigo (1866)
   - Noites Brancas (1848)
Autor: Margaret Atwood
   - O Conto da Aia (1985)
   - Os Testamentos (2019)
Autor: Osamu Dazai
   - Declínio de um Homem (1948)
