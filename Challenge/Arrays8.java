import java.util.Random;
public class Arrays8{
    public static void main(String[] args){
    	int[][] arr = new int[100][30];
    	Random random= new Random();

    	System.out.println("Even numbers Array: ");                         
        for(int i = 0; i < arr.length;i++){
        	for(int j = 0; j < arr[i].length;j++){
        		arr[i][j] = random.nextInt(100);
        		if(arr[i][j] % 2 == 0){
        			System.out.print(arr[i][j] + " ");
        		}	
        	}         
        }  
        System.out.println("\n");
        
        System.out.println("Numbers divisible by 11: ");
        for(int i = 0; i < arr.length;i++){
        	for(int j = 0; j < arr[i].length;j++){
        		if(arr[i][j] % 11 == 0){
        			System.out.print(arr[i][j] + " ");
        		}
        	}         
        }
        System.out.println();  
    }
}
