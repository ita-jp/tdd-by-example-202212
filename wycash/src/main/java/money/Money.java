package money;

public class Money {

    protected int amount;
    protected String currency;

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    String currency() {
        return currency;
    }

    @Override
    public boolean equals(Object obj) {
        var money = (Money) obj;
        return amount == money.amount && currency().equals(money.currency);
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
