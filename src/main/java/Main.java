import ru.netology.javaqa.javaqamvn.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int firstNumber = 200;
        int secondNumber = 300;
        int sum = service.calcSqrt(firstNumber, secondNumber);
        System.out.println(sum);
    }
}
