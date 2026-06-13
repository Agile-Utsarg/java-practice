import java.util.Scanner;

/*
void main(String[] args) {
    //Number system--------------
    // decimal to any base--------

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int dn = getValueIndecimal(n,b);
    System.out.println(dn);
}

 */
/*
static int getValueInBase(int n, int b){
    int rv = 0;
    int p = 1;
    while (n > 0){
        int dig = n % b;
        n = n / b;
        rv = rv + dig * p;
        p = p * 10;
    }
    return rv;

     */
    // any base to decimal ----------
/*
static int getValueIndecimal(int n, int b){
    int rv = 0;
    int p = 1;
    while (n>0){
        int digit = n % 10;
        n = n / 10;

        rv = rv + digit*p;
        p = p * b;
    }
    return rv;
    }
 */
  //Any base to base-----------
   /*
    public static int getValueInDecimal(int n, int b) {
        int rv = 0;
        int p = 1;

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;

            rv = rv + digit * p;
            p = p * b;
        }

        return rv;
    }

    public static int getValueInBase(int n, int b) {
        int rv = 0;
        int p = 1;

        while (n > 0) {
            int rem = n % b;
            n = n / b;

            rv = rv + rem * p;
            p = p * 10;
        }

        return rv;
    }

    public static int anyBaseToAnyBase(int n, int sourceBase, int destBase) {
        int decimalValue = getValueInDecimal(n, sourceBase);
        int finalValue = getValueInBase(decimalValue, destBase);

        return finalValue;
    }
/*
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();

        int ans = anyBaseAddtion(n, sourceBase, destBase);

        System.out.println(ans);
    }
   */
 //any base to addition-------------
 public class Numbersystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            int b = scn.nextInt();
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
            System.out.println(getProduct(b,n1, n2));
        }
        /*
            public static int getSum(int b, int n1, int n2) {

                int rv = 0;
                int p = 1;
                int c = 0;

                while (n1 > 0 || n2 > 0 || c > 0) {

                    int d1 = n1 % 10;
                    int d2 = n2 % 10;

                    n1 = n1 / 10;
                    n2 = n2 / 10;

                    int d = d1 + d2 + c;

                    c = d / b;
                    d = d % b;

                    rv = rv + d * p;
                    p = p * 10;
                }

                return rv;
            }

         */
        // any base to difference----------

       /*
        public static int getDifference(int b, int n1, int n2) {

            int rv = 0;
            int p = 1;
            int borrow = 0;

            while (n2 > 0) {

                int d2 = n2 % 10;
                int d1 = n1 % 10;

                n2 = n2 / 10;
                n1 = n1 / 10;

                int d = d2 - d1 + borrow;

                if (d < 0) {
                    d += b;
                    borrow = -1;
                } else {
                    borrow = 0;
                }

                rv += d * p;
                p *= 10;
            }

            return rv;
        }

        */

    // any base to multipliction------------
        public static int getSum(int b, int n1, int n2) {

            int rv = 0;
            int p = 1;
            int c = 0;

            while (n1 > 0 || n2 > 0 || c > 0) {

                int d1 = n1 % 10;
                int d2 = n2 % 10;

                n1 /= 10;
                n2 /= 10;

                int d = d1 + d2 + c;

                c = d / b;
                d = d % b;

                rv += d * p;
                p *= 10;
            }

            return rv;
        }

        public static int getProductWithSingleDigit(int b, int n1, int d2) {

            int rv = 0;
            int p = 1;
            int c = 0;

            while (n1 > 0 || c > 0) {

                int d1 = n1 % 10;
                n1 /= 10;

                int d = d1 * d2 + c;

                c = d / b;
                d = d % b;

                rv += d * p;
                p *= 10;
            }

            return rv;
        }

        public static int getProduct(int b, int n1, int n2) {

            int rv = 0;
            int p = 1;

            while (n2 > 0) {

                int d2 = n2 % 10;
                n2 /= 10;

                int sprd = getProductWithSingleDigit(b, n1, d2);

                rv = getSum(b, rv, sprd * p);

                p *= 10;
            }

            return rv;
        }


    }




