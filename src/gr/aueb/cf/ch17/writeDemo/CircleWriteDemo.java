package gr.aueb.cf.ch17.writeDemo;

import gr.aueb.cf.ch17.shapes.Circle;

import java.io.*;

public class CircleWriteDemo {

    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("C:/tmp/ch17Dir/circle.ser"))) {
            Circle circle = new Circle(5);
            oos.writeObject(circle);
            System.out.println(circle.getDiameter() + " successfully saved");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NotSerializableException e1) {
            System.out.println("Not Serializable");
        } catch (IOException e2) {
            System.out.println(e2.getMessage());
        }
    }
}
