public class LargestSumSubarray {

     public static void main(String []args){
        System.out.println("Largest sum obtained from a continuous sub-array: ");
        int[] numbers = {-2, -3, 4, -1, -2, 1, 5, -3};
        
        int maxCurrent = 0;
        int maxSoFar = 0;
        
        for (int i: numbers) {
            maxCurrent += i;
            
            maxCurrent = Math.max(0, maxCurrent);
            
            maxSoFar = Math.max(maxCurrent, maxSoFar);
        }
        
        System.out.println(maxSoFar);
     }
}
