public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private Exemplar exemplar;
    private boolean ativo;    

    public Emprestimo(Usuario usuario, Livro livro, Exemplar exemplar) {
        if(usuario == null || livro == null || exemplar == null) {
            throw new IllegalArgumentException("Usuaário, livro e exemplar devem ser informados");
        }

        if (!usuario.isAtivo()) {
            throw new IllegalStateException("O usuaário está inativo e não pode realizar empréstimos");
        }

        if(!exemplar.isDisponivel()) {
            throw new IllegalStateException("O exemplar não está disponível!");
        }

        this.usuario = usuario;
        this.livro = livro;
        this.exemplar = exemplar;

        this.exemplar.emprestar();
        this.ativo = true;
    }

    public void devolver() {
        if (!this.ativo) {
            throw new IllegalStateException("Este empréstimo já foi encerrado ou devolvido!");
        }

        this.exemplar.devolver();
        this.ativo = false;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }
}


