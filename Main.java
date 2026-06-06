void main() {
        //System.out.println("hello");
        // Square Pattern
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // no of rows
        //outer
        /*
        for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                        System.out.print("*");
                }
                System.out.println();
        }
         */
       /*
       //right triangle patteren
        for(int i = 1; i <= n; i++){
                for(int j = 1; j<= i; j++){
                        System.out.print("*");
                }
                System.out.println();
        }

        */
        //inverted triangle
        /*
        for(int i = n; i>=1; i--){
                for(int j = 1; j <= i; j++){
                        System.out.print("*");
                }
                System.out.println();
        }

         */
        //lift triangle
        /*
        int sp = n-1;
        int str = 1;
        for(int i = 1; i <= n; i++){
                for(int j = 1; j <= sp; j++){
                        System.out.print("\t");
                }
                for(int j = n; j <= str; j++){
                        System.out.print("*");
                }
                sp--;
                str++;
                System.out.println();

        }


         */
        /*
        int sp =0;
        int str = n;
        for(int i = 1; i <= n; i++){
                //space
                for(int j = 0; j <=sp; j++){
                        System.out.print("\t");
                }
                //stars
                for(int j =1; j <= str; j++){
                        System.out.print("*\t");
                }
                sp++;
                str--;
                System.out.println();
           }
         */


}