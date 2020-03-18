package recipt;

public class DeleteMaterial implements Command{
	public void execute(String[] cmd) {
			for(Recipt r: Main.recipt) {
				for(Storage s: r.storage) {
					if(s.getMaterial().getName().equals(cmd[2])) {
						r.deleteMaterial(s);
						break;
					}
				}
			}	
		for(Material m: Main.material) {
			if(m.getName().equals(cmd[2])){
				Main.material.remove(m);
				break;
			}
		}
		System.out.println("OK");
	}
}
