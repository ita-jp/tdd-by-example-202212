package money;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class MoneyTest {

    @Test
    public void testMultiplication() {
        var five = new Dollar(5);
        var product = five.times(2);
        assertThat(product.amount).isEqualTo(10);

        product = five.times(3);
        assertThat(product.amount).isEqualTo(15);
    }

    @Test
    public void testEquality() {
        assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
        assertThat(new Dollar(5)).isNotEqualTo(new Dollar(6));
    }
}
