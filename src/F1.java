public class F1 extends Flower{
	private String scientific_name;
	public F1(String name,int price,String scientific_name){
		super(name,price);
		this.scientific_name=scientific_name;
	}
	public String getColor(){
		return "Red";
	}
	public String getScientific_name(){
		return scientific_name;
	}
	public void setScientific_name(String scientific_name){
		this.scientific_name=scientific_name;
	}
}
