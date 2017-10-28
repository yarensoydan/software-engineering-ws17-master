import java.util.Scanner;

class Main {
  public static double originalValue;
  public static String moduleChoose;

  public static UnitConverter myConverter;
  public static Scanner moduleScanner;
  public static boolean exit=false;

  public static void main(String[] args) {


    System.out.println("welcome to our unitConverter \n Dollar to Euro \n Dollar to CNY \n Dollar to TRY \n");
    System.out.println(" Meter to Centimeter \n Meter to Centimeter \n");
    System.out.println(" Celsius to Fahrenheit \n Fahrenheit to Celsius \n");
    System.out.println("Type 'Exit' to close the converter");

   do{
     // Choose different converter module
     moduleChoose = getUserChoice();

     switch (moduleChoose){
       ///https://docs.oracle.com/javase/8/docs/technotTRYes/guides/language/strings-switch.html

       // Currency module
       case "dollartoeuro":

         originalValue = getOriginalValue();
         if(originalValue<0){
           System.out.println("The value shouldn't be smaller than 0");
         }else{
           currencyConverter(myConverter);
           myConverter = new DollarToEuroConverter();
           converterResult(originalValue,myConverter);
         }
         break;
       case "dollartocny":
         originalValue = getOriginalValue();
         if(originalValue<0){
           System.out.println("The value shouldn't be smaller than 0");
         }else{
           currencyConverter(myConverter);
           myConverter = new DollarToCNYConverter();
           converterResult(originalValue,myConverter);
         }
         break;
       case "dollartotry":
         originalValue = getOriginalValue();
         if(originalValue<0){
           System.out.println("The value shouldn't be smaller than 0");
         }else{
           originalValue = getOriginalValue();
           if(originalValue<0){
             System.out.println("The value shouldn't be smaller than 0");
           }else{
             currencyConverter(myConverter);
             myConverter = new DollarToCNYConverter();
             converterResult(originalValue,myConverter);
           }
         }
         // Length module
       case "metertocentimeter":
         originalValue = getOriginalValue();
         lengthConverter(myConverter);
         myConverter = new MeterToCentimeter();
         converterResult(originalValue,myConverter);
         break;
       case "metertomillimeter":
         originalValue = getOriginalValue();
         lengthConverter(myConverter);
         myConverter = new MeterToMillimeter();
         converterResult(originalValue,myConverter);
         break;
       // Temperature module
       case "celsiustofahrenheit":
         originalValue = getOriginalValue();
         temperatureConverter(myConverter);
         myConverter = new CelsiusToFahrenheitConverter();
         converterResult(originalValue,myConverter);
         break;
       case "fahrenheitocelsius":
         originalValue = getOriginalValue();
         temperatureConverter(myConverter);
         myConverter = new FahrenheitToCelsiusConverter();
         converterResult(originalValue,myConverter);
         break;
       case "exit":
         exit=true;
         System.out.println("Thanks for your support");
         break;
       default:
         System.out.println("Please check the converter module you choose");
     }
   }while(exit==false);
 }

  public static double getOriginalValue() {
    System.out.println("Please enter the value you want to convert");
    Scanner input = new Scanner(System.in);
    originalValue = input.nextDouble();
    return originalValue;
  }

  public static void converterResult(double originalValue, UnitConverter myConverter) {
    myConverter.convert(originalValue);
    myConverter.print();
  }

  public static String getUserChoice(){
    System.out.println("Please enter the converter you want to use");
    moduleScanner = new Scanner(System.in);
    moduleChoose = moduleScanner.nextLine();
    //Change all letters into lowerCase;
    //https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toLowerCase
    moduleChoose=moduleChoose.toLowerCase();
    //Remove all the space;
    //https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/replace
    moduleChoose=moduleChoose.replace(" ", "");
    return moduleChoose;
  }
  public static void currencyConverter(UnitConverter myConverter){
    myConverter=new CurrencyConverter();
    myConverter.print();
  }
  public static void lengthConverter(UnitConverter myConverter){
    myConverter=new LengthConverter();
    myConverter.print();
  }
  public static void temperatureConverter(UnitConverter myConverter){
    myConverter=new TemperatureConverter();
    myConverter.print();
  }
}
