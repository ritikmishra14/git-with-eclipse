public class Divide {
  public static void main(String[] args) {
    int number = 976;
    boolean flag = false;
    for (int i = 2; i <= number / 2; i++) {
      if (number % i == 0) {
        flag = true;
        break;
      }
    }
    if (!flag) {
      System.out.println("Not a prime"+ "I am making the changes");

    } else {
      System.out.println("Is a prime  ...");
    }
  }
}
