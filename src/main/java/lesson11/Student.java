package main.java.lesson11;

public class Student {

    private double IQ;

    private String name;

    private String lastName;

    private double age;

    Student(){
    }

    Student(int IQ, String name, String lastName, int age){

        this.IQ = IQ;

        this.name = name;

        this.lastName = lastName;

        this.age = age;
    }

    public int getIQ() {
        return (int)IQ;
    }

    public Student setIQ(int IQ) {
        this.IQ = IQ;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getAge() {
        return (int)age;
    }

    public Student setAge(double age) {
        if (age>=6){
            this.age = age;
        }
        return this;
    }

    public String toString(){
        return "Student{IQ= " + IQ + ", name= " + name + ", lastName=" + lastName + ", age=" + age +"}";
    }

    public Student chain(){
        return this;
    }
}












