/****************************************
 * Nicholas Bertinelli
 * 3/10/19
 * Dr. Lakshmanan
 * SE 207
 * Facade Pattern HW
 *****************************************/



package facadePattern;

public class FacadeTest {

	public static void main(String[] args) {
		//Creating the 3 Compute1,2,3 objs
		Compute1 c1 = new Compute1();
		Compute2 c2 = new Compute2();
		Compute3 c3 = new Compute3();
		
		//creating a ComputeeFacade obj and passing it the values from the 3 separate compute classes
		ComputeFacade cf = new ComputeFacade(c1, c2, c3);
		
		//Printing out and calling the method outputs
		System.out.println("This uses the Compute1 CubeInt method and should return \"125\": " + cf.cubeX(5));
		System.out.println("This uses the Compute1 CubeInt method and should return \"250\": " + cf.cubeXTimes2(5));
		System.out.println("This uses the Compute1 CubeInt method and should return \"31,250\": " + cf.multiplyBoth(5));

	}

}

/*Code Output:
 *
This uses the Compute1 CubeInt method and should return "125": 125
This uses the Compute1 CubeInt method and should return "250": 250
This uses the Compute1 CubeInt method and should return "31,250": 31250

 */
