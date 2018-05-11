
package ico.fes;

public class Sony implements Mobile {
    private int ramSize;
	private String processor;
        
        public String name = Mobile.SONY;
	public Sony(int ramSize){
		this.ramSize = ramSize;
	}
	
	public Sony(int ramSize, String processor){
		this.ramSize = ramSize;
		this.processor = processor;
	}
}
