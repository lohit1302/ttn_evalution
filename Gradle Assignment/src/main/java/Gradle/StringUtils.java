public class StringUtils {
    String reverseString(String inputString)
    {
        return org.apache.commons.lang3.StringUtils.reverse(inputString);
    }

    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        System.out.println(stringUtils.reverseString("Hello"));
    }
}
