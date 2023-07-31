public class Main {
    public static void main(String[] args) {
        Lecturer lec1=new Lecturer();

        lec1.setName("Dr. Mohamed Shafraz");
        lec1.setId(10025);
        lec1.setProgramme("JAVA Module");

        System.out.println("Lecturer name:"+lec1.getName());
        System.out.println("Lecturer ID:"+lec1.getId());
        System.out.println("Lecturer Programme:"+lec1.getProgramme());

        System.out.println("");

        Student std1=new Student();

        std1.setName("Malindu D.");
        std1.setId(28394);
        std1.setCourse("Computer Network");

        System.out.println("Student name:"+std1.getName());
        System.out.println("Student ID:"+std1.getId());
        System.out.println("Student Course:"+std1.getCourse());
    }
}