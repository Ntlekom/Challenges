public class Arrays12{
    public static void main(String[] args){
    	int[][] arr = new int[100][30];
    	int i = 0, j = 0; 
    	System.out.println("Odd numbers:");
    	while(i < arr.length){
        	while(j < arr[i].length){
        		arr[i][j] = j+i;
        		switch(arr[i][j] % 2){
        			case 1:
        				System.out.print(arr[i][j] + " ");
        		}
        		j++;
        	}
        	j = 0;
        	i++;
        }
        System.out.println("\n");
        i = 0; j = 0;
        System.out.println("Numbers divisible by 8:");
    	while(i < arr.length){
        	while(j < arr[i].length){
        		switch(arr[i][j] % 8){
        			case 0:
        				System.out.print(arr[i][j] + " ");
        		}
        		j++;
        	}
        	j = 0;
        	i++;
        }
        System.out.println("\n");
    }
}
