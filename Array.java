import java.io.*;
//void main(String[] args) {
    /*
 int[] arr; //array decalration
    //array length
    arr = new int[5];
    arr[0] = 33;
    arr[1] = 35;
    arr[2] = 57;
    arr[3] = 76;
    arr[4] = 12;

    //System.out.println(arr.length);
    for(int i =0; i < arr.length; i++){
        System.out.println(arr[i]);
    }
     */
    /*
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     //array declaration and array length-----
     int[] arr = new int[n];
     for(int i=0; i<n; i++){
         arr[i] = scn.nextInt();
     }
     System.out.println(arr[i]);

     */
    //array memory---------------------------
    //assement allocation
    /*
    int[] arr; //array decalration
    //array length
    arr = new int[5];
    arr[0] = 33;
    arr[1] = 35;
    arr[2] = 57;
    arr[3] = 76;
    arr[4] = 12;

    int[] two = arr;
    two[2] = 590;

    //System.out.println(arr.length);
    for(int i =0; i < two.length; i++){
        System.out.println(two[i]);
    }

     */
// Swap the array------------------------
    public class Array {
        public static void swap(int[] arr, int i, int j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void main(String[] args) {

            int[] arr = new int[5];

            arr[0] = 33;
            arr[1] = 35;
            arr[2] = 57;
            arr[3] = 76;
            arr[4] = 12;

            swap(arr, 0, 4);

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }

