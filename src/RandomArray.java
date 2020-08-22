import java.lang.reflect.Array;

/**
 * 给定一个数组 随即打乱顺寻 生成一个新数组
 * @author Ying
 */
public class RandomArray {

    public static int []srand (int []a){
        int []b=new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            int temp = (int) (Math.random() * (a.length - i));
            b[i]=a[temp];
            int change = a[a.length - i-1];
            a[a.length-1-i]=a[temp];

            a[temp]=change;

        }

        return b;
    }


    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7,8};

        int[] srand = srand(a);

        for (int i = 0; i <srand.length ; i++) {
            System.out.print(srand[i]+"\t");
        }





    }
}
