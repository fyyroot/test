package CreateDisAndFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ying
 */
public class BufferWrite {

    public static void main(String[] args) {
        BufferedOutputStream bufferedOutputStream=null;
        File file=new File("d:/2345/test.txt");
        try{
            bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(file));
            byte[]bytes=new byte[1024];
            String str="123456";
            bufferedOutputStream.write(str.getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (bufferedOutputStream!=null){
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
