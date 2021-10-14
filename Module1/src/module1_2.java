public class module1_2 {
    public static void main (String[] args) {
        double a = 1;
        double b = 1;
        double c = 1;
        double result = (b + Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a) - Math.pow(a,3) * c + Math.pow(b,-2);
        System.out.println("Результат вычисления равен: " + result);
    }
}
