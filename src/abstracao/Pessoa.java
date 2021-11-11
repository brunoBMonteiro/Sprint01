package abstracao;

public abstract class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String casa;

    public Pessoa(String nome, String endereco, String telefone, String cpf, String casa){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.casa = casa;
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getCpf(){
        return cpf;
    }

    public String getCasa(){
        return casa;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void  setCasa(String casa){
        this.casa = casa;
    }

    public String obterEndereco(){
        return endereco;
    }

    public abstract String obterCpf();

    public String obterTelefone(){
        return telefone;
    }

}

