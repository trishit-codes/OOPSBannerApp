public class Main {
    public static void main(String[] args) {
        displayBanner(); // Call the UC4 function
    }

    public static void displayBanner() {
        // UC3 banner lines stored in a String array
        String[] bannerLines = {
            String.join("", "  *****   ", "  *****   ", " ******** ", " ******** "),
            String.join("", " *     *  ", " *     *  ", " *       *", " *        "),
            String.join("", "*       * ", "*       * ", "*       * ", "*        "),
            String.join("", "*       * ", "*       * ", " ******** ", " ******** "),
            String.join("", "*       * ", "*       * ", "*         ", "        * "),
            String.join("", " *     *  ", " *     *  ", "*         ", "*       * "),
            String.join("", "  *****   ", "  *****   ", "*         ", " ******** ")
        };

        // Print each line using an enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}