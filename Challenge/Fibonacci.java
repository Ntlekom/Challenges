public class Fibonacci{
    public static void main(String[] args){
    	int element1 = 0, element2 = 1, element3;
    	int length = 10;
    	
    	System.out.print(element1 + " " + element2 + " ");
    	for(int i = 2; i < length; i++){
    		element3 = element1 + element2;
    		System.out.print(element3 + " ");
    		
    		element1 = element2;
    		element2 = element3;
    	}
    	System.out.println();
    }
}
