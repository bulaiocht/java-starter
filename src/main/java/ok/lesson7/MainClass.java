package ok.lesson7;

public class MainClass {

    public static void main(String[] args) {

//        //Nested Classes Example
//        NestedClasses nestedClasses = new NestedClasses();
//        nestedClasses.setName("Julio");
//        nestedClasses.setSecondName("Aparicio");
//
//        nestedClasses.nested.getJobPosition();
//
//
//        NestedClasses.setAge(30);
//
//        NestedClasses.Nested nested = new NestedClasses.Nested();
//
//        nested.setJobPosition("Teacher");
//        //nested.setSalary(1500);
//        NestedClasses.Nested.salary = 15000;
//
//        System.out.println(nestedClasses.getName() + " " + nestedClasses.getSecondName()
//                + " " + nested.getJobPosition() + " " + NestedClasses.Nested.getSalary());
//
//
//
//        //Inner Classes Example
//        InnerClasses.setModel("Ibiza");
//
//        InnerClasses innerClasses = new InnerClasses();
//        innerClasses.setMark("Seat");
//
//        innerClasses.setInnerDoors(4);
//
//        System.out.println(innerClasses.getInnerDoors());
//
//        System.out.println(innerClasses.thisClassInnerClass.getCountry());



        RealizationOfFirstVariable realizationOfFirstVariable = new RealizationOfFirstVariable();
        realizationOfFirstVariable.arithmeticMean(5, 6, 7, 8, 9);
        System.out.println(ExampleAbstractClasses.first);

        RealizationOfSecondVariable realizationOfSecondVariable = new RealizationOfSecondVariable();
        realizationOfSecondVariable.arithmeticMean(7, 4, 3, 5);
        System.out.println(ExampleAbstractClasses.second);

        System.out.println(ExampleAbstractClasses
                .getSumOfTwoArithmeticMeans(ExampleAbstractClasses.first.intValue(),
                        ExampleAbstractClasses.second.intValue()));


       ExampleAbstractClasses exampleAbstractClasses = new ExampleAbstractClasses() {
           @Override
           void arithmeticMean(Integer... args) {
               int sum = 0;

               for (int i = 0; i < args.length; i++)
                   sum += args[i];

               ExampleAbstractClasses.first = (double) sum / args.length;
           }

           @Override
           Integer sum() {
               return 5;
           }
       };

        exampleAbstractClasses.arithmeticMean();

    }
}
