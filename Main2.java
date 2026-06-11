//function---------------
/*
void display(int n, int r, int npr){
    System.out.println( n + "p" + r + "=" + npr);
}
int fact(int x){
    int rv =  1;
    for(int i=1; i<=x; i++){
        rv *= i;
    }
    return rv;
}
void main() {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int r = scn.nextInt();

    int nfact = fact(n); //function call
    int nmrfact = fact(n-r);//function call

    int npr = nfact / nmrfact;
    display(n, r ,npr);
}

 */

import java.util.Scanner;

public class Main2 {
    /*
        public static int getDigitFrequency(int n, int d){
            int rv = 0;
            while(n > 0){
                int dig = n % 10;
                n = n / 10;
                if(dig == d){
                    rv++;
                }
            }

            return rv;
        }

        public static void main(String[] args){

            Scanner scn = new Scanner(System.in);

            int n = scn.nextInt();
            int d = scn.nextInt();

            int f = getDigitFrequency(n, d);

            System.out.println(f);
        }

     */
//add two number by using function--------
    /*
static int add(int a, int b) {
    return a + b;
}
    static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n1 = scn.nextInt();
       int n2 = scn.nextInt();
       int sum = add(n1, n2);
       System.out.println(sum);
    }
}

     */
    //print square----
    /*
static int square(int x) {
    return x * x;
}
static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int n2 = square(n);
    System.out.print(n2);
}

     */
    /*
    static boolean isEven(int x){
        return x % 2 == 0;
    }
    static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean num = isEven(n);
        System.out.print(num);
    }

     */
}
