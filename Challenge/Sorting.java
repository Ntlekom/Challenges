public class Sorting{
    public static void main(String[] args){
       int i;
      int[] numbers = new int[]{10,560,36,1,5,69,96,85,93,11,
                                                  245,45,-3,-9,52,30,74,105,23,64,
                                                 102,36,24,74,14,17,18,15,230,31,
                                                 6,7,8,58,210,-12,14,-66,13,12,
                                                 101,121,3,44,55,-30,25,22,84,29};

        System.out.println("Original Array: ");                         
        for(i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
            
            if(i == 19){
             numbers[19] += 60;
            }
            if(i == 20){
             numbers[20] += 61;
            }
        }  
        System.out.println("\n");
 	System.out.println("Array with 20th and 61st elements changed: "); 
        for(i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }                       
        System.out.println();
    }
}

