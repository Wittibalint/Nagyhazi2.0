package recipt;
import java.util.HashMap;

import recipt.Command;

class New implements Command {
	
	public void execute(String[] cmd) {
		HashMap<String, Command> map = new HashMap<String, Command>();
		map.put("drink", new NewDrink());
		map.put("material", new NewMaterial());
		try {
			Command c = map.get(cmd[1]);
			c.execute(cmd);
		}
		catch(Exception e) {
			System.out.println("Hibás parancs!");
		}
}
}