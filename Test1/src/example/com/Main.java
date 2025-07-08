package example.com;

public class Main {
    public static void main(String[] args) {
        String haystack = "This is a simple haystack with some simple needles in the haystack.";
        String[] needles = {"haystack", "needles", "simple"};

        // Call the findNeedles function
        findNeedles(haystack, needles);
    }

    // Include the findNeedles function here
    public static void findNeedles(String haystack, String[] needles) {
        if (needles.length > 5) {
            System.err.println("Too many words!");
        } else {
            int[] countArray = new int[needles.length];
            for (int i = 0; i < needles.length; i++) {
                String[] words = haystack.split("\\W+");
                for (int j = 0; j < words.length; j++) {
                    if (words[j].compareTo(needles[i]) == 0) {
                        countArray[i]++;
                    }
                }
            }
            for (int i = 0; i < needles.length; i++) {
                System.out.println(needles[i] + ": " + countArray[i]);
            }
        }
    }
}