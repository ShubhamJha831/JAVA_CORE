package CHALLANGES;

class course {
    static int maxCapacity = 100;
    String courseName;
    int enrollements;

    String[] enrolledstudents;
    course(String courseName){
        this.courseName = courseName;
        this.enrollements = 0;
        this.enrolledstudents = new String[maxCapacity];

    }

    static void setMaxCapacity(int maxCapacity){
        course.maxCapacity = maxCapacity;

    }
    void enrollstuden(String studenttName){
       enrolledstudents[enrollements] = studenttName;
        enrollements++;

    }
    void unenrollstudent(String studentName){
        System.out.println("Student Removed");
        enrollements--;
    }

}
