public class StringReplace {
    public static String replace(String s, String target, String replacement) {
        return s == null || target == null || replacement == null 
            ? s 
            : s.replace(target, replacement);
    }

    public static String replace(String s, char target, char replacement) {
        return s == null 
            ? s 
            : s.replace(target, replacement);
    }
}