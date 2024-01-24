package gr.aueb.cf.ch14.reflection;

import java.lang.reflect.Constructor;

/**
 * Creates a reflection of Student class
 * with default constructor.
 */
public class Main {

    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("gr.aueb.cf.ch14.reflection.Student");
            Constructor<?> defaultConstructor = aClass.getDeclaredConstructor();
            defaultConstructor.setAccessible(true);
            Student student = (Student) defaultConstructor.newInstance();

            student.setId(21L);
            student.setFirstname("Stavros");
            student.setLastname("K.");

            System.out.println(student);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
