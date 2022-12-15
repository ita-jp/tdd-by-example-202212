package money;

public class Money {

    protected int amount;

    @Override
    public boolean equals(Object obj) {
        var money = (Money) obj;
        return amount == money.amount;
    }

}
