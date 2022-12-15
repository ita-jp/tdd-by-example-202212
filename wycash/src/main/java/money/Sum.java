package money;

public class Sum implements Expression {

    Money augend;
    Money addend;

    Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(String to) {
        var amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}