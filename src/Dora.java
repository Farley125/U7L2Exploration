public class Dora {
    public static void main(String[] args) {
        Digits dig = new Digits(123456789);
        Digits dig2 = new Digits(987654321);

        System.out.println(dig.getArrayList());
        System.out.println(dig.isStrictlyIncreasing());
        System.out.println(dig2.getArrayList());
        System.out.println(dig2.isStrictlyIncreasing());
    }
}
