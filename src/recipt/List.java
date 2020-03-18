package recipt;
import java.util.HashMap;

import recipt.Command;

class List implements Command {
	
	public void execute(String[] cmd) {
		HashMap<String, Command> map = new HashMap<String, Command>();
		map.put("drinks", new ListDrinks());
		map.put("zero", new ListZero());
		map.put("noalg", new Noalg());
		map.put("material", new ListMaterial());
		try {
			Command c = map.get(cmd[1]);
			c.execute(cmd);
		}
		catch(Exception e) {
			System.out.println("Hibás parancs!");
		}
}
}