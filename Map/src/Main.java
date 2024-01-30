import java.util.*;

public class Main {
    public static void main(String[] args){
        HashMap<Integer,String> map1 = new HashMap<Integer, String>(Map.of(1,"uno",2,"due",3,"tre"));
        HashMap<Integer,String> map2 = new HashMap<Integer, String>(Map.of(1,"uno",2,"due",3,"tre"));
        HashMap<Integer,String> map3 = new HashMap<Integer, String>(Map.of(1,"uno",2,"due",3,"tre"));

        System.out.println(map1.get(3));
        map1.put(2,"gaga");
        for (Map.Entry<Integer,String> element : map2.entrySet()){
            System.out.println(element);
        }
        Set<Integer> keys = map3.keySet();
        System.out.println(keys);

        List<Map.Entry<Integer, String>> values = new ArrayList<>(map3.entrySet());
        values.sort(new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        System.out.println(values);


    }
}
