package U1T11Folder;

public class CustomStringMethods {
    public CustomStringMethods() {
    }

    public boolean longerThan(String myString, int maxLength) {
        if (myString.length() > maxLength) {
            return true;
        } else {
            return false;
        }

    }

    public String funnyString(String str, int idx) {
        String firstChar = str.substring(idx, idx + 1);
        String lastChar = str.substring(idx, idx + 1);
        String newString = firstChar + str + lastChar;
        return newString;

    }

    public String halvesReversed(String myString) {
        int length = myString.length();
        int halfLength = length / 2;
        String firstHalf = myString.substring(0, halfLength);
        String secondHalf = myString.substring(halfLength);
        String reversedString = secondHalf + firstHalf;
        return reversedString;
    }
    public String pigLatin(String orig) {
        String firstChar = orig.substring(0, 1);
        String restOfString = orig.substring(1);
        String pigLatinString = restOfString + firstChar + "ay";
        return pigLatinString;
    }
    public String removeCharacter(String myString, int removeIdx) {
        if (removeIdx < 0 || removeIdx >= myString.length()) {
            return myString;
        } else {
            String newString = myString.substring(0, removeIdx) + myString.substring(removeIdx + 1);
            return newString;
        }

    }

    public String insertAt(String orig, String insertText, String searchStr) {
        if (orig.indexOf(searchStr) == -1) {
            return orig + insertText;
        } else {
            int index = orig.indexOf(searchStr);
            String newString = orig.substring(0, index) + insertText + orig.substring(index);
            return newString;
        }
    }
  public String endUp(String myString, int numToCap){

        char firstChar = myString.charAt(0);

        if (Character.isUpperCase(firstChar)) {
            return myString.toUpperCase();
        } else {
            return myString.toLowerCase();
        }
    }

    public String yellOrWhisper(String myString) {
        if (Character.isUpperCase(myString.charAt(0))) {
            return myString.toUpperCase();
        } else {
            return myString.toLowerCase();
        }
    }
}
