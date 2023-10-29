import java.time.LocalDate;
import java.util.Date;

public class Employee extends Person {
    private  String dept;
    private String desig;
    private LocalDate doj;

    public Employee() {
    this(0, null,null,null,null,null,null);
    }

    public Employee(int id, String pname, String mobile, String email, String dept, String desig, LocalDate doj) {
        super(id, pname, mobile, email);
        this.dept = dept;
        this.desig = desig;
        this.doj = doj;
    }

    public String getDept() {
        return dept;
    }

    public String getDesig() {
        return desig;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                ", desig='" + desig + '\'' +
                ", doj=" + doj +
                '}';
    }
}
