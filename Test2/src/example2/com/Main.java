package example2.com;

public class Main {
    public static void main(String[] args) {
        String haystack = "This is a simple haystack with some needles in the haystack.";
        String[] needles = {"haystack", "needles", "simple"};

        // Call the findNeedles function from NeedleFinder class
        NeedleFinder.findNeedles(haystack, needles);
    }
}
