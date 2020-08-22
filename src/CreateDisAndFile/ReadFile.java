package CreateDisAndFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Ying
 */
public class ReadFile {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        File file=new File("d:/2345/test.txt");
        try {
            fileInputStream=new FileInputStream(file);
            byte[] bytes=new byte[1024];
            int by = fileInputStream.read(bytes);
            String s=new String(bytes,0,by);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(file!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
