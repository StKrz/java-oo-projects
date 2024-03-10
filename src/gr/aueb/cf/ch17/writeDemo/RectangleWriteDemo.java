package gr.aueb.cf.ch17.writeDemo;

import gr.aueb.cf.ch17.shapes.Circle;
import gr.aueb.cf.ch17.shapes.Rectangle;

import java.io.*;

public class RectangleWriteDemo {

    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("C:/tmp/ch17Dir/rectangle.ser"))) {
            Rectangle rectangle = new Rectangle(2,2);
            oos.writeObject(rectangle);
            System.out.println(rectangle.getArea() + " successfully saved");
            System.out.println(rectangle.getCircumference() + " successfully saved");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NotSerializableException e1) {
            System.out.println("Not Serializable");
        } catch (IOException e2) {
            System.out.println(e2.getMessage());
        }
    }
}
