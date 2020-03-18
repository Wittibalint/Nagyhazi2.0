package recipt;

import java.io.FileWriter;
import java.io.*;

public class Write implements Command {
	
	public void execute(String[] cmd) {
		write();
	}
	public static void write() {
		try {
			FileWriter fw = new FileWriter("materials.txt");
			PrintWriter pw = new PrintWriter(fw);
			for(Material m:Main.material) {
				pw.println(m.getName());
				pw.println(m.getAlc());
				pw.println(m.getAllergen());
			}
			pw.close();
		}
		catch(Exception e){
			System.out.println("hiba a mentés közben");
		}
		try {
			FileWriter fw = new FileWriter("recipt.txt");
			PrintWriter pw = new PrintWriter(fw);
			for(Recipt r : Main.recipt) {
				pw.println(r.getName());
				for(int i=0;i<r.storage.size();i++) {
					pw.println(r.storage.get(i).getMaterial().getName());
					pw.println(r.storage.get(i).getQuantity());
					pw.println(r.storage.get(i).getMeasure());
				}
				pw.println("---");
			}
			pw.close();
		}
		catch(Exception e){
			System.out.println("hiba a mentés közben");
		}
		
		

}
}
