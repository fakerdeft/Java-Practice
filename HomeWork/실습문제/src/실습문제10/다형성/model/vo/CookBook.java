package 실습문제10.다형성.model.vo;

public class CookBook extends Book{
	
	private boolean coupon;

	public CookBook() {
		super();
	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
	
	public boolean isCoupon() {
			
		return coupon;
	}
	
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "CookBook"+super.toString()+ "[쿠폰: "+ coupon + "]";
	}
	
	

}
