import java.util.ArrayList;

public class Livro {
    private String isbn;
    private String titulo;
    private int anoPublicacao;
    private Autor autor;
    private ArrayList<Exemplar> exemplares;

    public Livro(String isbn, String titulo, int anoPublicacao, Autor autor) {
        if (isbn == null || isbn.trim().isBlank()) {
            throw new IllegalArgumentException("Este campo não pode estar vazio");
        }

        if (titulo == null || titulo.trim().isBlank()) {
            throw new IllegalArgumentException("Este campo não pode estar vazio");
        }

        if (anoPublicacao <= 0) {
            throw new IllegalArgumentException("O ano deve ser maior que zero");
        }

        if (autor == null) {
            throw new IllegalArgumentException("O livro precisa ter um autor associado");
        }

        this.isbn = isbn;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;

        this.exemplares = new ArrayList<>();
    }

    public void adicionarExemplar(String codigo) {
        Exemplar novoExemplar = new Exemplar(codigo);
        this.exemplares.add(novoExemplar);
    }

    public int getQuantidadeExemplares() {
        return this.exemplares.size();
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public Exemplar buscarExemplarDisponivel() {
        for (Exemplar e : this.exemplares) {
            if (e.isDisponivel()) {
                return e;
            }
        }
        return null;
    }

    public void exibirDados() {
        System.out.println("Isbn: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Ano: " + this.anoPublicacao);
        System.out.println("Autor: " + this.autor.getNome());
        System.out.println("Quantidade de Exemplares: " + getQuantidadeExemplares());
    }
}