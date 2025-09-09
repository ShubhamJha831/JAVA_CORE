package CHALLANGES;

class Challange_no70 {
    String name;

    int age;

    int rollNumber;

    String house;

    public Challange_no70(String name, int age, int rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Details:{name:"+ name +", age:"+ age +", roll Number:"+ rollNumber +", house:"+ house +"}";
    }

    public static void main(String[] args) {
       Challange_no70 stu = new Challange_no70("shubham", 21, 3433,"Shivaji");
        System.out.println(stu);
    }
}
