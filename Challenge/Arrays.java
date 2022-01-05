public class Arrays{
    public static void main(String[] args){
       int i;
       int[] arr = new int[]{1,60,3,10,113,69,96,85,93,11,
                                 745,45,-2,28,52,30,74,205,13,64,
                                 102,36,24,74,14,17,18,22,230,31,
                                 6,7,8,58,210,132,14,-16,13,12,
                                 101,121,3,44,55,-128,25,22,84,33};

        System.out.println("Even numbers: ");                         
        for(i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
               System.out.print(arr[i] + " ");
            }    
        }  
        System.out.println("\n");
        
        System.out.println("Numbers Divisible by 11: ");                         
        for(i = 0; i < arr.length; i++){
            if(arr[i] % 11 == 0){
               System.out.print(arr[i] + " ");
            }    
        }  
        System.out.println();
    }
}

