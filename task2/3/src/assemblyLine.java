
public class assemblyLine implements IAssemblyLine{

	public IProduct assembleProduct(IProduct iProductPart) {
		lineStep step1 = new lineStep("housing");
		iProductPart.installFirstPart(step1.buildProductPart());
		lineStep step2 = new lineStep("engine");
		iProductPart.installSecondPart(step2.buildProductPart());
		lineStep step3 = new lineStep("tower");
		iProductPart.installThirdPart(step3.buildProductPart());
		return iProductPart;
	}

}
