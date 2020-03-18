package recipt;

public class EditMaterial implements Command {
	
	public void execute(String[] cmd) {
		for(Recipt r:Main.recipt) {
			for(Storage s : r.storage) {
			if(s.getMaterial().getName().equals(cmd[1])) {
				s.getMaterial().setName(cmd[2]);
				s.getMaterial().setAlc(Double.parseDouble(cmd[3]));
				s.getMaterial().setAllergen(cmd[4]);
				
			}
		}
		}
			System.out.println("OK");
		for(int i = 0; i<Main.material.size();i++) {
			if(Main.material.get(i).getName().equals(cmd[1])) {
				Material m = new Material(cmd[2],Double.parseDouble(cmd[3]),cmd[4]);
				Main.material.set(i, m);
				return;
			}
			i++;
		}
	}
}
