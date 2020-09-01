package Basics;

public class arrays {
    public static void main(String[] args) {
        //integer array
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        for(int i : numbers) {
            System.out.println(i);
        }

        //string array
        String[] names = {"tom", "bill", "kip", "rob", "toms", "thomas", "brandon", "bra"};
        for (String i : names) {
          if (i.length() <= 4) {
              System.out.println(i);
          }
          else
          {
              continue;
          }
        }


        //double array
        double[] decimalNums = {3.4, 4.2, 5.6, 4.3, 5.7, 4.6};
        for (int i = 0; i <= decimalNums.length-1; i++) {
            if (decimalNums[i] % .02 == 0) {
                System.out.println(i);
            }
            else
            {
                continue;
            }
        }

    }
}
