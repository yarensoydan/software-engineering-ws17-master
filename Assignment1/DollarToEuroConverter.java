public class DollarToEuroConverter extends CurrencyConverter
{

  public double originalValue;
  public double convertedValue;

  public DollarToEuroConverter() {
  }

  public double convert(double inDollars) {

    originalValue=inDollars;
    convertedValue=0.85*originalValue;
    return convertedValue;
  }

  public String toString(){
    return originalValue+"USD ="+convertedValue + "EUR";
  }

  public void print(){
    System.out.println(toString());
  }
}
