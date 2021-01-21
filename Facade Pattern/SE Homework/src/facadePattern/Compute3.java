/****************************************
 * Nicholas Bertinelli
 * 3/10/19
 * Dr. Lakshmanan
 * SE 207
 * Facade Pattern HW
 *****************************************/

package facadePattern;

public class Compute3 extends Compute2 {
	
	//Method that finds the product of the cubeInt and douubleIt return values
	public int product12(int n, Compute1 obj1, Compute2 obj2) {
		return cubeInt(n) * doubleIt(n, obj1);
	}

}
