package recipt;

import recipt.Command;

class Exit implements Command {

	public void execute(String[] cmd) {
		Write.write();
		System.out.println("Viszlát!");
		System.exit(0);
		
	}
}
