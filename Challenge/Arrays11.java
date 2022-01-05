public class Arrays11{
    public static void main(String[] args){
    	int[][] arr = new int[100][30];
    	
    	System.out.println("Odd numbers:");
    	for(int i = 0; i < arr.length;i++){
        	for(int j = 0; j < arr[i].length;j++){
        		arr[i][j] = j+i;
        		if(arr[i][j] % 2 == 1){
        			System.out.print(arr[i][j] + " ");
        		}
        		
        	}
        }
        System.out.println("\n");
        
        System.out.println("Numbers divisible by 8:");
    	for(int i = 0; i < arr.length;i++){
        	for(int j = 0; j < arr[i].length;j++){
        		if(arr[i][j] % 8 == 0){
        			System.out.print(arr[i][j] + " ");
        		}
        	}
        }
        System.out.println("\n");
    }
}
