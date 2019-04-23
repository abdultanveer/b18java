package challenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Coupons {
	
	static List<Coupon> couponsList;
	static List<String> preferredCategories;
	
	/**
	 * this method will remove all the coupons which are not in the
	 * preferred cagtegories.
	 */
	public static void filterCategories() {
		//if the coupon's category is not there in the preferredcategories list
		// then remove that coupon
		for(Coupon c : couponsList) {
			if(!preferredCategories.contains(c.category)) 
			couponsList.remove(c);
		}
		//System.out.println(couponsList.get(0).category);
		
	}
	
	public static void displayCoupons() {
		System.out.println(couponsList.get(0).category);
	}
	
	
	
	
	public static void main(String[] args) {
			createDummyData();
			filterCategories();
			displayCoupons();
	}
	
	public static void createDummyData() {
		preferredCategories = new ArrayList<>();
		preferredCategories.add("Baby");
		preferredCategories.add("Gift Cards");
		preferredCategories.add("Cards");
		preferredCategories.add("Sporting Goods");
		preferredCategories.add("Photo Shop");
		preferredCategories.add("Deli");
		preferredCategories.add("Baking Goods");
		
		Coupon  c1 = new Coupon("304816683327672908,39385271820845634478,Gift Cards,17.72,6.61");
		Coupon  c2 = new Coupon("6683414238680399,96520119728644480082,Appliances,17.34,3.13");

		couponsList = new LinkedList<Coupon>();
		couponsList.add(c1);
		couponsList.add(c2);


	}
	
	
	
	//Baby,Gift Cards,Sporting Goods,Photo Shop,Deli,Baking Goods,International



}
