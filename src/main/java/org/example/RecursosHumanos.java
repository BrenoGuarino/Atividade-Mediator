package org.example;

public class RecursosHumanos {

    private static RecursosHumanos instancia = new RecursosHumanos();

    private RecursosHumanos() {}

    public static RecursosHumanos getInstancia() {
        return instancia;
    }

    public String receberFeedbackHead(String mensagem) {
        return "O Departamento de Recursos Humanos agradece seu contato.\n"+
                "O Head da empresa respondeu seu argumento conforme mensagem a seguir.\n" +
                ">>" + Head.getInstancia().receberFeedback(mensagem);
    }

    public String receberPedidoFeriasHead(String mensagem) {
        return "O Departamento de Recursos Humanos agradece seu contato.\n"+
                "O Head da empresa respondeu seu argumento conforme mensagem a seguir.\n" +
                ">>" + Head.getInstancia().receberPedidoFerias(mensagem);
    }

    public String receberSugestaoHead(String mensagem) {
        return "O Departamento de Recursos Humanos agradece seu contato.\n"+
                "O Head da empresa respondeu seu argumento conforme mensagem a seguir.\n" +
                ">>" + Head.getInstancia().receberSugestao(mensagem);
    }

}