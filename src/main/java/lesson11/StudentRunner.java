package main.java.lesson11;

public class StudentRunner {

    public static void main(String[] args) {


        Student studentDefault = new Student();

        studentDefault.setAge(-17.5).setIQ(102).setName("Bill").setLastName("Michaelson");

        Student studentCustom = new Student(95, "Doug", "Pendersson", 17);

        Student mechanicStudent = new MechanicStudent();

        Student philosophyStudent = new PhilosophyStudent();

        Student [] arrayOfStudents = new Student[15];

        arrayOfStudents[0] = studentDefault;

        arrayOfStudents[1] = studentCustom;

        arrayOfStudents[2] = mechanicStudent;

        arrayOfStudents[3] = philosophyStudent;

        for (int i = 0; i < arrayOfStudents.length; i++) {

            if (arrayOfStudents[i] instanceof MechanicStudent){
                ((MechanicStudent)arrayOfStudents[i]).sayYourFaculty();
            } else if (arrayOfStudents[i] instanceof PhilosophyStudent){
                ((PhilosophyStudent)arrayOfStudents[i]).sayYourFaculty();
            } else System.out.println(arrayOfStudents[i]);
        }



    }

}
