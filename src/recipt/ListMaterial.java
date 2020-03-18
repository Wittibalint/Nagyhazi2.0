package recipt;

public class ListMaterial implements Command{
	public void execute(String[] cmd) {
		if(cmd.length==2) {
			for(Material i : Main.material) {
				System.out.println(i.getName());
		}
		}else {
			for(Material i : Main.material) {
				if(i.getName().equals(cmd[2])) {
					i.print();
				}
		}
		}	
	}
	}
