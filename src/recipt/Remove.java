package recipt;

class Remove implements Command {

	public void execute(String[] cmd) {
		for(Recipt i : Main.recipt) {
			if(i.getName().equals(cmd[2])){
				for(Material j : Main.material) {
					if(j.getName().equals(cmd[1])) {
						if(Add.correction(cmd[4])) {
							i.removeMaterial(j,Double.parseDouble(cmd[3]),cmd[4]);
							System.out.println("OK");
							return;
						}
						
				}
			}
		}
	}
		}
}
		