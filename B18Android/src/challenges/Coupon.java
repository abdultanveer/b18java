package challenges;

public class Coupon {
	public Coupon(String string) {
		String[] array = string.split(",");
		this.upc = array[0];
		this.code = array[1];
		this.category = array[2];
		this.itemPrice  = Float.parseFloat(array[3]);
		this.couponAmount = Float.parseFloat(array[4]);
	}
	
	
	String upc;
	String code;
	String category;
	float itemPrice;
	float couponAmount;

}
