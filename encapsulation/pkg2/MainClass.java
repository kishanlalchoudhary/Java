package encapsulation.pkg2;

import encapsulation.pkg1.Teacher;

public class MainClass extends Teacher {
    public static void main(String[] args) {
        Teacher obj = new Teacher();

        // teachingClass is public so it can be accessed outside package
        obj.teachingClass = 12;

        // Error - Because id is private so it cannot be accessed outside package
        // obj.id = 123;

        // Error - Because degree is default or package private so cannot be accessed outside   the package
        // obj.degree = "PHD";

        MainClass mc = new MainClass();
        // studentsCount is protected so it can be accessed by subclass
        mc.studentsCount = 100;
    }
}
