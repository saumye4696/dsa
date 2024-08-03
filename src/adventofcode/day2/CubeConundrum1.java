package adventofcode.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CubeConundrum1 {
    private static final String GAME_NUMBER_REGEX = "Game (\\d+):"; // fetch the game number
    private static final String SPLIT_DIGITS_AND_COLOURS_REGEX = "(\\d+) (blue|green|red)"; // fetch the string for a particular pick in a game
    private static final String BALL_NUMBER_REGEX = "(\\d+)"; // fetch the number of balls for a colour
    private static final String BALL_COLOUR_REGEX = "(blue|green|red)"; // fetch the word for the colour

    public static void main(String[] args) throws IOException {
        int i = CubeConundrum1.readFile();
        System.out.println(i);
    }

    public static int valuePerString(String s) {
        Map<String, Integer> cubes = new HashMap<>();
        cubes.put("red", 12);
        cubes.put("green", 13);
        cubes.put("blue", 14);


        // Extracting gameNumber number
        int gameNumber = 0;
        Pattern pattern1 = Pattern.compile(GAME_NUMBER_REGEX);
        Matcher matcher = pattern1.matcher(s);
        if (matcher.find()) {
            gameNumber = Integer.parseInt(matcher.group(1));
        } else {
            System.out.println("Game number not found in the string: " + s);
        }

        // Remove gameNumber from string
        String stringWithoutGame = s.split(":")[1].trim();

        String[] picksFromOneGame = stringWithoutGame.split(";");
        for (String pick : picksFromOneGame) {
            pick.trim();
        }

        Pattern pattern = Pattern.compile(SPLIT_DIGITS_AND_COLOURS_REGEX); // this will split digits and colours
        for (String pick : picksFromOneGame) {
            Matcher colourMatcher = pattern.matcher(pick); // each semi-colon divided string

            while (colourMatcher.find()) { // each number and colour
                Pattern ballNumberPattern = Pattern.compile(BALL_NUMBER_REGEX);
                Pattern ballNumberPatternColour = Pattern.compile(BALL_COLOUR_REGEX);
                Matcher ballNumberMatcher = ballNumberPattern.matcher(colourMatcher.group());
                Matcher ballNumberMatcherColour = ballNumberPatternColour.matcher(colourMatcher.group());

                // Here, we will have ball count and colours so that we can match from the string
                while (ballNumberMatcher.find() && ballNumberMatcherColour.find()) {
                    int ballCount = Integer.parseInt(ballNumberMatcher.group());
                    String ballColour = ballNumberMatcherColour.group();

                    if (cubes.get(ballColour) < ballCount) {
                        return 0;
                    }
                }
            }
        }
        return gameNumber;
    }

    public static int readFile() throws IOException {
        Path filePath = Path.of("/Users/saumyemehrotra/IdeaProjects/LeetcodeQuestions/src/adventofcode/day2/CubeConundrum1.txt");
        String content = Files.readString(filePath);

        String[] strings = content.split("\n");

        return Arrays.stream(strings)
                .map(CubeConundrum1::valuePerString)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
