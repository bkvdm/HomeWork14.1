public class Main {
    public static int changeValue(int value) {
        int changValue = 22;
        return changValue;
    }

    public static void main (String[] arg) {
        int value = 33;
        value = changeValue(value);
        System.out.println("value = " + value);
    }
}