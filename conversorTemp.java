class TemperaturaInvalidaException extends Exception {
    public TemperaturaInvalidaException(String message) {
        super(message);
    }
}

class ConversorDeTemperatura {
    public double celsiusParaFahrenheit(double temperaturaCelsius) throws TemperaturaInvalidaException {
        if (temperaturaCelsius < -273.15) {
            throw new TemperaturaInvalidaException("erro: a temperatura não pode ser menor que o zero absoluto (-273.15 °C).");
        }
        return (temperaturaCelsius * 9 / 5) + 32;
    }
}

public class conversorTemp {
    public static void main(String[] args) {
        ConversorDeTemperatura conversor = new ConversorDeTemperatura();
        double temperaturaCelsius = -300;

        try {
            double temperaturaFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);
            System.out.println("temperatura em fahrenheit: " + temperaturaFahrenheit + " °F");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("erro: " + e.getMessage());
        }
    }
}
