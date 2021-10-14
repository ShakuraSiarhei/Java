public class Module1_4 {
    public static void main (String[] args) {
        double x = 222.333;
        double afterPoint = Math.round((x%1)*1000);
        double beforePoint = x - x % 1;
        double result = afterPoint + beforePoint / 1000;
        System.out.println("Перевернутое число:" + result);
    }
}
