import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        displayBanner("OOPS");
    }

    public static void displayBanner(String word) {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });

        patternMap.put('P', new String[]{
                " ******** ",
                " *       *",
                " *       *",
                " ******** ",
                " *        ",
                " *        ",
                " *        "
        });

        patternMap.put('S', new String[]{
                "  ********",
                " *        ",
                " *        ",
                "  ********",
                "         *",
                "         *",
                " ******** "
        });

        renderBanner(word, patternMap);
    }

    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    lineBuilder.append(pattern[i]).append("   ");
                }
            }

            System.out.println(lineBuilder);
        }
    }
}