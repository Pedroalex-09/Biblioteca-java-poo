public class Usuario {
    private String matricula;
    private String nome;
    private String email;
    private boolean ativo;

    public Usuario(String matricula, String nome, String email) {
        if(matricula == null || matricula.trim().isBlank()){
            throw new IllegalArgumentException("Este campo não pode estar vazio");
        }

        if(nome == null || nome.trim().isBlank()) {
            throw new IllegalArgumentException("Este campo não pode estar vazio");
        }

        if(email == null || email.trim().isBlank()) {
            throw new IllegalArgumentException("Este campo não pode estar vazio");
        }
        
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.ativo = true;
    }

    public void ativar() {
        this.ativo = true;
    }

    public void desativar() {
        this.ativo = false;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void exibirDados() {
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Ativo: " + (this.ativo ? "Sim" : "Não"));
    }
}

