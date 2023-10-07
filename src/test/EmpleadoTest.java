package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado.TipoEmpleado;
import pkg.Empleado;

class EmpleadoTest {

	TipoEmpleado tipo;

	float ventasMes;
	float horasExtra;
	
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
        ventasMes = 0;
        horasExtra = 0;

        float expected = 2000;
        
        Empleado empleado = new Empleado();
        float actual = empleado.calculoNominaBruta(tipo, ventasMes, horasExtra);

        assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEncargado() {
		tipo = TipoEmpleado.Encargado;
        ventasMes = 0;
        horasExtra = 0;

        float expected = 2500;
        
        Empleado empleado = new Empleado();
        float actual = empleado.calculoNominaBruta(tipo, ventasMes, horasExtra);

        assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaOtro() {
		tipo = TipoEmpleado.Otro;
	    ventasMes = 0;
	    horasExtra = 0;

	    float expected = -1;
	    
	    Empleado empleado = new Empleado();
	    float actual = empleado.calculoNominaBruta(tipo, ventasMes, horasExtra);
	    assertEquals(expected, actual);
	    
	}

	@Test
	void testCalculoNominaBrutaVentasNegativas() {
		tipo = TipoEmpleado.Vendedor;
	    ventasMes = -500;
	    horasExtra = 0;

	    float expected = 2000;
	    
	    Empleado empleado = new Empleado();
	    float actual = empleado.calculoNominaBruta(tipo, ventasMes, horasExtra);
	    assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaVentasEntre0y1000() {
		tipo = TipoEmpleado.Vendedor;
	    ventasMes = 500;
	    horasExtra = 0;

	    float expected = 2000;
	    
	    Empleado empleado = new Empleado();
	    float actual = empleado.calculoNominaBruta(tipo, ventasMes, horasExtra);
	    assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaVentasEntre1000y1500() {
		tipo = TipoEmpleado.Vendedor;
	    ventasMes = 1200;
	    horasExtra = 0;

	    float expected = 2100;
	    
	    Empleado empleado = new Empleado();
	    float actual = empleado.calculoNominaBruta(tipo, ventasMes, horasExtra);
	    assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaVentasMayor1500() {
		tipo = TipoEmpleado.Vendedor;
	    ventasMes = 1600;
	    horasExtra = 0;

	    float expected = 2200;
	    
	    Empleado empleado = new Empleado();
	    float actual = empleado.calculoNominaBruta(tipo, ventasMes, horasExtra);
	    assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtrasNegativas() {
		tipo = TipoEmpleado.Vendedor;
	    ventasMes = 0;
	    horasExtra = -10;

	    float expected = 2000;
	    
	    Empleado empleado = new Empleado();
	    float actual = empleado.calculoNominaBruta(tipo, ventasMes, horasExtra);
	    assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtrasPositivas() {
		tipo = TipoEmpleado.Vendedor;
	    ventasMes = 0;
	    horasExtra = 10;

	    float expected = 2300;
	    
	    Empleado empleado = new Empleado();
	    float actual = empleado.calculoNominaBruta(tipo, ventasMes, horasExtra);
	    assertEquals(expected, actual);
	}
	
}
