public class CelsiusToFahrenheitConverter extends TemperatureConverter {
    public double originalValue;
    public double convertedValue;


    public CelsiusToFahrenheitConverter() {
    }


    public double convert(double inCelsius) {

        originalValue=inCelsius;
        convertedValue=32+1.8*originalValue;
        return convertedValue;
    }

    public String toString(){
        return originalValue+"Celsius ="+convertedValue + "Fahrenhei";
    }

    public void print(){
        System.out.println(toString());
    }
}
