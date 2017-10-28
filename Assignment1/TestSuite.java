import TinyTestJ.Test;
import static TinyTestJ.Assert.*;

public class TestSuite {
  @Test public static void DETest1() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(10000);
    assertEquals(8500,result,0.001);
  }
  @Test public static void DETest2() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(-1);
    assertEquals(1,result,0.001);
  }
  @Test public static void DETest3(){
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(0);
    assertEquals(0,result,0.001);
  }
  @Test public static void DETest4() {
    UnitConverter test = new DollarToCNYConverter();
    double result = test.convert(10000);
    assertEquals(66500,result,0.001);
  }
  @Test public static void DETest5() {
    UnitConverter test = new DollarToCNYConverter();
    double result = test.convert(-1);
    assertEquals(1,result,0.001);
  }
  @Test public static void DETest6(){
    UnitConverter test = new DollarToCNYConverter();
    double result = test.convert(0);
    assertEquals(0,result,0.001);
  }
  @Test public static void DETest7() {
    UnitConverter test = new DollarToTRYConverter();
    double result = test.convert(10000);
    assertEquals(38300,result,0.001);
  }
  @Test public static void DETest8() {
    UnitConverter test = new DollarToTRYConverter();
    double result = test.convert(-1);
    assertEquals(1,result,0.001);
  }
  @Test public static void DETest9(){
    UnitConverter test = new DollarToTRYConverter();
    double result = test.convert(0);
    assertEquals(0,result,0.001);
  }
  @Test public static void DETest10() {
    UnitConverter test = new MeterToMillimeter();
    double result = test.convert(0.1);
    assertEquals(1000,result,0.001);
  }
  @Test public static void DETest11() {
    UnitConverter test = new MeterToMillimeter();
    double result = test.convert(1);
    assertEquals(10000,result,0.001);
  }
  @Test public static void DETest12(){
    UnitConverter test = new MeterToMillimeter();
    double result = test.convert(0.5);
    assertEquals(5000,result,0.001);
  }
  @Test public static void DETest13() {
    UnitConverter test = new MeterToCentimeter();
    double result = test.convert(0.1);
    assertEquals(10,result,0.001);
  }
  @Test public static void DETest14() {
    UnitConverter test = new MeterToCentimeter();
    double result = test.convert(1);
    assertEquals(100,result,0.001);
  }
  @Test public static void DETest15(){
    UnitConverter test = new MeterToCentimeter();
    double result = test.convert(0.5);
    assertEquals(50,result,0.001);
  }
  @Test public static void DETest16() {
    UnitConverter test = new CelsiusToFahrenheitConverter();
    double result = test.convert(-10);
    assertEquals(14,result,0.001);
  }
  @Test public static void DETest17() {
    UnitConverter test = new CelsiusToFahrenheitConverter();
    double result = test.convert(2);
    assertEquals(35.6,result,0.001);
  }
  @Test public static void DETest18(){
    UnitConverter test = new CelsiusToFahrenheitConverter();
    double result = test.convert(0.5);
    assertEquals(32.9,result,0.001);
  }
  @Test public static void DETest19() {
    UnitConverter test = new FahrenheitToCelsiusConverter();
    double result = test.convert(-10);
    assertEquals(-23.3333,result,0.001);
  }
  @Test public static void DETest20() {
    UnitConverter test = new FahrenheitToCelsiusConverter();
    double result = test.convert(0);
    assertEquals(-17.77778,result,0.001);
  }
  @Test public static void DETest21(){
    UnitConverter test = new FahrenheitToCelsiusConverter();
    double result = test.convert(50);
    assertEquals(10,result,0.001);
  }
}
