package recipt;

import java.util.HashMap;

class Delete implements Command {

	public void execute(String[] cmd) {
		HashMap<String, Command> map = new HashMap<String, Command>();
		map.put("recipt", new DeleteRecipt());
		map.put("material", new DeleteMaterial());
		try {
			Command c = map.get(cmd[1]);
			c.execute(cmd);
		}
		catch(Exception e) {
			System.out.println("Hibás parancs!");
		}
	}
}
