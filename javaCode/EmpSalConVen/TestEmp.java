import java.time.LocalDate;

public class TestEmp {
    public static void main(String[] args) {
        SalariedEmp sal = new SalariedEmp();
        sal = new SalariedEmp(1, "Vinay", "265415", "01@email", "Teaching", "HM", LocalDate.of(2021, 10, 03), 15000, 1000);
        System.out.println(sal);

        Employee emp = new Employee(1, "abhi", "154156", "02@email", "student", "stud", LocalDate.of(2000, 03, 18));
        System.out.println(emp);

        ContractEmp conemp = new ContractEmp(1,"mayur","154503","03@email","IT","service",LocalDate.of(2021, 05, 20),15000, 12);
        System.out.println(conemp);
        Employee emp1 = new SalariedEmp();//salariedemp can compair with employee but employe cannot compair to salaried emp at compiletime you have explicitly convert employee to salariedemp.
        System.out.println(emp1);
        Employee emp2 = new ContractEmp();
        ContractEmp con = (ContractEmp) emp;
    }
}
