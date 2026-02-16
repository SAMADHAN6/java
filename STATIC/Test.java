package STATIC;

class Student {
    int roll;
    String name;
    static String name_clg;
    static int cnt = 0;

    Student() {
        cnt++;
    }
}

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.print(Student.cnt);
    }
}