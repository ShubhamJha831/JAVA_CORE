package CHALLANGES.Challange_79;

public class TestEmployee {
    public static void main(String[] args) {
    Employee emp = new Employee("shubham jha", 30, 25000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Golu");
        System.out.println(emp.getEmployeeDetails());
    }

}
