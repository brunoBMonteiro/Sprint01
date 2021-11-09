package sobreposicao;

public class Teste {
    public static void main(String[] args){

        Pessoa pessoa = new Pessoa("Bruno", "Rua 10, num 500", "55 9874 3251", "022.755.910-30","Azul");
        Pessoa aluno = new Aluno("", "", 2.5 ,"" , "" , "" , "" ,"" );
        Pessoa professor = new Professor(2.500, "", "", "", "", "", "","");

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

        System.out.println("-------------sobreposição do método TELEFONE-------");
        pessoa.setTelefone("51 99665 5555");
        aluno.setTelefone("55 66454 55454");
        professor.setTelefone("10 54545 87878");

        System.out.println(pessoa.obterTelefone());
        System.out.println(aluno.obterTelefone());
        System.out.println(professor.obterTelefone());

    }
}
