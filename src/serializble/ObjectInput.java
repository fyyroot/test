package serializble;

import entity.Student;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


/**
 * @author Ying
 */
public class ObjectInput {
    public static void main(String[] args) {
        ObjectInputStream objectInputStream=null;
        File file=new File("d:\\2345\\test.obj");
        try {
            objectInputStream=new ObjectInputStream(new FileInputStream(file));

            Object o = objectInputStream.readObject();
            Student s= (Student) o;

            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            if (objectInputStream!=null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
