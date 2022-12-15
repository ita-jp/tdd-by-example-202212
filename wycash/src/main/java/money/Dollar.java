package money;

public class Dollar {
    private int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        var dollar = (Dollar) obj;
        return amount == dollar.amount;
    }
}
