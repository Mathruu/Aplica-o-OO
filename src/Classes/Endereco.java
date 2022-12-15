package Classes;

public class Endereco {
    private String cep;
    private String lagradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(String cep, String lagradouro, String numero, String complemento, String cidade, String uf) {
        this.cep = cep;
        this.lagradouro = lagradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String toString () {
        return "CEP: " + this.cep + " Logradouro: " + this.lagradouro + " Número: " + this.numero + " Complemento: " + this.complemento + " Cidade: " + this.cidade + " UF: " + this.uf;
    }
}
