package CodeJam;

public class InterestingIntegers {

    public static void main(String[] args) {
        System.out.println(interesting(451, 460));
    }

    private static int interesting(int A, int B) {
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (i != 0) {
                if (String.valueOf(i).length() == 1) {
                    count++;

                } else {
                    String num = String.valueOf(i);
                    double sum = 0;
                    double product = 1;
                    for (int j = 0; j < num.length(); j++) {
                        sum += Character.getNumericValue(num.charAt(j));
                        product *= Character.getNumericValue(num.charAt(j));
                    }
                    double d = (product / sum);
                    if ((d - (int) d) == 0) {
                        count++;
                    }
                }
            }


        }
        return count;
    }
}
