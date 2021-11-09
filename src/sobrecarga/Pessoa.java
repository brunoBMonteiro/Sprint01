package sobrecarga;

public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String casa;
    private String reacao;

    public Pessoa(String nome, String endereco, String telefone, String cpf, String casa, String reacao){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.casa = casa;
        this.reacao = reacao;
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

    public String getReacao() {
        return reacao;
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

    public void setReacao(String reacao){
        this.reacao = reacao;
    }

    public String obterEndereco(){
        return endereco;
    }

    public void reacao(String palavra){
        if(palavra.equalsIgnoreCase("Feliz")){
            System.out.println("A pessoa está feliz!");
        }else{
            System.out.println("A pessoa está triste!");
        }
    }

    public void reacao(int hora){
        if(hora >= 8 && hora < 12){
            System.out.println("Continuar trabalhando!");
        }else if(hora >= 12 && hora <= 13){
            System.out.println("Hora do almoço!");
        }else if(hora > 13 && hora <= 15){
            System.out.println("Continuar trabalhando é de tarde!");
        }
    }

    public void reacao(boolean doente){
        if(doente){
            System.out.println("Vá ao médico!");
        }else{
            System.out.println("Vai trabalhar!");
        }
    }


}

