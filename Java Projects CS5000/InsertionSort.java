import java.util.*;

public class InsertionSort {
   public static void insertionSort(int[] ar) {
      for(int i = 1; i < ar.length; i++) {
         int index = ar[i];
         int j = i;
         while(j > 0 && ar[j-1] > index) {
            ar[j] = ar[j-1];
            j--;
         }
         ar[j] = index;
      }
   }
   
   public static void main(String[] args) {
   
   int[] sort = new int[6];
   sort[0] = 82;
   sort[1] = 73;
   sort[2] = 8;
   sort[3] = 900;
   sort[4] = 1;
   sort[5] = 543;
   
   insertionSort(sort);
   for(int i = 0; i<sort.length; i++){
   System.out.print(sort[i]+"  ");}
   }
}