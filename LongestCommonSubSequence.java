public class LongestCommonSubSequence {

     public static void main(String []args){
        System.out.println("LongestCommonSubSequence");
        
        String a = "ABCDE";
        String b = "ABCDEF";
        int m = a.length(); int n = b.length();
        int[][] longCount = getCount(a, b, m, n);
        System.out.println(longCount[m][n]);
        
        System.out.println(getLongest(a, b, m, n, longCount));
        
        
     }
     
     private static String getLongest(String a, String b, int m, int n, int[][] numbers) {
         
         if ( m == 0 || n == 0) {
             return new String();
         }
         
         if (a.charAt(m-1) == b.charAt(n-1)) {
             return getLongest(a, b, m-1, n-1, numbers) + a.charAt(m-1);  
         } 
         
         if (numbers[m-1][n] > numbers[m][n-1]) {
             return getLongest(a, b, m -1, n , numbers);
         } else {
             return getLongest(a, b, m, n-1, numbers);
         }
         
        
     }
     
     private static int[][] getCount(String a, String b, int m, int n) {
         int[][] longestLen = new int[m+1][n + 1];
         
         for (int i = 1; i <= m; i++) {
             for (int j = 1; j <= n; j++) {
                 // first case - if char at end is same, increment from top diagonal value.
                 if (a.charAt(i-1) == b.charAt(j-1)) {
                     longestLen[i][j] = longestLen[i-1][j-1] + 1;
                 } else {
                     // Max of left and top of previous columns
                     longestLen[i][j] = Integer.max(longestLen[i-1][j], longestLen[i][j-1]);
                 }
             }
         }
         return longestLen;
     }
}
