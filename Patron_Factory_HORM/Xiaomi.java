
package ico.fes;

public class Xiaomi implements Mobile{
    private int ramSize;
	private String processor;
	public String name = Mobile.XIAOMI;
	public Xiaomi(int ramSize){
		this.ramSize = ramSize;
	}
	
	public Xiaomi(String processor){
		this.processor = processor;
		this.ramSize =2;
	}
}
