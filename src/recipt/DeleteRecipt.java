package recipt;

public class DeleteRecipt implements Command{
	public void execute(String[] cmd) {
			int i = 0;
			for(Recipt r : Main.recipt) {
				if(r.getName().equals(cmd[2])){
					Main.recipt.remove(i);
					System.out.println("OK");
					break;
				}
			i++;
			
	}
	}
	}
