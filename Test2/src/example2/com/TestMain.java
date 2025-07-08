package example2.com;

public class TestMain {
    public static void main(String[] args) {
        String haystack = "A haystack with needles, axes, and nails in the haystack.";
        String[] needles = {"needles","haystack","nails","axes","needles"};

        // Call the findNeedles function from NeedleFinder class
        NeedleFinder1.findNeedles(haystack, needles);
    }
}
