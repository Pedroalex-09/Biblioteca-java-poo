public class Autor {
    private String codigo;
    private String nome;
    private String nacionalidade;

    public Autor(String codigo, String nome, String nacionalidade) {
        if (codigo == null || codigo.trim().isBlank()) {
            throw new IllegalArgumentException("Este campo não pode estar vazio");
        }

        if (nome == null || nome.trim().isBlank()) {
            throw new IllegalArgumentException("Este campo não pode estar vazio");
        }

        if (nacionalidade == null || nacionalidade.trim().isBlank()) {
            throw new IllegalArgumentException("Este campo não pode estar vazio");
        }

        this.codigo = codigo;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Este campo não pode estar vazia");
        }
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        if (nacionalidade == null || nacionalidade.trim().isEmpty()) {
            throw new IllegalArgumentException("A nacionalidade do autor não pode ser vazia");
        }

        this.nacionalidade = nacionalidade;
    }

    public void exibirDados() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Nacionalidade: " + this.nacionalidade);
    }
}

//Resposta da pergunta "o código do autor deveria mudar epois da criação do objeto?": Não, o código exerce papel de identificador único. Logo se a sua existência passar a ser algo flexível, facilitará a ocorrência de inconsistências no registro dos mesmo.

//Resposta da pergunta "Porque a validação deve ficar dentro da própria classe e não diretamente no código que cria o autor?": Pois o princípio do encapsulamento e consistência do objeto dizem que a classe deve ser responsável por garantir a integridade dos seus próprios dados. Desta forma, tanto a criação do objeto quanto a validação de seus dados funcionam em conjunto e de forma independente de demais pontos externos. 