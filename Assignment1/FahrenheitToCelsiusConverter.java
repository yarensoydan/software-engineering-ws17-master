public class FahrenheitToCelsiusConverter extends  TemperatureConverter{
    public double originalValue;
    public double convertedValue;


    public FahrenheitToCelsiusConverter() {
    }

    public double convert(double inCelsius) {

        originalValue=inCelsius;
        convertedValue=(originalValue-32)/1.8;
        return convertedValue;
    }

    public String toString(){
        return originalValue+"Fahrenhei ="+convertedValue + "Celsius";
    }

    public void print(){
        System.out.println(toString());
    }
}
