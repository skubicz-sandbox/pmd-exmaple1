package pl.szymonkubicz.pmd.examples.construcor;

/**
 * 
 * @author Szymon Kubicz
 *
 */
public class ExampleObjectWithoutConstrucor implements WithoutConstructor {
	
	public ExampleObjectWithoutConstrucor() {
	}
	
	public void print() {
		System.out.println("Mozliwe ze sie nie skompiluje.");
	}
	
}
