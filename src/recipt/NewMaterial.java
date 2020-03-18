package recipt;

class NewMaterial implements Command {
	
	public void execute(String[] cmd) {
		try {
			for(Material m:Main.material) {
				if(m.getName().equals(cmd[2])) {
					System.out.println("Már van ilyen alapanyag");
					return;
				}
			}
			Material m = new Material(cmd[2],Double.parseDouble(cmd[3]),cmd[4]);
			Main.material.add(m);
			System.out.println("OK");
		}
		catch(Exception e) {
			System.out.println("Hibás paraméterek");
		}
}
}
