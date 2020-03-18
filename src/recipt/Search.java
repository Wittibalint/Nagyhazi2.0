package recipt;

public class Search implements Command{
	public void execute(String[] cmd) {
		for(Recipt i : Main.recipt) {
			if(i.getName().equals(cmd[1])) {
				i.printout();
			}
			
		}
	}
	}

