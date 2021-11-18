public class AfterClass14 {
    class Converter
    {
        static double Celsius;
        static double Kelvin;
        static double Fahrenheit;

        public static void CelsiustoKevin(double c)
        {
            Kelvin=c+274.15;
            System.out.println(c + " degree in Celsius is " + Kelvin +" in Kelvin.");
        }
        public static void KelvintoCelsius(double k)
        {
            Celsius=k-274.15;
            System.out.println(k + " degree in Kelvin is " + Celsius +" in Celsius.");
        }
        public static void CelsiustoFahrenheit(double c)
        {
            Fahrenheit=c*(9/5)+32;
            System.out.println(c + " degree in Celsius is " + Fahrenheit +" Fahrenheit.");
        }
        public static void FahrenheittoCelsius(double f)
        {
            Celsius=(f-32)/(9/5);
            System.out.println(f + " degree in Fahrenheit is " + Celsius +" in Celsius.");
        }
        public static void KelvintoFahrenheit(double k)
        {
            Fahrenheit=k*(9/5)-459.67;
            System.out.println(k +" degree in Kelvin is " + Fahrenheit +" in Fahrenheit.");
        }
        public static void FahrenheittoKelvin(double f)
        {
            Kelvin=(f+459.67)*(5/9);
            System.out.println(f +" degree in Fahrenheit is " + Kelvin +" in Kelvin.");
        }
        public static void main(String[] args)
        {   System.out.println("a)");
            CelsiustoKevin(25);
            CelsiustoFahrenheit(25);
            System.out.println("b)");
            FahrenheittoKelvin(100);
            FahrenheittoCelsius(100);
            System.out.println("c)");
            KelvintoCelsius(0);
            KelvintoFahrenheit(0);
        }
    }

}
