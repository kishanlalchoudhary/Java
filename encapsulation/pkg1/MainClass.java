package encapsulation.pkg1;

public class MainClass {
    public static void main(String[] args) {
        Teacher obj = new Teacher();

        // teachingClass is public so it can be accessed inside package
        obj.teachingClass = 12;

        // Error - Because id is private so it cannot be accessed inside package
        // obj.id = 123;

        // degree is default or package private so can be accessed inside the package
        obj.degree = "PHD";

        // studentsCount is protected so it can be accessed by non subclass inside package
        obj.studentsCount = 100;
    }
}
