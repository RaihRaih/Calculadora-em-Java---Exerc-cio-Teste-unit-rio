package steps;

import io.cucumber.java.pt.*;
import steps.Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraSteps {

    private int resultado;
    private Calculadora calculadora;

    @Dado("que a calculadora está disponível")
    public void calculadoraDisponivel() {
        calculadora = new Calculadora();
    }

    @Quando("calcular {int} e {int} usando {string}")
    public void calcular(int numero1, int numero2, String operacao) {
        resultado = calculadora.calcular(numero1, numero2, operacao);
    }

    @Entao("o resultado deve ser {int}")
    public void verificarResultado(int esperado) {
        assertEquals(esperado, resultado);
    }
}