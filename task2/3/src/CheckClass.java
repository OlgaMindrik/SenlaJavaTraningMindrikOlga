
public class CheckClass {
public static void main (String[] args){
	System.out.println("Assembly beginning");
	assemblyLine  mtank = new assemblyLine();
	Product tank = new Product();
	mtank.assembleProduct(tank);
	System.out.println("Finish");
	
}
}
