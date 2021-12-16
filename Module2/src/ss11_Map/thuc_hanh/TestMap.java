package ss11_Map.thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap =new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Anderson",31);
        hashMap.put("Lewis",29);
        hashMap.put("Cook",29);
        System.out.println("Display HashMap");
        System.out.println(hashMap+"\t");
        Map<String, Integer> treeMap=new TreeMap<>();
        treeMap.put("Smith",31);
        treeMap.put("Anderson",30);
        treeMap.put("Lewis",29);
        treeMap.put("Cook",28);
        System.out.println("Display TreeMap");
        System.out.println(treeMap+"\t");
        Map<String, Integer> linked = new LinkedHashMap<>(16,0.75f,true);
        linked.put("Smith",30);
        linked.put("Anderson",31);
        linked.put("Lewis",29);
        linked.put("Cook",29);
        System.out.println(linked+"\t");
    }
}
