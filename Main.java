void main() {
        //PATTERN Question
        // Square Pattern
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // no of rows
        //squre pattern
       /*
        for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                        System.out.print("*");
                }
                System.out.println();
        }

        */
       /*
       //right triangle pattern
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
                for(int j = 1; j <= str; j++){
                        System.out.print("*\t");
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

     //diamond pattern
    /*
        int sp = n/2;
        int str = 1;
        for(int i = 1; i <= n; i++){
                for(int j =1; j <= sp; j++){
                       System.out.print("\t");
                }
                for(int j =1; j <=str; j++){
                        System.out.print("*\t");
                }
                if(i <= n/2){
                        sp--;
                        str+=2;
                }else{
                        sp++;
                        str-=2;
                }
                System.out.println();


        }
     */

        //Number pattern
        /*
        for(int i = 1; i<=n; i++){
                for(int j = 1; j<=i; j++){
                        System.out.print(j);
                }
                System.out.println();
        }

         */
        //double vertical border pattern
        /*
        int str = n / 2 + 1;
        int sp = 1;
        for(int i=1; i <=n; i++){
                for(int j=1; j<=str; j++){
                        System.out.print("*\t");
                }
                for(int j=1; j<=sp; j++){
                        System.out.print("\t");
                }

                for(int j=1; j<=str; j++){
                        System.out.print("*\t");
                }
                if(i <= n/2){
                        str--;
                        sp+=2;
                }
                else{
                        str++;
                        sp-=2;
                }
                System.out.println();
        }

         */
        //Print diagonal Pattern
        /*
        for(int i = 1; i<= n; i++){
                for(int j =1; j<=n; j++){
                        if(i == j) {
                                System.out.print("*\t");
                        }
                        else{
                                System.out.print("\t");
                        }
                }
                System.out.println();
        }

         */
        //Reverse diagonal pattern
        /*
        for(int i =1; i<=n; i++){
                for(int j =1; j<=n; j++){
                        if(i + j == n+1){
                                System.out.print("*\t");
                        }
                        else {
                                System.out.print("\t");
                        }
                }
                System.out.println();
        }

         */
        //cross diagonal pattern
        /*
        for(int i =1; i <= n; i++){
                for(int j = 1; j<=n; j++){
                        if(i == j || i + j == n+1){
                                System.out.print("*\t");
                        }
                        else {
                                System.out.print("\t");
                        }
                }
                System.out.println();
        }
         */
//hollow diamaond
        /*
        int os = n /2;
        int is = -1;
        for(int i =1; i<=n; i++){
                for(int j=1; j<=os; j++){
                        System.out.print("\t");
                }
                System.out.print("*\t");
                for(int j=1; j<=is; j++){
                        System.out.print("\t");
                }
                if(i>1 && i < n){
                        System.out.print("*\t");
                }
                if(i <= n/2){
                        os--;
                        is+=2;
                }
                else {
                        os++;
                        is-=2;
                }
                System.out.println();
        }

         */
        //increasing oder series(sequence)
        /*
        int val = 1;
        for(int i =1; i<=n; i++){
                for(int j=1; j<=i; j++) {
                        System.out.print(val + "\t");
                        val++;
                }
                System.out.println();
        }

         */
        //fibonacci pattern series
        /*
       int a =0;
       int b =1;
       for(int i=1; i<=n; i++){
               for(int j=1; j<=i; j++){
                       System.out.print(a + "\t");
                       int c = a + b;
                       a = b;
                       b = c;
               }
            System.out.println();
       }

         */
        //Pascal Pattern triangle(last)

        for(int i = 1; i<=n; i++){
                int val =1;
                for(int j = 1; j<=i; j++){
                        System.out.print(val + "\t");
                        val = val*(i-j) / j;
                }
                System.out.println();
        }


        /*
        for(int i = 1; i <= 10; i++){
                int result = n * i;
                System.out.println(n +" * "+ i + " = " + result);
        }
         */
}