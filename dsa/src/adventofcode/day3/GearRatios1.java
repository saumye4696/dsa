package adventofcode.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class GearRatios1 {
    public static void main(String[] args) throws IOException {
        char[][] grid = readFile();


    }

    private static void process(char[][] grid) {

    }

    private static char[][] readFile() throws IOException {
        Path path = Path.of("/Users/saumyemehrotra/IdeaProjects/LeetcodeQuestions/src/adventofcode/day3/GearRatios.txt");
        List<String> lines = Files.readAllLines(path);

        int rows = lines.size();
        int cols = lines.get(0).length();

        char[][] grid = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            String line = lines.get(i);
            for (int j = 0; j < cols; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        return grid;
    }

}
