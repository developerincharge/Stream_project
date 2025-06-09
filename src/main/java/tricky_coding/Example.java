package tricky_coding;

public class Example {

      public static void test() {
          try {
              // Parent tr block
              try {
                  int b = 0;
                  int c = 1 / b;
              } catch (ArithmeticException e) {
                  System.out.println("Caught ArithmeticException in child try block");
              }
              int[] a = new int[0];
              System.out.println(a[1]);  // throws ArrayIndexOutOfBoundsException
          } catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("Caught ArrayIndexOutOfBoundsException in parent try block");
          }
      }

    public static void main(String[] args) {
        test();
    }
}
