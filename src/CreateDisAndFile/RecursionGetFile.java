package CreateDisAndFile;

import java.io.File;

/**
 * 递归获取文件夹下所有文件
 * @author Ying
 */
public class RecursionGetFile {
    private static void  showFileAll(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File result:files){
                if (result.isDirectory()){
                    File[] files1 = result.listFiles();
                    for (File file1:files1){
                        System.out.println(file1.getName()+"不是文件");
                    }
                }else {
                    System.out.println(files);
                }
                showFileAll(result);
            }

        }else {
            System.out.println("name:"+file.getName());
        }

    }

    public static void main(String[] args) {
        File file=new File("d:/2345");
        showFileAll(file);
    }

}
