public class SmallestSumSubarray {

     public static void main(String []args){
        System.out.println("Smallest sum obtained from a continuous sub-array: ");
        int[] numbers = {3, -4, 2, -3, -1, 7, -5};
        
        int minCurrent = 0;
        int minSoFar = 0;
        
        for (int i: numbers) {
            minCurrent += i;
            
            minCurrent = Math.min(0, minCurrent);
            
            minSoFar = Math.min(minCurrent, minSoFar);
        }
        
        System.out.println(minSoFar);
     }
}
