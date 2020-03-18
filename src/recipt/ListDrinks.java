package recipt;

public class ListDrinks implements Command{
	public void execute(String[] cmd) {
		for(Recipt i : Main.recipt) {
			System.out.println(i.getName());
		}
	}
	}