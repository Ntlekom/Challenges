import java.util.Random;
public class Arrays9{
    public static void main(String[] args){
    	int[][] arr = new int[100][30];
    	Random random= new Random();
	int i = 0, j = 0;
    	System.out.println("Even numbers Array: ");                         
        while(i < arr.length){
        	while(j < arr[i].length){
        		arr[i][j] = random.nextInt(100);
        		switch(arr[i][j] % 2){
        			case 0:
        				System.out.print(arr[i][j] + " ");
        				break;
        		}
        		j++;	
        	}
        	j = 0;
        	i++;         
        }  
        System.out.println("\n");
        i = 0; j = 0; 
        System.out.println("Numbers divisible by 11: ");
        while(i < arr.length){
        	while(j < arr[i].length){
        		switch(arr[i][j] % 11){
        			case 0:
        				System.out.print(arr[i][j] + " ");
        				break;
        		}
        		j++;
        	} 
        	j = 0;
        	i++;        
        }
        System.out.println();  
    }
}
