package recipt;

import recipt.Command;

class Exit implements Command {

	public void execute(String[] cmd) {
		Write.write();
		System.out.println("Viszl�t!");
		System.exit(0);
		
	}
}
