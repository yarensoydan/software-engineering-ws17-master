public class MeterToCentimeter extends  LengthConverter {
    public double originalValue;
    public double convertedValue;

    public MeterToCentimeter() {
    }


    public double convert(double inMeters) {

        originalValue=inMeters;
        convertedValue=100*originalValue;
        return convertedValue;
    }

    public String toString(){
        return originalValue+"Meters ="+convertedValue + "Centimeter";
    }

    public void print(){
        System.out.println(toString());
    }
}
