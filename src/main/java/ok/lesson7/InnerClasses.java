package ok.lesson7;

public class InnerClasses {

    private String mark;
    private  static String model;

    ThisClassInnerClass thisClassInnerClass = new ThisClassInnerClass();


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        InnerClasses.model = model;
    }

    public void setInnerDoors(Integer doors){

        thisClassInnerClass.setDoors(doors);
    }

    public Integer getInnerDoors(){
        return thisClassInnerClass.getDoors();
    }

    //Вложенный класс
    public class ThisClassInnerClass {
        private Integer doors;
        private String country;

        public Integer getDoors() {
            return doors;
        }

        public void setDoors(Integer doors) {
            this.doors = doors;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }
}
