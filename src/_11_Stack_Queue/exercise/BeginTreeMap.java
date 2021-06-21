package _11_Stack_Queue.exercise;

import java.util.TreeMap;

public class BeginTreeMap {
    public static void main(String[] args) {
//        Đếm số lần xuất hiện của mỗi từ trong một chuỗi sử dụng Map
        TreeMap<String, Integer > treeMap = new TreeMap<>();
        String str = "anh yeu em   em lam";

        String[] world = str.split(" ");
//        duyệt mảng ban đầu
        for (String element: world) {

            System.out.println(element.toUpperCase());
        }
//        thêm phần tử vào map
        for (int i = 0 ; i<world.length;i++) {
            if (!world[i].equals("")) {
                if (!treeMap.containsKey(world[i])) {
                    treeMap.put(world[i],1);

                }else {
                    treeMap.put(world[i],treeMap.get(world[i])+1);

                }
            }


        }
        System.out.println(treeMap);
    }


}
