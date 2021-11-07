public class Aluno extends Pessoa{

    private String curso;
    private String universidadeEstuda;
    private double[] notas;

    public Aluno(String curso, String universidadeEstuda, double[] notas, String nome, String endereco, String telefone, String cpf, String casa){
        super(nome, endereco, telefone, cpf, casa);
        this.curso = curso;
        this.universidadeEstuda = universidadeEstuda;
        this.notas = notas;
    }

    public Aluno() {

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

    // modificando o comportamento herdado
    // Sobrepor do método da classe pai Pessoa
    public String obterEndereco(){
        String concat = "Endereço do aluno: ";
        concat += super.getEndereco();
        return concat;
    }

    // Sobrepor do método da classe pai Pessoa
    public String obterCpf(){
        String concat = "Esse é o cpf aluno: ";
        concat += super.getCpf();
        return concat;
    }


}
