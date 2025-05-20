public class Aluno extends Pessoa {
    private String matriculaAluno;
    private String serie;

    public Aluno(String nome, String cpf, String dataDeNascimento, String matriculaAluno, String serie) {
        super(nome, cpf, dataDeNascimento);

        this.matriculaAluno = matriculaAluno;
        this.serie = serie;
    }

    public void exibirDadosCompletos() {
        super.exibirDados();
        System.out.println("Você está na " + serie);
        System.out.println("Código de matrícula: " + matriculaAluno);
    }
}