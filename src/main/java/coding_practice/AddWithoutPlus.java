package coding_practice;

public class AddWithoutPlus {

//    public static int addWithoutPlus(int a, int b) {
//        if (b == 0) return a;
//        return addWithoutPlus(a ^ b, (a & b) << 1);
//    }

    public static int addWithoutPlus(int a, int b) {
        while (b != 0) {
            // Carry now contains common set bits of a and b
            var carry = a & b;

            // Sum of bits of a and b where at least one of the bits is not set
            a = a ^ b;

            // Carry is shifted by one so that adding it to a gives the required sum
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        // Same test cases
        System.out.println("5 + 3 = " + addWithoutPlus(5, 3));
        System.out.println("20 + 30 = " + addWithoutPlus(20, 30));
        System.out.println("-4 + 6 = " + addWithoutPlus(-4, 6));
        System.out.println("0 + 15 = " + addWithoutPlus(0, 15));
        System.out.println("7 + 0 = " + addWithoutPlus(7, 0));
    }

}