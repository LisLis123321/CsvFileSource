package BonusService;

import org.example.BonusService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'registered, under limit', 100060, true, 30",
                    "'not registered, under limit', 100060, false,10"
            },
            delimiter = ','

    )
    void shouldCalculate(String test, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'registered, over limit', 100060, true, 30",
                    "'not registered, over limit', 100060, false,10"
            },
            delimiter = ','

    )
    void shouldCalculate1(String test, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);
        assertEquals(expected,actual);
    }
}