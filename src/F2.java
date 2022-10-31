public class F2 extends Flower{
	private String scent;
	public F2(String name,int price,String scent){
		super(name,price);
		this.scent=scent;
	}
	public String getColor(){
		return "Pink";
	}
	public String getScent(){
		return scent;
	}
	public void setScent(String scent){
		this.scent=scent;
	}
}
