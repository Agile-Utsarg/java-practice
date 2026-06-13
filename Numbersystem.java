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

    }
}
