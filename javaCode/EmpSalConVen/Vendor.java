import java.time.LocalDate;

public class Vendor extends Employee{
    private int count;
    private int amount;

    public Vendor() {
        this(0,null,null,null,null,null,null,0,0);
    }

    public Vendor(int id, String pname, String mobile, String email, String dept, String desig, LocalDate doj, int count, int amount)
    {
        super(id,pname,mobile,email,dept,desig,doj);
        this.count = count;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "count=" + count +
                ", amount=" + amount +
                '}';
    }
}
