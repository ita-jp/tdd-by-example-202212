package money;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class MoneyTest {

    @Test
    public void testMultiplication() {
        var five = new Dollar(5);
        five.times(2);
        assertThat(five.amount).isEqualTo(10);
    }
}
