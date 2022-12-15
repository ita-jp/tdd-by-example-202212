package money;

public class Franc {
    private int amount;
    public Franc(int amount) {
        this.amount = amount;
    }
    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        var dollar = (Franc) obj;
        return amount == dollar.amount;
    }
}
