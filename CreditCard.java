public class CreditCard
{
    private Person owner;// The owner of the bank account.
    private Money balance;//
    private Money creditLimit;

    public CreditCard(Person owner, Money creditLimit)
    {
        this.owner = owner;
        this.creditLimit = creditLimit;
        this.balance = new Money(0.00);
    }

    public Money getBalance()
    {
        return balance;
    }

    public Money getCreditLimit()
    {
        return creditLimit;
    }

    public String getPersonals()
    {
        return owner.toString();
    }

    public void charge(Money amount)
    {
        if (amount.compareTo(creditLimit) == -1 || amount.compareTo(creditLimit) == 0)
        {
            balance.add(amount);
        }
        else {
            System.out.println("Exceeds credit limit.");
        }
    }

    public void payment(Money amount)
    {
        balance.subtract(amount);
    }
}
