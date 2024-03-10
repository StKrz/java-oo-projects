package gr.aueb.cf.ch17.writeDemo;

import gr.aueb.cf.ch17.shapes.Line;

import java.io.*;

public class LineWriteDemo {

    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("C:/tmp/ch17Dir/line.ser"))) {
            Line line = new Line(5);
            oos.writeObject(line);
            System.out.println(line.getLength() + " successfully saved");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NotSerializableException e1) {
            System.out.println("Not Serializable");
        } catch (IOException e2) {
            System.out.println(e2.getMessage());
        }
    }
}
