public class DollarToTRYConverter extends CurrencyConverter{
    public double originalValue;
    public double convertedValue;

    public DollarToTRYConverter() {
    }

    public double convert(double inDollars) {

        originalValue=inDollars;
        convertedValue=3.83*originalValue;
        return convertedValue;
    }

    public String toString(){
        return originalValue+"USD ="+convertedValue + "CNY";
    }

    public void print(){
        System.out.println(toString());
    }
}
