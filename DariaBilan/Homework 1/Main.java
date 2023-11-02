//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package hw_first;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 2002);
        System.out.println(student1);
        student1.setName("Mark");
        System.out.println(student1);
        System.out.println(student1.age_count());

        Student student2 = new Student();
        student2.setName("Sarah");
        student2.setBirthYear(1996);
        System.out.println(student2);

        Student student3 = new Student("Gorge", 2000);
        System.out.println(student3);

        Student student4 = new Student("Maya", 2009);
        System.out.println(student4);

        Student student5 = new Student("Rebecca", 1993);
        System.out.println(student5);
    }
}
