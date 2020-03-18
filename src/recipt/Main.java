package recipt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static ArrayList<Material> material = new ArrayList<Material>();
	public static ArrayList<Recipt> recipt = new ArrayList<Recipt>();
	public static void main(String[] args) {
		HashMap<String, Command> map = new HashMap<String, Command>();
		Read.read();
		map.put("help", new Help());
		map.put("add", new Add());
		map.put("new", new New());
		map.put("list", new List());
		map.put("exit", new Exit());
		map.put("brexit", new Brexit());
		map.put("remove", new Remove());
		map.put("delete", new Delete());
		map.put("search", new Search());
		map.put("edit", new EditMaterial());
		map.put("write", new Write());
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();
			String[] cmd = line.split(" ");
			try {
				Command c = map.get(cmd[0]);
				c.execute(cmd);
			}
			catch(Exception e) {
				System.out.println("rossz parancs");
			}	
		}
	}
}