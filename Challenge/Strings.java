public class Strings{
    public static void main(String[] args){
    	int i;
    	String line = "1,4,3,2,3,7,5,6,9";
    	String[] arr = line.split(",");
    	int[] number = new int[arr.length];
    	
    	System.out.println("Original array:");
    	for(i = 0; i < arr.length; i++){
    		number[i] = Integer.parseInt(arr[i]);
    		System.out.print(number[i] + " ");
    	}
    	System.out.println("\n");
    	System.out.println("Ascending order array:");
    	for(i = 0; i < number.length; i++){
    		for(int j = i+1; j < number.length; j++){
    			if(number[i] > number[j]){
    				int temp = 0;
    				temp = number[i];
    				number[i] = number[j];
    				number[j] = temp;
    			}
    		}
    		System.out.print(number[i] + " ");
    	}
    	System.out.println("\n");
    	
    	System.out.println("Descending order array:");
    	for(i = 0; i < number.length; i++){
    		for(int j = i+1; j < number.length; j++){
    			if(number[i] < number[j]){
    				int temp = 0;
    				temp = number[i];
    				number[i] = number[j];
    				number[j] = temp;
    			}
    		}
    		System.out.print(number[i] + " ");
    	}
    	System.out.println();
    }
}
