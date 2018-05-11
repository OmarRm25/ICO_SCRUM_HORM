
package ico.fes;

public class Huawei implements Mobile{
    private int ramSize;
	private String processor;
	public String name = Mobile.HUAWEI;
	public Huawei(int ramSize){
		this.ramSize = ramSize;
	}
	
	public Huawei(String processor){
		this.processor = processor;
		this.ramSize =2;
	}
}
