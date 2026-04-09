public class OopsBannerApp {
    static String[] letterO = {"***  ", "*  * ", "*  * ", "*  * ", "***  "};
    static String[] letterP = {"***  ", "*  * ", "***  ", "*    ", "*    "};
    static String[] letterS = {" *** ", "*    ", " **  ", "   * ", "***  "};

    static void printBanner(String[][] banner) {
        int rows = banner[0].length;
        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();
            for (String[] letter : banner) {
                line.append(letter[row]).append("  ");
            }
            System.out.println(line.toString());
        }
    }

    static String[][] buildBanner(String word) {
        String[][] banner = new String[word.length()][];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            switch (c) {
                case 'O': banner[i] = letterO; break;
                case 'P': banner[i] = letterP; break;
                case 'S': banner[i] = letterS; break;
                default:  banner[i] = new String[]{"     ", "     ", "     ", "     ", "     "};
            }
        }
        return banner;
    }

    public static void main(String[] args) {
        String[][] banner = buildBanner("OOPS");
        printBanner(banner);
    }
}