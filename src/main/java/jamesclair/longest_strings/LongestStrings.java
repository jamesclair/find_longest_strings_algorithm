package jamesclair.longest_strings;

import java.util.ArrayList;

public class LongestStrings {
    String[] inputArray;
    int maxStringLength;
    ArrayList<String> outputArray;

    public LongestStrings(String[] inputArray) {
        this.inputArray = inputArray;
        setMaxStringLength();
        this.outputArray = new ArrayList<String>();
    }

    private void setMaxStringLength() {
        for (int i = 0; i < inputArray.length; i++) {
            if (isGreaterThanMaxLength(i))
                maxStringLength = inputArray[i].length();
        }
    }

    private boolean isGreaterThanMaxLength(int index) {
        return inputArray[index].length() > maxStringLength;
    }

    public String[] getLongestStrings() {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() == maxStringLength) {
                outputArray.add(inputArray[i]);
            }
        }
        return outputArray.toArray(new String[outputArray.size()]);
    }
}
