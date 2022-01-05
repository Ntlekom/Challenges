public class Arrays4{
    public static void main(String[] args){
       int i, x = 0;
       int[] arr = new int[50];

       System.out.println("Original Array: ");                         
        for(i = 0; i < arr.length;i++){
        	arr[i] = i;
               System.out.print(arr[i] + " ");    
        }  
        System.out.println("\n");
        
        System.out.println("Array with each element added value 1 to it: ");
        for(i = 0; i < arr.length;i++){
        	arr[i] += 1;
        	System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
