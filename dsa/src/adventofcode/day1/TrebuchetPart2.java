package adventofcode.day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrebuchetPart2 {
    public static void main(String[] args) throws IOException {
        int i = TrebuchetPart2.readFile();
        System.out.println(i);
    }

    public static int valuePerString(String s) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("zero", 0);
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine", 9);

        numbers.put("0", 0);
        numbers.put("1", 1);
        numbers.put("2", 2);
        numbers.put("3", 3);
        numbers.put("4", 4);
        numbers.put("5", 5);
        numbers.put("6", 6);
        numbers.put("7", 7);
        numbers.put("8", 8);
        numbers.put("9", 9);

        List<Integer> l = new ArrayList<>();

        // create a list of integers from the string
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length() + 1; j++) {
                String word = s.substring(i, j);
                if (numbers.containsKey(word)) {
                    l.add(numbers.get(word));
                    break;
                }
            }
        }

        // Create a double-digit number from the first and the last value in the list
        // and return as a string
        return Integer.parseInt(String.valueOf(l.get(0)) + String.valueOf(l.get(l.size() - 1)));
    }

    public static int readFile() throws IOException {
        Path filePath = Path.of("/Users/saumyemehrotra/IdeaProjects/LeetcodeQuestions/src/adventofcode/day1/Trebuchet1.txt");
        String content = Files.readString(filePath);

        String[] strings = content.split("\n");

        return Arrays.stream(strings)
                .map(TrebuchetPart2::valuePerString)
                .mapToInt(Integer::intValue)
                .sum();

    }

}
