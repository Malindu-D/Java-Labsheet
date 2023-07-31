public class Test {
    public static void main(String[] args) {
        Employee obj1=new Employee();

        obj1.setEmpID(25000);
        obj1.setEmpName("Mr.Bogdan");
        obj1.setEmpDesignation("HR Manager");

        Employee obj2=new Employee();

        obj2.setEmpID(25001);
        obj2.setEmpName("Ms.Bird");
        obj2.setEmpDesignation("Sales Manager");

        System.out.println("Employee Mr.Bogdan's Details:");
        System.out.println(obj1.getEmpID());
        System.out.println(obj1.getEmpName());
        System.out.println(obj1.getEmpDesignation());

        System.out.println("");

        System.out.println("Employee Ms.Bird: Details:");
        System.out.println(obj2.getEmpID());
        System.out.println(obj2.getEmpName());
        System.out.println(obj2.getEmpDesignation());

    }
}
