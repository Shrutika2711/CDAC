/*
 	* 
   * * 
  * * * 
 * * * * 
* * * * *
 */
package CDAC_Assi3;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int i , j;
		for(i = 0; i < n; i++) {
			for(j = n - i; j >1; j--) {
				System.out.print(" ");
			}
				for(j = 0; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}

	}

}
