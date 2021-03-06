
package ico.fes;

public class MobileFactory {
    public static Mobile createMobile(String type){
		if(type.equals(Mobile.IPHONE)){
			return new Iphone(2, "A9", "A9 GPu");
		}else if(type.equals(Mobile.SONY)){
			return new Sony(2,"ARM");
		}else if(type.equals(Mobile.SAMSUNG)){
			return new Samsung("Intel");
                }else if(type.equals(Mobile.HUAWEI)){
			return new Huawei("ARM");
		}else if(type.equals(Mobile.MOTOROLA)){
			return new Motorola("quadcore");
                }else if(type.equals(Mobile.XIAOMI)){
			return new Xiaomi("octacore");        
		}else{
			return null;
		}
	}
    
}
