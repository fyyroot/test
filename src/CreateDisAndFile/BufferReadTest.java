package CreateDisAndFile;

import java.io.*;

/**
 * @author Ying
 */
public class BufferReadTest {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream=null;
        File file=new File("d:/2345/test.txt");
        try{
            bufferedInputStream=new BufferedInputStream(new FileInputStream(file));
            byte[] bytes=new byte[1024];

            int read = bufferedInputStream.read(bytes);
            String str=new String(bytes,0,read);
            System.out.println(str);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (bufferedInputStream!=null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
