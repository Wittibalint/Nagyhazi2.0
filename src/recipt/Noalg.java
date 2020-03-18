package recipt;

public class Noalg implements Command{
	public void execute(String[] cmd) {
		boolean t;
		for(Recipt i : Main.recipt) {
			t = true;
			for(Storage j : i.storage) {
				if(cmd.length==2) {
					if(j.getMaterial().getAllergen().equals("NONE")){
					}
					else {
						t = false;
						break;
					}
				}
				else {
					if(j.getMaterial().getAllergen().equals(cmd[2])){
						t = false;
						break;
					}
				}
			}
			if(t) {
				System.out.println(i.getName());
			}
	}
}
}
