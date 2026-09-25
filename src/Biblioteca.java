import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        if (livro == null) {
            throw new IllegalArgumentException("Não é possível adicionar um livro nulo");
        }
        this.livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        if (usuario == null) {
            throw new IllegalArgumentException("Não é possível adicionar um usuário nulo");
        }
        this.usuarios.add(usuario);
    }

    public int getQuantidadeLivros() {
        return this.livros.size();
    }

    public int getQuantidadeUsuarios() {
        return this.usuarios.size();
    }

    public void ListarLivros() {
        if (this.livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado na biblioteca");
        } else {
            System.out.println("--- LISTA DE LIVROS ---");
            for (Livro livro : this.livros) {
                livro.exibirDados();
                System.out.println("-----------");
            }
        }
    }
}
