package recipt;

public class Material {
	private String name;
	private double alc;
	private String allergen;
	public Material(String name, double alc,String allergen) {
		this.name = name;
		this.alc = alc;
		this.allergen = allergen;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAlc() {
		return alc;
	}
	public void setAlc(double alc) {
		this.alc = alc;
	}
	public String getAllergen() {
		return allergen;
	}
	public void setAllergen(String allergen) {
		this.allergen = allergen;
	}
	public void print() {
		System.out.println(String.format("%-20s"+"%-20s"+"%-20s","name","alcohol%","allergen")+"\n");
		System.out.println(this.toString());
		}
	public String toString() {
		return  String.format("%-20s"+"%-20.1f"+"%-20s",name,alc,allergen);
	}
}
