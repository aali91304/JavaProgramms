package JavaChallenges;

public class Course {
    static  int maxcapacity = 100;
    String CourseName;
    int enrollments;
    String[] enrolledStudents = new String[maxcapacity];

    Course(String CourseName){
        this.CourseName = CourseName;
        this.enrollments =0;
    }

    static  void setmaxCapacity(int maxcapacity){
         Course.maxcapacity = maxcapacity;
    }
void enrollStudents(String studentName){
    if (enrollments < maxcapacity) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
        System.out.println("Student " + studentName + " enrolled in " + CourseName);
    } else {
        System.out.println("Cannot enroll student " + studentName + ". Maximum capacity reached.");
    }


}
void unenrollStudents(String studentName){
    for (int i = 0; i < enrollments; i++) {
        if (enrolledStudents[i].equals(studentName)) {
            // Shift elements to the left to remove the student
            for (int j = i; j < enrollments - 1; j++) {
                enrolledStudents[j] = enrolledStudents[j + 1];
            }
            // Clear the last element and decrement enrollments
            enrolledStudents[enrollments - 1] = null;
            enrollments--;
            System.out.println("Student " + studentName + " removed");

        }
    }
    return; // Exit the method once student is removed

}

    public static void main(String[] args) {
        Course javaCourse = new Course("Java Programming");

        // Enroll students
        javaCourse.enrollStudents("Alice");
        javaCourse.enrollStudents("Bob");
        javaCourse.enrollStudents("Charlie");

        // Unenroll a student
        javaCourse.unenrollStudents("Bob");

    }


}
