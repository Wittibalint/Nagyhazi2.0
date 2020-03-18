package recipt;

import java.io.*;
import java.io.FileReader;
import java.util.HashMap;

public class Read {
	public static void read() {
		try {
			System.out.println("Beolvasás...");
			FileReader fr = new FileReader("materials.txt");
			BufferedReader br = new BufferedReader(fr);
			String s = "material";
			orderM(br, s);
			fr = new FileReader("recipt.txt");
			br = new BufferedReader(fr);
			s = "drink";
			orderR(br, s);
			System.out.println("Kész");
	}
		catch(Exception e) {
			System.out.println("Hibás beolvasás");
		}
	}
	public static void orderM(BufferedReader br, String s) {
		try {
		HashMap<String, Command> map = new HashMap<String, Command>();
		map.put("material", new NewMaterial());
		int i = 0;
		String cmd[] = new String[5];
		cmd[0]="new";
		cmd[1]=s;
		while (true) {
			String line = br.readLine();
			if (line == null) break;
			if(i%3==0) {
				cmd[2]=line;
			}
			else if(i%3==1) {
				cmd[3]=line;
			}
			else if(i%3==2) {
				cmd[4]=line;
				Command c = map.get(cmd[1]);
				c.execute(cmd);
			}
			i++;
		}
		}
		catch(Exception e) {
			System.out.println("Hibás beolvasás666");
		}
	}
	public static void orderR(BufferedReader br, String s) {
		try {
			HashMap<String, Command> map = new HashMap<String, Command>();
			map.put("new", new NewDrink());
			map.put("add", new Add());
			String cmd[] = new String[5];
			String current;
			int NEWRECIPT = 0;
			int ADDMATERIAL = 1;
			int Status = NEWRECIPT;
			int i= 0;
			while(true) {
				String line = br.readLine();
				if (line == null) break;
				if(line.equals("---")) {
					Status = NEWRECIPT;
					continue;
				}
				if(Status == NEWRECIPT) {
					current = line;
					cmd[0]="new";
					cmd[1]="drink";
					cmd[2]= current;
					Command c = map.get(cmd[0]);
					c.execute(cmd);
					Status = ADDMATERIAL;
					
			}
				else if(Status == ADDMATERIAL) {
					cmd[0]="add";
						
						if(i%3==0) {
							cmd[1]=line;
						}
						else if(i%3==1) {
							cmd[3]=line;
						}
						else if(i%3==2) {
							cmd[4]=line;
							Command c = map.get(cmd[0]);
							c.execute(cmd);
							}
							i++;
					}
					}
		}
		catch(Exception e) {
			System.out.println("Hibás beolvasás222");
	}
}
}
