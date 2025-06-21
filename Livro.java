public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private Integer ano;

    public Livro() {
    }

    public Livro(String titulo, String autor, Integer ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override // mostrar título e ano
    public String toString() { 
        return this.titulo + " (" + this.ano + ")";
    }

    @Override // ordenar livros por título
    public int compareTo(Livro outro) { 
        return this.titulo.compareTo(outro.getTitulo());
    }

}
