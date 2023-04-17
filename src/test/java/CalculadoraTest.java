import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	/// Testes de somar
	@Test
	void testSomar() {
		Calculadora calculadora = new Calculadora();
		double numeroUm = 10 , numeroDois = 2;
		assertEquals(12, calculadora.somar(numeroUm, numeroDois));
	}
	
	@Test
	void testSomarDoisNumerosNegativos() {
		Calculadora calculadora = new Calculadora();
		double numeroUm = -2 , numeroDois = -10;
		assertEquals(-12, calculadora.somar(numeroUm, numeroDois));
}
	@Test
	void testSomarNumNegativo() {
		Calculadora calculadora = new Calculadora();
		double numeroUm = 10 , numeroDois = -2;
		assertEquals(8, calculadora.somar(numeroUm, numeroDois));
	
}
	/// Testes de Subtração
	@Test
	void testSubtrair() {
		Calculadora calculadora = new Calculadora();
		double numeroUm = 10 , numeroDois = 2;
		assertEquals(8, calculadora.subtrair(numeroUm, numeroDois));
	}
	
	@Test
	void testSubtrairResultadoNegativo() {
		Calculadora calculadora = new Calculadora();
		double numeroUm = 2 , numeroDois = 10;
		assertEquals(-8, calculadora.subtrair(numeroUm, numeroDois));
}
	
	@Test
	void testSubtrairDoisNumerosNegativos() {
		Calculadora calculadora = new Calculadora();
		double numeroUm = -2 , numeroDois = -10;
		assertEquals(8, calculadora.subtrair(numeroUm, numeroDois));
}
	
	/// Testes de Multiplicação
	
	@Test
	void testMultiplicar() {
		Calculadora calculadora = new Calculadora();
		double numeroUm = 10 , numeroDois = 2;
		assertEquals(20, calculadora.multiplicar(numeroUm, numeroDois));
	}

	@Test
	void testMultiplicarDoisNumerosNegativos() {
		Calculadora calculadora = new Calculadora();
		double numeroUm = -10 , numeroDois= -2;
		assertEquals(20, calculadora.multiplicar(numeroUm, numeroDois));
	}
	@Test
	void testMultiplicarUmNumeroNegativo() {
		Calculadora calculadora = new Calculadora();
		double numeroUm = -10 , numeroDois= 2;
		assertEquals(-20, calculadora.multiplicar(numeroUm, numeroDois));
	}

	/// Testes de Divisão
	
	@Test
	void testDividir() {
		Calculadora calculadora = new Calculadora();
		double numeroUm = 10 , numeroDois = 2;
		assertEquals(5, calculadora.dividir(numeroUm, numeroDois));
	}
	@Test
	void testDividirNumerosNaoDivisiveisInteiramente() {
		Calculadora calculadora = new Calculadora();
		double numeroUm = 10 , numeroDois = 8;
		assertEquals(1.25, calculadora.dividir(numeroUm, numeroDois));
	}
	
	@Test
	void testDividirDoisNumerosNegativos() {
		Calculadora calculadora = new Calculadora();
		double numeroUm = -10 , numeroDois = -2;
		assertEquals(5, calculadora.dividir(numeroUm, numeroDois));
	}
	
	@Test
	void testDividirUmNumeroNegativo() {
		Calculadora calculadora = new Calculadora();
		double numeroUm = 10 , numeroDois = -2;
		assertEquals(-5, calculadora.dividir(numeroUm, numeroDois));
	}
	
	/// Testes de Potência
	
	@Test
	void testPotenciar() {
		Calculadora calculadora = new Calculadora();
		double numeroUm = 10 , numeroDois = 2;
		assertEquals(100, calculadora.potenciar(numeroUm, numeroDois));
	}

	@Test
	void testPotenciarComUmNumNegativo() {
		Calculadora calculadora = new Calculadora();
		double numeroUm = 10 , numeroDois = -2;
		assertEquals(0.01, calculadora.potenciar(numeroUm, numeroDois));
	}

	@Test
	void testPotenciarComDoisNumNegativos() {
		Calculadora calculadora = new Calculadora();
		double numeroUm = -10 , numeroDois = -2;
		assertEquals(0.01, calculadora.potenciar(numeroUm, numeroDois));
	}
}









