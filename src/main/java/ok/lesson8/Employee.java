package ok.lesson8;


public class Employee {

    private Integer id;
    private String name;
    private String secondName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getId() != null ? !getId().equals(employee.getId()) : employee.getId() != null) return false;
        if (getName() != null ? !getName().equals(employee.getName()) : employee.getName() != null) return false;
        return getSecondName() != null ? getSecondName().equals(employee.getSecondName()) : employee.getSecondName() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getSecondName() != null ? getSecondName().hashCode() : 0);
        return result;
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Employee)) return false;
//
//        Employee employee = (Employee) o;
//
//        if (getId() != null ? !getId().equals(employee.getId()) : employee.getId() != null) return false;
//        if (getName() != null ? !getName().equals(employee.getName()) : employee.getName() != null) return false;
//        return getSecondName() != null ? getSecondName().equals(employee.getSecondName()) : employee.getSecondName() == null;
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = getId() != null ? getId().hashCode() : 0;
//        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
//        result = 31 * result + (getSecondName() != null ? getSecondName().hashCode() : 0);
//        return result;
//    }


    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Employee employee = (Employee) o;
//
//        if (id != null ? !id.equals(employee.id) : employee.id != null) return false;
//        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
//        return secondName != null ? secondName.equals(employee.secondName) : employee.secondName == null;
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id != null ? id.hashCode() : 0;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
//        return result;
//    }
}
