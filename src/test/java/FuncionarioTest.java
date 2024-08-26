
import org.example.Funcionario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveEnviarFeedback() {
        Funcionario funcionario = new Funcionario();
        assertEquals("O Departamento de Recursos Humanos agradece seu contato.\nO Head da empresa respondeu seu argumento conforme mensagem a seguir.\n" +
                        ">>O Head analisa seu feedback: Excelente trabalho dos times de desenvolvimento",
                funcionario.enviarFeedback("Excelente trabalho dos times de desenvolvimento"));
    }

    @Test
    void deveSolicitarFerias() {
        Funcionario funcionario = new Funcionario();
        assertEquals("O Departamento de Recursos Humanos agradece seu contato.\nO Head da empresa respondeu seu argumento conforme mensagem a seguir.\n" +
                        ">>O Head analisa seu pedido de férias: Desejo férias em Outubro",
                funcionario.solicitarFerias("Desejo férias em Outubro"));
    }

    @Test
    void deveEnviarSugestao() {
        Funcionario funcionario = new Funcionario();
        assertEquals("O Departamento de Recursos Humanos agradece seu contato.\nO Head da empresa respondeu seu argumento conforme mensagem a seguir.\n" +
                        ">>O Head analisa sua sugestão: Aquirir versão premium de Software",
                funcionario.enviarSugestao("Aquirir versão premium de Software"));
    }

}