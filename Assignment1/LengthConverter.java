public class LengthConverter extends UnitConverter {
    @Override
    public double convert(double inValue) {
        return 0;
    }

    @Override
    public String toString() {
        return "Welcome to Length converter";
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}
