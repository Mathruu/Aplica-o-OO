import java.lang.reflect.GenericSignatureFormatError;

import Classes.*;



public class Main {
public static void main(String[] args) {
    // Aplicação 1
    Cargo gerente = new Cargo("Gerente");
    Cargo atendente = new Cargo("Atendente");
    Funcionario funcionario1 = new Funcionario("123.486.789-45", "João", "32988716647", 5000.00, gerente);
    Funcionario funcionario2 = new Funcionario("123.486.789-45", "Maria", "32988716647", 2000.00, atendente);

    // Aplicação 2
    Cliente cliente = new Cliente("124.127.145-14", "jessica", "123456789", true);
    Endereco end1 = new Endereco("36052030", "rua da fe ", "12", "ap 407", "uba", "MG");
    Endereco end2 = new Endereco("36054520", "rua da paz ", "789", "casa 02", "Pedreira", "SP");
    Endereco end3 = new Endereco("47864123", "rua da consagração ", "8791", "", "Sete lagoas", "MG");

    cliente.adicionarEndereco(end1);
    cliente.adicionarEndereco(end2);
    cliente.adicionarEndereco(end3);

    // Aplicação 3
    Cliente cliente2 = new Cliente("124.178.145-28", "jorge", "123456489", true);
    ContaCorrente cc = new ContaCorrente("2456-8", 0.0, cliente2);
    cc.depositar(100);
    cc.depositar(100);
    cc.depositar(100);
    cc.sacar(50);
    cc.caucularSaldo();


    // Aplicação 4
    Cliente cliente3 = new Cliente("124.178.145-78", "jamilton", "1234566489", true);
    ContaCorrente cc1 = new ContaCorrente("2456-8", 0.0, cliente3);
    ContaPoupanca cp1 = new ContaPoupanca("2456-8", 0.0, cliente3);
    cc1.depositar(1000);
    cp1.depositar(1000);
    cc1.transferir(500, cp1);
    }
}



