package lesson5;


public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Ivan";
        student1.secondName = "Petrov";
        student1.age = 20;
        student1.levelValue = 3;

        Student student2 = new Student();
        student2.name = "Juan";
        student2.secondName = "Gomez";
        student2.age = 21;
        student2.levelValue = 4;

        Student [] students = {student1, student2};

        for (int i = 0; i < students.length ; i++) {
            System.out.println(students[i].name + " " + students[i].secondName + " "
            + students[i].age + " " + students[i].levelValue);
        }

        for (Student student : students) {
            System.out.println(student.name + " " + student.secondName + " "
            + student.age + " " + student.levelValue);
        }
    }
}
