
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static String S1 = ("Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
            " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
            "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit" +
            " in voluptate velit esse cillum dolore eu fugiat nulla pariatur." +
            " Excepteur sint occaecat cupidatat non proident," +
            " sunt in culpa qui officia deserunt mollit anim id est laborum.");
    static final String text = S1.toLowerCase();

    public static void main(String[] args) {
        Map<Character, Integer> letters = new HashMap<>();
        int i = 0;
        for (i = 0; i < text.length(); i++) {
            char mayBeLetter = text.charAt(i);
            if (!Character.isLetter(mayBeLetter)) {
                continue;
            }
            if (letters.containsKey(mayBeLetter)) {
                letters.put(mayBeLetter, letters.get(mayBeLetter) + 1);
            } else {
                letters.put(mayBeLetter, 1);
            }
        }
        List<Character> maxLetter = new ArrayList<>();
        int max = 0;
        for (Map.Entry<Character, Integer> letter : letters.entrySet()) {
            if (max < letter.getValue()) {
                max = letter.getValue();
            }
        }
        for (Map.Entry<Character, Integer> letter : letters.entrySet()) {
            if (max == letter.getValue()) {
                maxLetter.add(letter.getKey());
            }
        }
        System.out.println("Больше всего в тексте встречается " + maxLetter + "," + max + "раз.");
        List<Character> minLetter = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> letter : letters.entrySet()) {
            if (min > letter.getValue()) {
                min = letter.getValue();
            }
        }
        for (Map.Entry<Character, Integer> letter : letters.entrySet()) {
            if (min == letter.getValue()) {
                minLetter.add(letter.getKey());
            }
        }
        System.out.println("Меньше всего в тексте встречается " + minLetter + "," + min + "раз.");
    }
}

