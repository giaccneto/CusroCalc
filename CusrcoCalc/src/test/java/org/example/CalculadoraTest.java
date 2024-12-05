package org.example;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void setUp(){
        calculadora = new Calculadora();
    }
    @Test
    public void testIfDoisAddDoisEqualsToFour(){
        double a = 2;
        double b = 2;
        double resultadoEsperado = 4;

        double resultadoObtido = calculadora.add(a,b);

        assertEquals(resultadoEsperado, resultadoObtido, 0.001);// O DELTA É UTILIZADO SOMENTE COM NUMEROS FLUTUANTES
    }

    @Test
    public void testIfTwoSubtractTwoEqualsZero(){
        int a = 2;
        int b = 2;
        int resEsperado = 0;
        int resObtido = (int) calculadora.sub(2, 2);

        assertEquals(resEsperado,resObtido);
    }
    @Test
    public void validaSeDoisVezesDoisEQuatro(){

        assertEquals(4, calculadora.multiply(2, 2), 0.01);
    }
}