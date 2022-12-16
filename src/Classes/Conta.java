package Classes;

import java.util.ArrayList;

abstract class Conta {
    public Cliente cliente;
    public String numero;
    public ArrayList<Credito> credito = new ArrayList<Credito>();
    public ArrayList<Debito> debito = new ArrayList<Debito>();

    public Conta(Cliente cliente, String numero) {
        this.cliente = cliente;
        this.numero = numero;
    }

    public void depositar(double valor) {
        Credito credito = new Credito(valor);
        this.credito.add(credito);
    }

    public void sacar(double valor) {
        Debito debito = new Debito(valor);
        this.debito.add(debito);
    }
}
