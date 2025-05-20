public class Funcionario extends Pessoa {
    private String matriculaFuncional;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cpf, String dataDeNascimento, String matriculaFuncional, String cargo, double salario) {
        super(nome, cpf, dataDeNascimento);
        this.matriculaFuncional = matriculaFuncional;
        this.cargo = cargo;
        this.salario = salario;

        if(salario<=0){
            throw new Error("O salário deve ser maior que 0");
        }
        if(matriculaFuncional == null){
            throw new Error("A matrícula não pode ser nula");
        }
    }
    public void exibirDadosCompletos(){
        super.exibirDados();
        System.out.println("A sua matrícula: " + matriculaFuncional);
        System.out.println("O seu cargo é: " + cargo);
        System.out.println("O seu salário é: " + salario);
    }
}