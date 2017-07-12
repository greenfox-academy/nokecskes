package evenfibonacci;

/*
Even Fibonacci numbers
Each new term in the Fibonacci sequence is generated by adding the previous two terms.
By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million,
find the sum of the even-valued terms.
 */

public class EvenFibonacci {

  public static void main(String[] args) {
    int sumOfEvenFibonaccis = sumOfEvenFibonaccis();
    System.out.println(sumOfEvenFibonaccis);
  }

  public static int sumOfEvenFibonaccis() {
    int max = 4000000;
    int sum = 2;
    int valueBeforeSmaller = 1;
    int valueBeforeBigger = 2;

    for (int i = 3; i < max; i++) {
      if (i == valueBeforeSmaller + valueBeforeBigger) {
        valueBeforeSmaller = valueBeforeBigger;
        valueBeforeBigger = i;
        if (i % 2 == 0) {
          sum += i;
        }
      }
    }
    return sum;
  }
}
