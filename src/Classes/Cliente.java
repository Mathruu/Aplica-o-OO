package Classes;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa implements IUsuario {
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