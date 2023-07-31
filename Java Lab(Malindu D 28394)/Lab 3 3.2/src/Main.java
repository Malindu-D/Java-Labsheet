public class Main {
    public static void main(String[] args) {
        EmployeeSalary s1=new EmployeeSalary(10000.00);
        s1.setEmpName("Malindu");
        s1.setbSalary(50000.00);

        double bAmount= s1.bonusAmount();
        System.out.println("New Salary is: "+bAmount);
    }
}