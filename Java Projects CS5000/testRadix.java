public class testRadix {

public static int[] extractDigit(int[] input, int digits) {
   int[] input2 = new int[input.length];
   
   for(int i = 0; i<input.length; i++) {
      
      input2[i] = (input[i]%10000)/1000;
      
      
      }
   return input2;
}
   
   
public static void main(String[] args) {
int[] numbers = new int[6];
      numbers[0] = 212;
      numbers[1] = 18;
      numbers[2] = 9332;
      numbers[3] = 3;
      numbers[4] = 14;
      numbers[5] = 5444;
      
int[] x = extractDigit(numbers, 3);
for(int i= 0; i<numbers.length; i++) {
System.out.print(x[i]+"  ");
}
}
}