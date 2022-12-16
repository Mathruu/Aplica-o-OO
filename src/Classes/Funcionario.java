package Classes;

public class Funcionario extends Pessoa implements IUsuario {
    public Double salario;
    public Cargo cargo;

    public Funcionario(String cpf, String nome, String telefone, Double salario, Cargo cargo) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
        this.cargo = cargo;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Double getSalario() {
        return this.salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Cargo getCargo() {
        return this.cargo;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public boolean estaAutenticado() {
        return true;
    }
}