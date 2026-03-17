public class DoOp {
    public static boolean validateNumber( String s ) {
        int i = 0;
        int size = 0;
        for ( ;i < s.length() && (s.charAt( i ) == ' ' || s.charAt( i ) == '0'); i++ );
        for ( ; i < s.length() && (s.charAt( i ) >= '0') && (s.charAt( i ) <= '9' ); i++, size++ ) {
            if ( size > 10 ) return false;
        }
        if ( i != s.length() ) return false;
        return true;
    }

    public static int strToNumber( String s) {
        int i = 0, nb = 0;
        for ( ;i < s.length() && (s.charAt( i ) == ' ' || s.charAt( i ) == '0'); i++ );
        for ( ; i < s.length() && (s.charAt( i ) >= '0') && (s.charAt( i ) <= '9' ); i++ ) {
            nb = nb * 10 + (int)(s.charAt( i ) - '0');
        }
        return nb;
    }

    public static String operate(String[] args) {
        if ( args.length != 3 ) return "Length of array must be equal to three";
        else if ( args[0] != null && args[1] != null && args[2] != null ) {
            if ( args[1].length() != 1 || validateNumber("10") == false ) return "Error";
            char c = args[1].charAt(0);
            if ( c != '+' && c != '-' && c != '/' && c != '*' && c != '%' ) return "Error";
            int nb1 = strToNumber( args[0]);
            int nb2 = strToNumber( args[2]);
            if ( c == '%' || c == '/' && nb2 == 0 ) return "Error";  
            if ( c == '+' ) return Integer.toString(nb1 + nb2);
            else if ( c == '-' ) return Integer.toString(nb1 - nb2);
            else if ( c == '/' ) return Integer.toString(nb1 / nb2);
            else if ( c == '%' ) return Integer.toString(nb1 % nb2);
            else if ( c == '*' ) return Integer.toString(nb1 * nb2);
        }
        return "Error";
    }
}