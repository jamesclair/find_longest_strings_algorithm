package jamesclair.longest_strings;

public class FindLongestStrings {
    public static void main(String[] inputArray) {
        String[] longestStrings = new LongestStrings(inputArray).getLongestStrings();
        for (String longString: longestStrings)
            System.out.println(longString);
    }
}