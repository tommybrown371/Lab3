import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */
/**
 *
 * @author tommybrown371
 *
 */
public class Primary {

    public static void main(String[] args) {
        String url = urlToString("http://erdani.com/tdpl/hamlet.txt");
        System.out.println(wordCounter(url));
    }

    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

     public static int wordCounter(final String input) {
        String[] words = input.split(" ");
        int count = 0;
                for (int i = 0; i < words.length; i++) {
                    if (!(words[i].equals(""))) {
                        count++;
                    }
                }
        return count;

    }

}
