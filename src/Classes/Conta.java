package Classes;

abstract class Conta {
    protected String cliente;
    protected String numero;
    protected Credito credito;
    protected Debito debito;
    protected double saldo;
    protected int limite;

    public Conta(String cliente, String numero, Credito credito, Debito debito) {
        this.cliente = cliente;
        this.numero = numero;
        this.credito = credito;
        this.debito = debito;
    }

    public void depositar(double valor) {
        Credito credito = new Credito(valor);
        this.credito.add(credito);
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo - valor < -this.limite) {
            System.out.println("Saldo insuficiente");
        } else {
            Debito debito = new Debito(valor);
            this.debito.add(debito);
            this.saldo -= valor;
        }
    }
}

class ContaCorrente extends Conta {
    public ContaCorrente(String cliente, String numero, Credito credito, Debito debito) {
        super(cliente, numero, credito, debito);
    }
    private double limite;
    private double[] creditos;
    private double[] debitos;

    public void transferir(double valor, Conta conta) {
        if (this.saldo - valor < -this.limite) {
            System.out.println("Saldo insuficiente");
        } else {
            this.sacar(valor);
            conta.depositar(valor);
        }
    }

    public double caucularSaldo() {
        double somaCreditos = 0;
        for (double valor : creditos) {
            somaCreditos += valor;
        }
        double somaDebitos = 0;
        for (double valor : debitos) {
            somaDebitos += valor;
        }
        double saldo = somaCreditos - somaDebitos;
        return saldo += this.limite;
    }
}

class ContaPoupanca extends Conta {
    public ContaPoupanca(String cliente, String numero, Credito credito, Debito debito) {
        super(cliente, numero, credito, debito);
    }
    private double rentabilidadeMensal;
    private Debito[] debitos;

    public Double caucularSaldo() {
        double saldo = 0;
        for (Debito debito : this.debitos) {
            saldo -= debito.getValor();
        }
        return saldo;
    }
}