// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       BMIService service = new BMIService();
        double weight = 98;
        double height = 1.87;
        double result = service.calculate(weight, height);

        System.out.println("Индекс массы тела = " + result);

    }
}