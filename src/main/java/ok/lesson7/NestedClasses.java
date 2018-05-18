package lesson7;


public class NestedClasses {

    private String name;
    private String secondName;
    private static Integer age;

    Nested nested = new Nested();

    public static Integer getAge() {
        return age;
    }

    public static void setAge(Integer age) {
        NestedClasses.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }


    //Вложенный статический класс
    public static class Nested {

        private String jobPosition;
        public static Integer salary;


        public String getJobPosition() {
            return jobPosition;
        }

        public void setJobPosition(String jobPosition) {
            this.jobPosition = jobPosition;
        }

        public static Integer getSalary() {
            return salary;
        }

        public static void setSalary(Integer salary) {
            Nested.salary = salary;
        }
    }
}

