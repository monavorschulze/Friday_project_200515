public class Password {

    public static boolean checkpasswordlengh(String password) {

        return password.length() >= 8;
    }

    public static boolean checkpasswordcapital(String password) {

        return password.charAt() <= 90;

    }

    public static boolean checkpasswordnumber(String password) {

        return password.contains()<= 9;

    }
}
