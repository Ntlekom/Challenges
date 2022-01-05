public class Arrays10{
    public static void main(String[] args){
    	int[][] arr = new int[100][30];
    	
    	System.out.println("Original Array:");
    	for(int i = 0; i < arr.length;i++){
        	for(int j = 0; j < arr[i].length;j++){
        		arr[i][j] = j+i;
        		System.out.print(arr[i][j] + " ");
        	}
        }
        System.out.println("\n");
        
        System.out.println("Each element incremented by 1:");
    	for(int i = 0; i < arr.length;i++){
        	for(int j = 0; j < arr[i].length;j++){
        		arr[i][j] += 1;
        		System.out.print(arr[i][j] + " ");
        	}
        }
        System.out.println("\n");
    }
}
