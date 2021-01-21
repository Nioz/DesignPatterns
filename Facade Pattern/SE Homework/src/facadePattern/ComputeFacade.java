/****************************************
 * Nicholas Bertinelli
 * 3/10/19
 * Dr. Lakshmanan
 * SE 207
 * Facade Pattern HW
 *****************************************/

package facadePattern;

public class ComputeFacade {
	//Creating Compute1,2,3 obj
	Compute1 c1;
	Compute2 c2;
	Compute3 c3;
	
	//Facade Constructor
	public ComputeFacade(Compute1 c1, Compute2 c2, Compute3 c3) {
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}
	
	//Facade method, returning value of Compute1 cubeInt method
	public int cubeX(int n) {
		return c1.cubeInt(n);
	}
	
	//facade method, returning value of Compute2 doubleIt method
	public int cubeXTimes2(int n) {
		return c2.doubleIt(n, c1);
	}
	
	//Facade method, returning value of Computue3 product12 method
	public int multiplyBoth(int n) {
		return c3.product12(n,c1 ,c2);
	}

}
