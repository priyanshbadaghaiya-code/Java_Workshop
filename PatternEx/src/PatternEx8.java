
public class PatternEx8 {
	
	    public static void main(String[] args) {
	        int n = 7;

	        for(int i = n; i >= 1; i--) {
	            for(char ch = 'A'; ch < 'A' + i; ch++) {
	                System.out.print(ch + " ");
	            }
	            System.out.println();
	        }
	    }
	}

