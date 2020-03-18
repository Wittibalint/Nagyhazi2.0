package recipt;

public class Storage {
	private Material material;
	private double quantity;
	private String measure;
	public Storage(Material m,Double d,String s) {
		this.material=m;
		this.quantity=d;
		this.measure=s;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quality) {
		this.quantity = quality;
	}
	public String getMeasure() {
		return measure;
	}
	public void setMeasure(String allergen) {
		this.measure = allergen;
	}

}
