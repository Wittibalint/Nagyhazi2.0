package recipt;

class NewDrink implements Command {
	
	public void execute(String[] cmd) {
		try {
			for(Recipt r:Main.recipt) {
				if(r.getName().equals(cmd[2])) {
					System.out.println("M�r van ilyen recept");
					return;
				}
			}
			Drinks r = new Drinks(cmd[2]);
			Main.recipt.add(r);
			System.out.println("OK");
		}
		catch(Exception e) {
			System.out.println("Hib�s param�terek!");
		}
}
}