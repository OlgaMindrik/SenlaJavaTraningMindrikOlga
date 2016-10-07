
public class Product implements IProduct {

	
	public void installFirstPart(IProductPart iProductPart) {
		System.out.println("Attention: Install housing!");

	}

	public void installSecondPart(IProductPart iProductPart) {
		System.out.println("Attention: Install engine!");
		
	}
	
	public void installThirdPart(IProductPart iProductPart) {
		System.out.println("Attention: Install tower!");
				
	}

}
