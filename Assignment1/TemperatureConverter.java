public class TemperatureConverter extends UnitConverter {
    @Override
    public double convert(double inValue) {
        return 0;
    }

    @Override
    public String toString() {
        return "Welcome to Temperature converter";
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}
