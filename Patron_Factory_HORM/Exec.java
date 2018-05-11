
package ico.fes;

public class Exec {
     public static void main(String[] args) {
		Mobile mobile = MobileFactory.createMobile(Mobile.SAMSUNG);
                System.out.println(Mobile.SAMSUNG);
                Mobile mobile1 = MobileFactory.createMobile(Mobile.SONY);
                System.out.println(Mobile.SONY);
                Mobile mobile2 = MobileFactory.createMobile(Mobile.IPHONE);
                System.out.println(Mobile.IPHONE);
                Mobile mobile3 = MobileFactory.createMobile(Mobile.HUAWEI);
                System.out.println(Mobile.HUAWEI);
                Mobile mobile4 = MobileFactory.createMobile(Mobile.MOTOROLA);
                System.out.println(Mobile.MOTOROLA);
                Mobile mobile5 = MobileFactory.createMobile(Mobile.XIAOMI);
                System.out.println(Mobile.XIAOMI);

	}
}
