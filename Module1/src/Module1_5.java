public class Module1_5 {
    public static void main (String[] args) {
        int T = 601;
        int hours = T / 3600;
        int minutes = (T - hours * 3600) / 60;
        int seconds = T - hours * 3600 - minutes * 60;
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");
    }
}
