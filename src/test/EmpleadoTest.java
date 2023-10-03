package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado.TipoEmpleado;

class EmpleadoTest {

	TipoEmpleado tipo;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void testCalculoNominaBrutaVendedor() {
		tipo = TipoEmpleado.Vendedor;
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaEncargado() {
		tipo = TipoEmpleado.Encargado;
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaOtro() {
		fail("Not yet implemented");
	}

	@Test
	void testCalculoNominaBrutaVentasNegativas() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasEntre0y1000() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasEntre1000y1500() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasMayor1500() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtrasNegativas() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtrasPositivas() {
		fail("Not yet implemented");
	}
	
}
