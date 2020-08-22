package CreateDisAndFile;

import java.io.File;
import java.io.IOException;

/**
 * @author Ying
 */
public class Test {
    public static void main(String[] args) {
        File file = new File("d:\\2345\\testfile");
        System.out.println(file.isDirectory());
        //创建文件夹1

        String path="d:/2345/testfile/test1";
        File file1=new File("path");
        boolean mkdir = file1.mkdir();
        System.out.println(mkdir);

        //创建文件
        String path3=path+"/"+"hello.txt";
        System.out.println(path3);
        File file2=new File(path3);
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //查看文件列表
        File file3=new File("d:/2345");
        if(file3.isDirectory()){
            File[] files = file3.listFiles();
            for (File result:files){
                System.out.println(result);

            }
        }

    }

}
