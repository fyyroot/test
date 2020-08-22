package CreateDisAndFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 写入文件
 * @author Ying
 */
public class FileWrite {

    public static void main(String[] args) throws IOException {
        File file=new File("d:/2345/test.txt");

        FileOutputStream fileOutputStream=null;

        {
            try {
                fileOutputStream = new FileOutputStream(file);
                String str="niha";
                fileOutputStream.write(str.getBytes());

            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                if (fileOutputStream!=null) {
                    fileOutputStream.close();
                }

            }
        }
    }




}
