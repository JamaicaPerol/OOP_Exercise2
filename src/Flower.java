public abstract class Flower{
	protected String name;
	protected int price;
	
	public Flower(String name,int price){
		this.name=name;
		this.price=price;
	}
	public abstract String getColor();
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getPrice(){
		return price;
	}
}
