public class Exemplar {
    private String codigo;
    private boolean disponivel;

    public Exemplar(String codigo) {
        if (codigo == null || codigo.trim().isBlank()) {
            throw new IllegalArgumentException("Este campo não pode estar vazio");
        }

        this.codigo = codigo;
        this.disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String getCodigo() {
        return codigo;
    }

    public void emprestar() {
        if (!this.disponivel) {
            throw new IllegalStateException("O exemplar não esta disponivel");
        }
        this.disponivel = false;
    }

    public void devolver() {
        this.disponivel = true;
    }
}
