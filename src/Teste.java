public class Teste {
    public static void main(String[] args){

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();


        pessoa.setEndereco("Rua 1, num 10");
        aluno.setEndereco("Rua 2, num 15");
        professor.setEndereco("Rua 3, num 20");

        System.out.println("-------------sobreposição do método ENDERECO-------");
        System.out.println(pessoa.obterEndereco());
        System.out.println(aluno.obterEndereco());
        System.out.println(professor.getEndereco());

        System.out.println("-------------sobreposição do método CPF-------");
        pessoa.setCpf("022.588.414-25");
        aluno.setCpf("965.842.324-29");
        professor.setCpf("964-345-612-30");

        System.out.println(pessoa.obterCpf());
        System.out.println(aluno.obterCpf());
        System.out.println(professor.obterCpf());
    }
}
