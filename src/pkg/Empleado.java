package pkg;

public class Empleado {

	public enum TipoEmpleado{Vendedor, Encargado, Otro}
	
	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra){
		
		float salarioBase = 0;
		
		float prima = 0;
		
		float extras = 0;
		
		if(horasExtra < 0)
			horasExtra = 0;
		
		if(tipo == TipoEmpleado.Vendedor)
		{
			salarioBase = 2000;	
		}
		else
			if(tipo == TipoEmpleado.Encargado)
			{
				salarioBase = 2500;
			}
			else
				if(tipo == TipoEmpleado.Otro)
					return -1;
		
		if(ventasMes >= 1500)
			prima = 200;
		else
			if(ventasMes >= 1000)
				prima = 100;
		
		extras = horasExtra * 30;
		
		return salarioBase + prima + extras;
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

