package recipt;

import recipt.Command;

class Add implements Command {
	
	public void execute(String[] cmd) {
		for(Recipt i : Main.recipt) {
			if(i.getName().equals(cmd[2])){
				for(Material j : Main.material) {
					if(j.getName().equals(cmd[1])) {
						if(correction(cmd[4])) {
							i.addMaterial(j,Double.parseDouble(cmd[3]),cmd[4]);
							return;
						}
						
				}
			}
		}
	}
	System.out.println("Hibás paraméterek!");
}
	public static boolean correction(String s) {
		if(s.equals("g")||s.equals("dl")) {
			return true;
		}
		return false;
	}
	}
