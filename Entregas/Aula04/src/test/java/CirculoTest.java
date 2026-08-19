import org.example.Circulo;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;

class CirculoTest {

    @Test
    void calcularAreaDeveRetornarValorCorreto() {
        // ARRANGE: prepara um círculo com raio 5.
        Circulo circulo = new Circulo(5.0);

        // ACT: calcula a área do círculo.
        double area = circulo.calcularArea();

        // ASSERT: área esperada é aproximadamente 78.54.
        assertEquals(78.54, area, 0.01);
    }

    @Test
    void calcularCircunferenciaDeveRetornarValorCorreto() {
        // ARRANGE: prepara um círculo com raio 5.
        Circulo circulo = new Circulo(5.0);

        // ACT: calcula a circunferência.
        double circunferencia = circulo.calcularCircunferencia();

        // ASSERT: circunferência esperada é aproximadamente 31.42.
        assertEquals(31.42, circunferencia, 0.01);
    }

    @Test
    void criarCirculoComRaioZeroDeveLancarExcecao() {
        // ACT + ASSERT: tenta criar um círculo com raio zero.
        IllegalArgumentException excecao = assertThrows(
                IllegalArgumentException.class,
                () -> new Circulo(0.0)
        );

        // ASSERT: verifica a mensagem da exceção.
        assertEquals(
                "O raio deve ser maior que zero.",
                excecao.getMessage()
        );
    }

    @Test
    void criarCirculoComRaioNegativoDeveLancarExcecao() {
        // ARRANGE + ACT + ASSERT:
        // tenta criar um círculo com raio negativo.
        assertThrows(
                IllegalArgumentException.class,
                () -> new Circulo(-5.0)
        );
    }


    @Test
    void construtorDeveInicializarOAttributoRaio() {
        // ARRANGE + ACT: cria um círculo com raio definido.
        Circulo circulo = new Circulo(7.0);

        // ASSERT: verifica se o atributo foi inicializado corretamente.
        assertAll(
                "Dados iniciais do círculo",
                () -> assertEquals(7.0, circulo.getRaio(), 0.001),
                () -> assertTrue(circulo.getRaio() > 0)
        );
    }
}