package day7;

public class Classwork07_01 {
    public static void main(String[] args) {
        System.out.println(smartDepositBox(true, false));
        System.out.println(smartDepositBox(false, true));
        System.out.println(smartDepositBox(false, false));
        split();

        System.out.println(smartDepositBoxVersionTwo(true, false));// -> false
        System.out.println(smartDepositBoxVersionTwo(false, true));// -> false
        System.out.println(smartDepositBoxVersionTwo(false, false));// -> false
        System.out.println(smartDepositBoxVersionTwo(true, true));// -> true
        split();

        boolean mamaPermission = true;
        boolean papaPermission = true;
        boolean omaPermission = false;
        System.out.println(verySmartDepositBoxVersionThree(mamaPermission, papaPermission, omaPermission));
        split();

        System.out.println(bigBadaBoom(true, true)); //-> true
        System.out.println(bigBadaBoom(false, false)); // -> false
        System.out.println(bigBadaBoom(true, false)); //-> false

    }

    private static Boolean bigBadaBoom(boolean b, boolean b1) {
        return b & b1;
    }

    private static Boolean verySmartDepositBoxVersionThree(boolean mamaPermission, boolean papaPermission, boolean omaPermission) {
        //return mamaPermission && papaPermission || omaPermission;
        return omaPermission || smartDepositBoxVersionTwo(mamaPermission, papaPermission);
    }

    private static void split() {
        System.out.println("-----------------");
    }

    private static Boolean smartDepositBoxVersionTwo(boolean b1, boolean b2) {
        return b1 & b2;
    }

    private static Boolean smartDepositBox(boolean b1, boolean b2) {
        boolean c = b1 || b2;
        return c;
    }
}
