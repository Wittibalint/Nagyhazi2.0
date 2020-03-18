package recipt;

public class ListZero implements Command{
	public void execute(String[] cmd) {
		for(Recipt i : Main.recipt) {
				Drinks d = (Drinks)i;
				if(d.getAlc()==0) {
					System.out.println(d.getName());
					System.out.println("OK");	
			}
		}
	}
	}
