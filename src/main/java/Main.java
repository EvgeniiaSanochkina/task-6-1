import ru.netology.javaqa.javaqamvn.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int x = 200;
        int y = 300;
        int sum = service.calcSqrt(x, y);
        System.out.println(sum);
    }
}
