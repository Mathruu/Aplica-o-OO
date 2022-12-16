package Classes;

public class ContaCorrente extends Conta {
    public Double limite;
    public ContaCorrente(String numero, Double limite, Cliente cliente) {
        super(cliente, numero);
        this.limite = limite;
    }

    public void transferir(double valor, Conta conta) {
        if (this.caucularSaldo() <valor) {
            System.out.println("Saldo insuficiente");
        } else {
            this.sacar(valor);
            conta.depositar(valor);
        }
    }

    public Double caucularSaldo() {
        Double somaCreditos = 0.0;
        for (Credito credito : this.credito) {
            somaCreditos += credito.getValor();
        }
        Double somaDebitos = 0.0;
        for (Debito debito : this.debito) {
            somaDebitos += debito.getValor();
        }
        Double saldo = somaCreditos - somaDebitos;
        return saldo + this.limite;
    }
}

