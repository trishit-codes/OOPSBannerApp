public class Main {

    public static void main(String[] args) {
        displayBanner("OOPS");
    }

    public static void displayBanner(String word) {

        CharacterPattern[] patterns = new CharacterPattern[]{
                new CharacterPattern('O', new String[]{
                        "  *****  ",
                        " *     * ",
                        "*       *",
                        "*       *",
                        "*       *",
                        " *     * ",
                        "  *****  "
                }),
                new CharacterPattern('P', new String[]{
                        " ******** ",
                        " *       *",
                        " *       *",
                        " ******** ",
                        " *        ",
                        " *        ",
                        " *        "
                }),
                new CharacterPattern('S', new String[]{
                        "  ********",
                        " *        ",
                        " *        ",
                        "  ********",
                        "         *",
                        "         *",
                        " ******** "
                })
        };

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char c : word.toCharArray()) {
                for (CharacterPattern pattern : patterns) {
                    if (pattern.getCharacter() == c) {
                        lineBuilder.append(pattern.getPattern()[i]).append("   ");
                    }
                }
            }

            System.out.println(lineBuilder);
        }
    }

    // Static Inner Class
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}