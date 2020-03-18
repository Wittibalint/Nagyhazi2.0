package recipt;
public class Drinks extends Recipt {
	private double alc;
	public Drinks(String name) {
		super(name);
		alc = 0;
	}
	public double getAlc() {
		return alc;
	}
	public void addMaterial(Material m, double w, String u) {
		for(int i=0; i < storage.size(); i++) {
			if(m.getName().equals(storage.get(i).getMaterial().getName())) {
				storage.get(i).setQuantity(w);
				System.out.println("OK");
				alcCalc();
				return;
				}
			}
		super.addMaterial(m, w, u);
		alcCalc();
		System.out.println("OK");
		return;
	}
	public void removeMaterial(Material m, double w, String u) {
		for(int i=0; i < storage.size(); i++) {
			if(m.getName().equals((storage.get(i).getMaterial().getName()))){
				storage.get(i).setQuantity(storage.get(i).getQuantity()-w);
				if(storage.get(i).getQuantity()<=0) {
					Storage s = new Storage(m,w,u);
					this.deleteMaterial(s);
				}
			}
		alcCalc();
	}
	}
	public void deleteMaterial(Storage s) {
		for(int i=0; i < storage.size(); i++) {
			if(s.getMaterial().getName().equals(storage.get(i).getMaterial().getName())){
				storage.remove(i);
			}
			}
		}
	public void printout() {
		alcCalc();
		System.out.println(String.format(getName()+" "+"%2.1f",alc));
		System.out.println(String.format("%-20s"+"%-20s"+"%-20s"+"%-20s","name","alcohol%","allergen","quantity"));
		printHelp();
		for(int i=0; i < storage.size(); i++) {
			System.out.println(storage.get(i).getMaterial().toString()+storage.get(i).getQuantity()+storage.get(i).getMeasure());
	}
		printHelp();
	}
	public void printHelp() {
		for(int i=0; i<80;i++) {
			System.out.print(("-"));
		}
		System.out.println();
	}
	public String toString() {
		return super.toString()+ alc;
	}
	private void alcCalc() {
		double sumlit = 0;
		double sumalc = 0;
		for(int i = 0 ; i < storage.size();i++) {
			if(storage.get(i).getMeasure().equals("dl")){
				sumlit += storage.get(i).getQuantity();
		}
		}
		for(int i = 0; i < storage.size(); i++){
			Material m = storage.get(i).getMaterial();
			if(m.getAlc() != 0) {
				sumalc += m.getAlc()*storage.get(i).getQuantity();
			}
		}
		alc = sumalc/sumlit;
	}
}
