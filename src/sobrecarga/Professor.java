package sobrecarga;

public class Professor extends Pessoa {

    private double salario;
    private String universidadeLecionaAula;
    private String nomeCurso;


    public Professor(double salario, String universidadeLecionaAula, String nomeCurso, String nome, String endereco, String telefone, String cpf, String casa, String reacao){
        super(nome, endereco, telefone, cpf, casa, reacao);
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


}
