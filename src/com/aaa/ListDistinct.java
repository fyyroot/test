package com.aaa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ying
 */
public class ListDistinct {
    public static void main(String[] args) {
        List<String> lists=new ArrayList<>();
        lists.add("1");
        lists.add("1");
        lists.add("2");
        lists.add("2");
        lists.add("4");
        lists.add("5");
        lists.add("6");

        System.out.println(lists.size());

        for (int i=0;i<lists.size()-1;i++){
            for (int j=lists.size()-1;j>i;j--){
                if (lists.get(j).equals(lists.get(i))){
                    lists.remove(j);
                }
            }
        }

        System.out.println("去重后的list"+lists.toString());
    }
}
