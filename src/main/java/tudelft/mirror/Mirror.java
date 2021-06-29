package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";

        int begin = 0;
        int end = string.length() - 1;
        int endChar = string.length() - 1;
        for (; begin <= end; begin++, endChar--) {
            if (string.charAt(begin) == string.charAt(endChar)) {
                mirror += String.valueOf(string.charAt(endChar));
            }
            else {
                break;
            }
        }

        return begin == end ? string : mirror;
    }
}
