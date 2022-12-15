package Classes;

abstract class Cargo {
    public String nome;
}
// Classe Gerente
class Gerente extends Funcionario {
    private String senha;

    public Gerente(String cpf, String nome, Double salario, Cargo cargo, String senha) {
        super(cpf, nome, senha, salario, cargo);
        this.senha = senha;
    }
    public String getSenha() {
        return this.senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}

class Atendente extends Funcionario {
    private String senha;

    public Atendente(String cpf, String nome,  Double salario, Cargo cargo, String senha) {
        super(cpf, nome, senha, salario, cargo);
        this.senha = senha;
    }
    public String getSenha() {
        return this.senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}




