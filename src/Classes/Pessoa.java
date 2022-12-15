package Classes;
import java.util.ArrayList;
import java.util.List;

abstract class Pessoa {
    public String cpf;
    public String nome;
    public String telefone;
}

class Cliente extends Pessoa implements IUsuario {
    private Boolean vip;
    private List <Endereco> endereco;

    public boolean estaAutenticado() {
        return true;
    }

    public Cliente(String cpf, String nome, String telefone, Boolean vip) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.vip = vip;
        this.endereco = new ArrayList<Endereco>();
    }

    public void adicionarEndereco(Endereco endereco) {
        this.endereco.add(endereco);
    }

    public void listarEnderecos() {
        for (Endereco endereco : this.endereco) {
            System.out.println(endereco);
        }
    }
}

class Funcionario extends Pessoa implements IUsuario {
    private Double salario;
    private Cargo cargo;

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