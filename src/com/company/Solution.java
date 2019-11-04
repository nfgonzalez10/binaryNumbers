package com.company;

import java.util.Scanner;

public class Solution {

  public void countNumberOne(int number) {

    int countNumberOne = 0;
    int result = 0;
    char[] binaryNumber = Integer.toBinaryString(number).toCharArray();
    for (int i = 0; i < binaryNumber.length; i++) {
      if (i != 0) {
        if ((binaryNumber[i] == binaryNumber[i - 1]) || (binaryNumber[i] == '1')) {
          countNumberOne++;
        } else {
          countNumberOne = 0;
        }
      } else {
        if (binaryNumber[i] == '1') {
          countNumberOne++;
        }
      }
      if (countNumberOne > result){
        result = countNumberOne;
      }

    }


    System.out.print(result);

  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    Solution solution = new Solution();
    solution.countNumberOne(n);
    scanner.close();
  }
}
