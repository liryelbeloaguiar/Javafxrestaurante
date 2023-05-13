package poo.restaurante;

public class Pedido {
    public Funcionario garcom = new Funcionario("Liryel",85,"00028922");
    public String nome;


    public Prato prato =  new Prato("merda");
    public Integer quantidade;

    public Pedido() {
        garcom.setNome("Liryel");
        prato.setNome("pIZa");
        prato.setValorPrato(50.0);
    }

    public Double calculaPreco() {
        return this.prato.getValor() * this.quantidade;
    }
}
