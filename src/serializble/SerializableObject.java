package serializble;

import entity.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**对象到文件
 * 字符流转字节流
 * @author Ying
 */
public class SerializableObject {
    public static void main(String[] args) {
        Student stu= new Student("fyy",5,"F");
        ObjectOutputStream objectOutputStream=null;
        try {
            objectOutputStream=new ObjectOutputStream(new FileOutputStream("d:/2345/test.obj"));
            objectOutputStream.writeObject(stu);
            System.out.println("保存成功");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (objectOutputStream!=null){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
