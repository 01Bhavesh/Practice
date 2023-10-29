import java.time.LocalDate;

public class ContractEmp extends Employee{
private double charge;
private  int hr;

    public ContractEmp() {
        this(0,null,null,null,null,null,null,0,0);
    }

    public ContractEmp(int id, String pname, String mobile, String email, String dept, String desig, LocalDate doj, double charge, int hr) {
        super(id,pname,mobile,email,dept,desig,doj);
        this.charge = charge;
        this.hr = hr;
    }

    public double getCharge() {
        return charge;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        return "ContractEmp{" +
                "charge=" + charge +
                ", hr=" + hr +
                '}';
    }
}
