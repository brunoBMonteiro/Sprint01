package sobrecarga;

public class Aluno extends Pessoa {

    private String curso;
    private String universidadeEstuda;
    private double[] notas;

    public Aluno(String curso, String universidadeEstuda, double[] notas, String nome, String endereco, String telefone, String cpf, String casa, String reacao){
        super(nome, endereco, telefone, cpf, casa, reacao);
        this.curso = curso;
        this.universidadeEstuda = universidadeEstuda;
        this.notas = notas;
    }

    public String getCurso(){
        return curso;
    }

    public double[] getNotas(){
        return notas;
    }

    public String getUniversidadeEstuda(){
        return universidadeEstuda;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public void setNotas(double[] notas){
        this.notas = notas;
    }

    public void setUniversidadeEstuda(String universidadeEstuda){
        this.universidadeEstuda = universidadeEstuda;
    }


}
