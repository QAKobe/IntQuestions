package interview;

import java.util.LinkedHashMap;
import java.util.*;

public class InterviewTask {
    public static void main(String[] args) {

        String str = "Kobee";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {

            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                int value = map.get(str.charAt(i));
                map.put(str.charAt(i), value + 1);
            }

        }

        Character moreFrequentChar=str.charAt(0);

        Set<Character> keysOfMap=map.keySet();
        for(Character i:keysOfMap){
            if(map.get(moreFrequentChar) < map.get(i)){
                moreFrequentChar=i;
            }
        }
        System.out.println(moreFrequentChar+":"+map.get(moreFrequentChar));

        System.out.println(keysOfMap);





    }

}
