public class Module1_3 {
    public static void main (String[] args){
        double x = 90;
        x = Math.toRadians(x);
        double y = 90;
        y = Math.toRadians(y);
        double result;
        result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("Результат вычисления равен: " + result);
    }
}
