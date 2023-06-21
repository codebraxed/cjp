import java.util.Scanner;

class Encapsulatio {
        private String name;
        private int employeeId;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }
}
public class Encapsulation1 {
    public static void main (String args[]){
        Encapsulatio obj = new Encapsulatio();
        obj.setName("nithin");
        obj.setEmployeeId(1234);
    }
}
