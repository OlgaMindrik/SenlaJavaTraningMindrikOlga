
public class productPart implements IProductPart{

	private String name;
	
	public productPart(String name1){
		name = name1;
		System.out.println("Create new part - " + name);
	}
}
