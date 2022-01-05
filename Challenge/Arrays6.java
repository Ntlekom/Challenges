public class Arrays6{
    public static void main(String[] args){
       int i = 0;
       int[] arr = new int[50];
                       
        while(i < arr.length){
        	arr[i] = i; 
        	i++;       
        } 
        i = 0; 
        System.out.println("Even numbers array: ");
        while(i < arr.length){
        	arr[i] += 1;
        	switch(arr[i] % 2){
        		case 0:
        			System.out.print(arr[i] + " ");
        			break;
        	}
        	
        	i++;
        }
        System.out.println("\n");
        
        i = 0; 
        System.out.println("Numbers divisible by 11 array: ");
        while(i < arr.length){
        	switch(arr[i] % 11){
        		case 0:
        			System.out.print(arr[i] + " ");
        			break;
        	}
        	i++;
        }
        System.out.println();
    }
}
