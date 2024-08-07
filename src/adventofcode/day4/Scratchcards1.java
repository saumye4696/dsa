package adventofcode.day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scratchcards1 {
    private static final String FETCH_CARD_NUMBER_REGEX = "Card +(\\d+)";
    private static final String FETCH_NUMBERS_FROM_STRING_REGEX = "\\s+";

    public static void main(String[] args) throws IOException {
        int i = Scratchcards1.readFile();
        System.out.println(i);
    }

    public static int scorePerScratchcard(String s) {
        int cardNumber = 0;

        // Fetching the card number
        Pattern cardNumberRegex = Pattern.compile(FETCH_CARD_NUMBER_REGEX);
        Matcher cardNumberMatcher = cardNumberRegex.matcher(s);
        if (cardNumberMatcher.find()) {
            cardNumber = Integer.parseInt(cardNumberMatcher.group(1));
        } else {
            System.out.println("Card number not present in the string.");
        }

        // Fetching the 2nd part of the string with the two sets of numbers
        String listString = s.split(":")[1].trim();

        // Fetch the two integer lists from the two strings
        String s1 = listString.split("\\|")[0].trim();
        String s2 = listString.split("\\|")[1].trim();

        int[] il1 = Arrays.stream(s1.split(FETCH_NUMBERS_FROM_STRING_REGEX))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] il2 = Arrays.stream(s2.split(FETCH_NUMBERS_FROM_STRING_REGEX))
                .mapToInt(Integer::parseInt)
                .toArray();

        // match the lists to check the points
        int count = 0;
        for (int i = 0; i < il1.length; i++) {
            for (int j = 0; j < il2.length; j++) {
                if (il1[i] == il2[j]) {
                    count++;
                }
            }
        }
        if (count == 0)
            return 0;
        int points = count > 1 ? (int) Math.pow(2, count - 1) : 1;

        return points;
    }

    public static int readFile() throws IOException {
        Path filePath = Path.of("/Users/saumyemehrotra/IdeaProjects/LeetcodeQuestions/src/adventofcode/day4/Scratchcards.txt");
        String content = Files.readString(filePath);

        String[] strings = content.split("\\n");

        return Arrays.stream(strings)
                .map(Scratchcards1::scorePerScratchcard)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
