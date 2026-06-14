import java.util.Scanner;

void main(String[] args) {
    //Number system--------------
    // decimal to any base--------

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int dn = getvalueIndecimal(n,b);
    System.out.println(dn);
}
//decimal to any base---------
/*
static int getValueInbase(int n, int b){
    int rv = 0;
    int p = 1;
    while (n > 0){
        int rem = n % b;
        n = n / b;

        rv = rv + rem * p;
        p = p * 10;
    }
    return rv;
    }
 */
//any base to decimal--------
/*
static int getvalueIndecimal(int n, int b) {
      int rv =0;
      int p = 1;
      while(n>0) {
          int dig = n % 10;
          n = n / 10;

          rv = rv + dig * p;
          p = p * b;
      }
      return rv;
}

 */






