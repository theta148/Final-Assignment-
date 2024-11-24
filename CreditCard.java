public class CreditCard
{
    private Person owner;
    private Money balance;
    private Money creditLimit;

    public CreditCard(Person owner, Money creditLimit)
    {
        this.owner = owner;
        this.creditLimit = creditLimit;
        this.balance = new Money(0.00);
    }

    public getBalance()
    {
        return balance;
    }

    public getCreditLimit()
    {
        return creditLimit;
    }

    public getPersonals()
    {
        return owner.toString();
    }

    public charge(Money amount)
    {
        if (balance == creditLimit)
        {

        }
    }
}
