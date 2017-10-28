public class DollarToCNYConverter extends  CurrencyConverter {

    public double originalValue;
    public double convertedValue;

    public DollarToCNYConverter() {
    }


    public double convert(double inDollars) {

        originalValue=inDollars;
        convertedValue=6.65*originalValue;
        return convertedValue;
    }

    public String toString(){
        return originalValue+"USD ="+convertedValue + "CNY";
    }

    public void print(){
        System.out.println(toString());
    }
}
