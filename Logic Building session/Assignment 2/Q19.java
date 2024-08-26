package CDAC_Assi3;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1; i<= n; i++){   
			for(int j=1; j<= i; j++) {   
				System.out.print(j);  
				if(j < i) {
					System.out.print("*"); 
				}
		}   
		System.out.println(); 
		} 
	}

}
