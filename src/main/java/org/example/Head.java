package org.example;

public class Head implements cargoDirecao {

    private static Head instancia = new Head();

    private Head() {}

    public static Head getInstancia() {
        return instancia;
    }

    public String receberFeedback(String mensagem) {
        return "O Head analisa seu feedback: " + mensagem;
    }

    public String receberPedidoFerias(String mensagem) {
        return "O Head analisa seu pedido de férias: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Head analisa sua sugestão: " + mensagem;
    }
}