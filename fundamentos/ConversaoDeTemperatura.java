package fundamentos;

public class ConversaoDeTemperatura {
	public static void main(String[] args) {
		final int ConstanteNegativa = -32;
		final double ConstanteDecimal = 5.0/9.0;
		double TemperaturaFahrenheit = 32;				;
		double TemperaturaCelsius = (TemperaturaFahrenheit+ConstanteNegativa)*ConstanteDecimal;
		
		System.out.println(TemperaturaCelsius+"°C");
	}

}
