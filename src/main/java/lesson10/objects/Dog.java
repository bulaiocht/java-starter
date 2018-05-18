package lesson10.objects;

public class Dog {

     String name;

     String color;

     int numberOfLegs;

    Dog(){

        name = "Basic dog";

        color = "Basic color";

        numberOfLegs = 4;
    }

    Dog(String name, String color){

        this.name = name;

        this.color = color;
    }


    public void printDog(){

        System.out.println("Dog name: " + this.name + "; Dog color: " + this.color + "; Legs: " + this.numberOfLegs);

    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public int getNumberOfLegs(){
        return this.numberOfLegs;
    }

    public void setName(String newName){
        this.name = newName.toUpperCase();
    }

    public void setColor(String newColor){

        this.color = newColor.toUpperCase() + " Hahaha";

    }

    public void setNumberOfLegs(int newNumberOfLegs){

        if (newNumberOfLegs >=0 && newNumberOfLegs <=4){
            this.numberOfLegs = newNumberOfLegs;
        }

    }

}
