package org.example;

public class Pessoa {

    public String enviarFeedback(String mensagem) {
        return RecursosHumanos.getInstancia().receberFeedbackHead(mensagem);
    }

    public String solicitarFerias(String mensagem) {
        return RecursosHumanos.getInstancia().receberPedidoFeriasHead(mensagem);
    }

    public String enviarSugestao(String mensagem) {
        return RecursosHumanos.getInstancia().receberSugestaoHead(mensagem);
    }


}