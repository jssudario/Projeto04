import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    private static Scanner in = new Scanner(System.in);

    // cadastrar livro
    public static void cadastrar(TreeMap<String, TreeSet<Livro>> biblioteca, String titulo, String autor, int ano) {
        Livro novoLivro = new Livro(titulo, autor, ano);
        biblioteca.computeIfAbsent(autor, _ -> new TreeSet<>()).add(novoLivro); // cria conjunto se autor não existir
    }

    // inserção > título, autor, ano
    public static void adicionarLivroInterativo(TreeMap<String, TreeSet<Livro>> biblioteca) {
        System.out.println("\n- - - - Adicionar novo livro - - - -");

        System.out.print("Título: ");
        String titulo = in.nextLine();

        System.out.print("Autor: ");
        String autor = in.nextLine();

        System.out.print("Ano de publicação: ");
        Integer ano = Integer.valueOf(in.nextLine()); // converte para inteiro

        cadastrar(biblioteca, titulo, autor, ano); // chama método de cadastro
        System.out.println("Livro '" + titulo + "' adicionado com sucesso!");
    }
    
    // lista todos os livros > juntas os conjuntos todos em um treeSet
    public static void imprimirTodosOsLivros(TreeMap<String, TreeSet<Livro>> biblioteca) {
        System.out.println("\n- - - - Todos os livros - - - -");

        TreeSet<Livro> todosOsLivros = new TreeSet<>(); // armazenar todos os livros
        for (TreeSet<Livro> livrosDoAutor : biblioteca.values()) {
            todosOsLivros.addAll(livrosDoAutor); // adiciona os livros de cada autor
        }
        
        if (todosOsLivros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            todosOsLivros.forEach(livro -> System.out.println("- " + livro + " | Autor: " + livro.getAutor()));
        }
    }

    // lista autores e livros > forEach > chave e valor
    public static void imprimirPorAutor(TreeMap<String, TreeSet<Livro>> biblioteca) {
        System.out.println("\n- - - - Autores & Livros - - - -"); 
        biblioteca.forEach((autor, livros) -> {
            System.out.println("Autor: " + autor);
            livros.forEach(livro -> System.out.println("   - " + livro)); // lista livros do autor
        });
    }

    public static void main(String[] args) {
        TreeMap<String, TreeSet<Livro>> biblioteca = new TreeMap<>(); // treeMap > autores em ordem alfabetica

        // cadastro inicial > livros pré-inseridos
        cadastrar(biblioteca, "Noites Brancas", "Fiódor Dostoiévski", 1848);
        cadastrar(biblioteca, "Crime e Castigo", "Fiódor Dostoiévski", 1866);
        cadastrar(biblioteca, "Declínio de um Homem", "Osamu Dazai", 1948);
        cadastrar(biblioteca, "O Conto da Aia", "Margaret Atwood", 1985);
        cadastrar(biblioteca, "Os Testamentos", "Margaret Atwood", 2019);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n- - - - FEIRA DE LIVROS - - - -");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Todos os Livros");
            System.out.println("3. Listar por Autor");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(in.nextLine()); // lê opção do usuário > converte 

                switch (opcao) {
                    case 1 -> adicionarLivroInterativo(biblioteca);
                    case 2 -> imprimirTodosOsLivros(biblioteca);    
                    case 3 -> imprimirPorAutor(biblioteca);         
                    case 4 -> System.out.println("Programa encerrado."); 
                    default -> System.out.println("Opção inválida. Tente novamente."); 
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, digite um número correspondente à opção."); // evita loop em erro de entrada
                opcao = 0;
            }
        }
        in.close(); 
    }
}
