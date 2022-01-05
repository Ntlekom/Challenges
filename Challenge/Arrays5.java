public class Arrays5{
    public static void main(String[] args){
       int i;
       int[] arr = new int[50];
                       
        for(i = 0; i < arr.length;i++){
        	arr[i] = i;        
        }  
        System.out.println("Even numbers array: ");
        for(i = 0; i < arr.length;i++){
        	arr[i] += 1;
        	if(arr[i] % 2 == 0){
        		System.out.print(arr[i] + " ");
        	}
        	
        	
        }
        System.out.println("\n");
        
        System.out.println("Numbers divisible by 11 array: ");
        for(i = 0; i < arr.length;i++){
        	if(arr[i] % 11 == 0){
        		System.out.print(arr[i] + " ");
        	}
        }
        
        System.out.println();
    }
}
