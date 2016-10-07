
public class lineStep implements ILineStep  {
	private String astep;
	public lineStep(String nstep){
		this.astep=nstep;
	}
	
	public IProductPart buildProductPart() {
		System.out.println("Create " + this.astep);
		productPart part= new productPart(this.astep);
		return part;
	}


}
