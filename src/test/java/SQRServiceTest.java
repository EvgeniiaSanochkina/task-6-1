import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.javaqamvn.services.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "1000,1300,5",
            "500,700,4",
            "2500,2700,1"
    })
    void shouldCalculateForRange(int firstNumber, int secondNumber, int expected) {
        SQRService service = new SQRService();
        long actual = service.calcSqrt(firstNumber, secondNumber);
        Assertions.assertEquals(expected, actual);

    }


}

