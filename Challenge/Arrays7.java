import java.util.Random;
public class Arrays7{
    public static void main(String[] args){
    	int[][] arr = new int[100][30];
    	Random random= new Random();

    	System.out.println("Original Array: ");                         
        for(int i = 0; i < arr.length;i++){
        	for(int j = 0; j < arr[i].length;j++){
        		arr[i][j] = random.nextInt(100);
        		System.out.print(arr[i][j] + " ");
        	}         
        }  
        System.out.println("\n");
        
        System.out.println("Array with each element added value 1 to it: ");
        for(int i = 0; i < arr.length;i++){
        	for(int j = 0; j < arr[i].length;j++){
        		arr[i][j] += 1;
        		System.out.print(arr[i][j] + " ");
        	}         
        }  
    }
}
