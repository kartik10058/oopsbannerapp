public class OopsBannerApp {

    static class BannerPrinter {
        private String[] letterO = {"***  ", "*  * ", "*  * ", "*  * ", "***  "};
        private String[] letterP = {"***  ", "*  * ", "***  ", "*    ", "*    "};
        private String[] letterS = {" *** ", "*    ", " **  ", "   * ", "***  "};

        String[] getLetter(char c) {
            switch (c) {
                case 'O': return letterO;
                case 'P': return letterP;
                case 'S': return letterS;
                default:  return new String[]{"     ", "     ", "     ", "     ", "     "};
            }
        }

        void print(String word) {
            String[][] banner = new String[word.length()][];
            for (int i = 0; i < word.length(); i++) {
                banner[i] = getLetter(word.charAt(i));
            }
            int rows = banner[0].length;
            for (int row = 0; row < rows; row++) {
                StringBuilder line = new StringBuilder();
                for (String[] letter : banner) {
                    line.append(letter[row]).append("  ");
                }
                System.out.println(line.toString());
            }
        }
    }

    public static void main(String[] args) {
        BannerPrinter printer = new BannerPrinter();
        printer.print("OOPS");
    }
}