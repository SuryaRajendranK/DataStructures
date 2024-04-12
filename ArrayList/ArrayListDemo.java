package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Student s1 = new Student("kumar", 3);
        list.add(new Student("surya", 10));
        list.add(new Student("raj", 20));
        list.add(new Student("navanee", 30));
        list.add(s1);
        System.out.println(list.get(2));
        System.out.println(list.indexOf(s1));
        for (Student ss : list) {
            System.out.println(ss);

        }
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}
