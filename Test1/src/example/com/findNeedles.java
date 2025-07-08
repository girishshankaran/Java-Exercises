package example.com;

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



