public class MainProgram{
	public static void main(String[] args){
		Flower flower;
		F1 f1 =new F1("Gumamela",100,"Hibiscus");
		F2 f2= new F2("Tulips", 250,"Sweet");
		
		flower = f1;
		System.out.println(flower.getName()+" has a color of:"+flower.getColor());
		
		flower = f2;
		System.out.println(flower.getColor()+ " " +flower.getName()+" is beautiful as ever");
	}
}
