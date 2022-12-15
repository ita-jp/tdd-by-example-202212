package money;

public abstract class Money {

    protected int amount;
    protected String currency;

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    abstract Money times(int multiplier);

    String currency() {
        return currency;
    }

    @Override
    public boolean equals(Object obj) {
        var money = (Money) obj;
        return amount == money.amount && getClass().equals(money.getClass());
    }

}
