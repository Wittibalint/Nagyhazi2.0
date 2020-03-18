package recipt;
import java.util.ArrayList;

abstract public class Recipt {
	private String name;
	protected ArrayList<Storage> storage = new ArrayList<Storage>();
	public Recipt(String name) {
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public void addMaterial(Material m, double w, String u) {
		Storage s = new Storage(m,w,u);
		storage.add(s);
	}
	public void removeMaterial(Material m, double w, String u){
	}
	public void deleteMaterial(Storage s) {
	}
	public String toString() {
		return "Recipt:" + name + ", " + storage;
	}
	abstract void printout();
}