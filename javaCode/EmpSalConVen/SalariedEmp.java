import java.time.LocalDate;

public class SalariedEmp extends Employee {
    private double sal;
    private int bonus;

    public SalariedEmp() {
        this(0,null,null,null,null,null,null,0,0);
    }

    public SalariedEmp(int id, String pname, String mobile, String email, String dept, String desig, LocalDate doj, double sal, int bonus) {
        super(id, pname, mobile, email, dept, desig, doj);
        this.sal = sal;
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "SalariedEmp{" +
                "sal=" + sal +
                ", bonus=" + bonus +
                '}';
    }
}
