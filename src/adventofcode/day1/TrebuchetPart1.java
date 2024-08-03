package adventofcode.day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static java.lang.Character.isDigit;

public class TrebuchetPart1 {
    public static void main(String[] args) throws IOException {
        int ans = TrebuchetPart1.readFile();
        System.out.println(ans);
    }

    public static int valuePerString(String s) {
        String firstDigit = "";
        String secondDigit = "";
        for (int i = 0; i < s.length(); i++) {
            if (isDigit(s.charAt(i))) {
                secondDigit = String.valueOf(s.charAt(i));
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (isDigit(s.charAt(i))) {
                firstDigit = String.valueOf(s.charAt(i));
            }
        }

        return Integer.parseInt(firstDigit + secondDigit);
    }

    public static int readFile() throws IOException {
        Path filePath = Path.of("/Users/saumyemehrotra/IdeaProjects/LeetcodeQuestions/src/adventofcode/day1/Trebuchet1.txt");
        String content = Files.readString(filePath);

        String[] strings = content.split("\n");

        return Arrays.stream(strings)
                .map(TrebuchetPart1::valuePerString)
                .mapToInt(Integer::intValue)
                .sum();

    }
}
