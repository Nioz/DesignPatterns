/****************************************
 * Nicholas Bertinelli
 * 3/10/19
 * Dr. Lakshmanan
 * SE 207
 * Facade Pattern HW
 *****************************************/

package facadePattern;

public class Compute2 extends Compute1 {
	
	//Method that returns twice the return value of Compute1's cubeInt method
	public int doubleIt(int n, Compute1 obj) {
		return cubeInt(n)*2;
	}

}
