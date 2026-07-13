
public class PatternEx7 {
	
	    public static void main(String[] args) {
	        int n = 7;

	        for(int i = 1; i <= n; i++) {
	            for(char ch = 'A'; ch < 'A' + i; ch++) {
	                System.out.print(ch + " ");
	            }
	            System.out.println();
	        }
	    }
	}

