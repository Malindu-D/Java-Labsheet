public class Main {
    public static void main(String[] args) {
        Employee s1=new Employee("malindu",23,25000.00);

        //display the values
        String a= s1.getName();
        int b= s1.getAge();
        double c= s1.getSalary();

        System.out.println("Name is:" +a);
        System.out.println("Age is:" +b);
        System.out.println("Salary is:"+c);
    }
}