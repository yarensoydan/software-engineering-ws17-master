public class MeterToMillimeter extends LengthConverter {
    public double originalValue;
    public double convertedValue;


    public MeterToMillimeter() {
    }

    public double convert(double inMeters) {

        originalValue=inMeters;
        convertedValue=10000*originalValue;
        return convertedValue;
    }

    public String toString(){
        return originalValue+"Meters ="+convertedValue + "Millimeters";
    }

    public void print(){
        System.out.println(toString());
    }
}

