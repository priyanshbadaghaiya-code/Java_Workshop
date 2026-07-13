
public class patternEx11 {
	
	    public static void main(String[] args) {
	        int n = 7;

	        for(int i = 1; i <= n; i++) {

	            for(int s = 1; s <= n - i; s++)
	                System.out.print("  ");

	            for(char ch = 'A'; ch < 'A' + i; ch++)
	                System.out.print(ch + " ");

	            System.out.println();
	        }
	    }
	}

