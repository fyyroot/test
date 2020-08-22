package FileTest;

import java.io.File;

/**
 * @author Ying
 */
public class FileTest {
    public static void main(String[] args) {
        File file=new File("d:\\2345\\test.txt");
        //exists 判断文件或文件夹是否存在
        boolean a=file.exists();
        System.out.println(a);
        //判断是否是目录
        System.out.println(file.isDirectory());
        //判断是否为文件
        System.out.println(file.isFile());
        //获取问价大小
        System.out.println(file.length());

        //获取文件名
        System.out.println(file.getName());




    }


}
