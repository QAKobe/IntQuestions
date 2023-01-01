package interview;

import java.util.Map;
import java.util.TreeMap;

public class CharacterFrequency {
    public static String getCharacterFrequency(String input) {
        // Create a map to store the frequency of each character
        Map<Character, Integer> charFrequency = new TreeMap<>();

        // Iterate through the input string and count the frequency of each character
        for (char c : input.toCharArray()) {
            if (charFrequency.containsKey(c)) {
                charFrequency.put(c, charFrequency.get(c) + 1);
            } else {
                charFrequency.put(c, 1);
            }
        }

        // Build a new string with the character and its frequency
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String input = "aaaabbcccccdaa";
        String output = getCharacterFrequency(input);
        System.out.println(output); // prints "a4b2c5d1a2"
    }




}
