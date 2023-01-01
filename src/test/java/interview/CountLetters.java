package interview;

import java.util.Map;
import java.util.TreeMap;

public class CountLetters {
    public static void main(String[] args) {

        //count letter
        String str = "Java";
        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {


            if (!map.containsKey(str.charAt(i))){

                map.put(str.charAt(i), 1);

            }else {
                int value = map.get(str.charAt(i));
                map.put(str.charAt(i), value+1);
            }


        }

        System.out.println(map);





    }
}
