public class Encapsulation {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Allen");
        obj.setRollNumber(4);
        System.out.println(obj.getRollNumber());
    }
}
class Student {
    private String name;
    private int rollNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
