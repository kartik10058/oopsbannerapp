public class OopsBannerApp {
    static String[] letterO = {"***  ", "*  * ", "*  * ", "*  * ", "***  "};
    static String[] letterP = {"***  ", "*  * ", "***  ", "*    ", "*    "};
    static String[] letterS = {" *** ", "*    ", " **  ", "   * ", "***  "};

    public static void main(String[] args) {
        String[][] oopsBanner = {letterO, letterO, letterP, letterS};
        int rows = oopsBanner[0].length;
        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();
            for (String[] letter : oopsBanner) {
                line.append(letter[row]).append("  ");
            }
            System.out.println(line.toString());
        }
    }
}