public class MostLivedInYear {

     public static void main(String []args){
        System.out.println("Year which had most lived: ");
        int[] births = {1915, 1900, 1910, 1985, 1910};
        int[] deaths = {1958, 1970, 2000, 2030, 2005};
        
        int[] X = new int[131]; // Optional, if age years are 1900 - 2000 (101) or MAX+1 (eg. 2030 100+31)
        
        for (int i = 0; i < births.length; i++) {
            X[births[i] - 1900]  += 1;
            X[deaths[i] - 1900]  -= 1;
        }
        
        int maxPopulation = 0; 
        int population = 0; 
        int maxIndex = 0;
        
        for (int age = 0; age < X.length; age++) {
            population = population + X[age];
            
            if (population > maxPopulation) {
                maxPopulation = population;
                maxIndex = age;
            }
        }
        
        System.out.println(1900 + maxIndex);
     }
}
