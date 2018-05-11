
package ico.fes;

public class Motorola implements Mobile{
    private int ramSize;
	private String processor;
	public String name = Mobile.MOTOROLA;
	public Motorola(int ramSize){
		this.ramSize = ramSize;
	}
	
	public Motorola(String processor){
		this.processor = processor;
		this.ramSize =2;
	}
}
