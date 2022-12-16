package Classes;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numero, Double rentabilidade, Cliente cliente) {
        super(cliente, numero);
        this.rentabilidadeMensal = rentabilidade;
    }
    private double rentabilidadeMensal;


    public Double caucularSaldo() {
        Double somaCreditos = 0.0;
        for (Credito credito : this.credito) {
            somaCreditos += credito.getValor();
        }
        Double somaDebitos = 0.0;
        for (Debito debito : this.debito) {
            somaDebitos += debito.getValor();
        }
        return somaCreditos - somaDebitos;
        
    }
}

