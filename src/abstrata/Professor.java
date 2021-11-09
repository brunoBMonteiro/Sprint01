package abstrata;

public class Professor extends Pessoa {

    private double salario;
    private String universidadeLecionaAula;
    private String nomeCurso;

    public Professor(double salario, String universidadeLecionaAula, String nomeCurso, String nome, String endereco, String telefone, String cpf, String casa){
        super(nome, endereco, telefone, cpf, casa);
        this.salario = salario;
        this.universidadeLecionaAula = universidadeLecionaAula;
        this.nomeCurso = nomeCurso;
    }

    public double getSalario(){
        return salario;
    }

    public String getUniversidadeLecionaAula(){
        return universidadeLecionaAula;
    }

    public String getNomeCurso(){
        return nomeCurso;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setUniversidadeLecionaAula(String universidadeLecionaAula){
        this.universidadeLecionaAula = universidadeLecionaAula;
    }

    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }

    // modificando o comportamento herdado
    // Sobreposição do método da classe pai Pessoa
    public String obterEndereco(){
        String concat = "Endereço do professor: ";
        concat += super.getEndereco();
        return concat;
    }

    // Sobrepor do método da classe pai Pessoa
    public String obterCpf(){
        String concat = "Esse é o cpf professor: ";
        concat += super.getCpf();
        return concat;
    }

    public String obterTelefone(){
        String concat = "O telelefone do Professor é: ";
        concat += super.getTelefone();
        return concat;
    }
}
