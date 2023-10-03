package pkg;

public class Empleado {

	public enum TipoEmpleado{Vendedor, Encargado}
	
	float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra){
		
		float salarioBase = 0;
		
		float prima = 0;
		
		final int PRECIO_HE = 30;
		
		if(tipo == TipoEmpleado.Vendedor)
		{
			salarioBase = 2000;	
		}
		else
			if(tipo == TipoEmpleado.Encargado)
			{
				salarioBase = 2500;
			}
		
		if(ventasMes >= 1500)
			prima = 200;
		else
			if(ventasMes >= 1000 && ventasMes < 1500)
				prima = 100;
		
			
		
		return salarioBase + prima + (horasExtra * PRECIO_HE);
	}
	
	float calculoNominaNeta(float nominaBruta) {
		
		float retencion = 0;
		
		if(nominaBruta > 2500)
			retencion = 0.18f;
		else
			if(nominaBruta >2100)
				retencion = 0.15f;
		
		return nominaBruta*(1-retencion);
	}
	
}
