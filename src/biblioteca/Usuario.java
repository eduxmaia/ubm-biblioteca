package biblioteca;

public class Usuario {
    private String nome;
    private String matricula;
    private String curso;
    private String email;

    public Usuario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Usuario(String nome, String matricula, String curso) {
        this(nome, matricula);
        this.curso = curso;
    }

    public Usuario(String nome, String matricula, String curso, String email) {
        this(nome, matricula);
        this.curso = curso;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirFicha() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Curso: " + getCurso());
        System.out.println("E-mail: " + getEmail());
        System.out.println();
    }
}