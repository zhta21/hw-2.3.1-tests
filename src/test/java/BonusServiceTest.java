import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long expected = 30;
        long actual = service.calculate(1000_60, true);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long expected = 500;
        long actual = service.calculate(1_000_000_60, true);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long expected = 10;
        long actual = service.calculate(1000_60, false);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long expected = 500;
        long actual = service.calculate(1_000_000_60, false);

        assertEquals(expected, actual);
    }
}