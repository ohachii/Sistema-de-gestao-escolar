public class Pessoa{
    private String nome;
    private String cpf;
    private String dataDeNascimento;

    public Pessoa(String nome, String cpf, String dataDeNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;

        if(cpf == null){
            throw new Error("O CPF não pode ser nulo");
        }
    }
    public void exibirDados(){
        System.out.println("O seu nome é: " + nome + "e CPF representado por: " + cpf);
        System.out.println("A sua data de nascimento é " + dataDeNascimento);
    }
}