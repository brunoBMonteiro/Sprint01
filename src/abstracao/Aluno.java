package abstracao;

public class Aluno extends Pessoa {

    private String curso;
    private String universidadeEstuda;
    private double nota;


    public Aluno(String curso, String universidadeEstuda, double nota, String nome, String endereco, String telefone, String cpf, String casa){
        super(nome, endereco, telefone, cpf, casa);
        this.curso = curso;
        this.universidadeEstuda = universidadeEstuda;
        this.nota = nota;
    }

    public String getCurso(){
        return curso;
    }

    public double getNota(){
        return nota;
    }

    public String getUniversidadeEstuda(){
        return universidadeEstuda;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public void setNotas(double nota){
        this.nota = nota;
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


    public String obterTelefone(){
        String concat = "O telelefone do Aluno é: ";
        concat += super.getTelefone();
        return concat;
    }


}
