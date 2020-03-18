package recipt;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

	public class Junittest {
		Material m;
		Drinks d;
		HashMap<String, Command> map;
	
		@Before
		public void setUp() {
			 m = new Material("testmaterial", 4.2, "None");
			 d = new Drinks("testdrink");
			 map = new HashMap<String, Command>();
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
		 }
		@Test
		public void newM() {
			Main.material.clear();
			String cmd[] = new String[5];
			cmd[0] = "new";
			cmd[1] = "material";
			cmd[2] = "testmaterial";
			cmd[3] = "4.2";
			cmd[4] = "None";
			Command c = map.get(cmd[0]);
			c.execute(cmd);
			assertTrue(Main.material.get(0).getName().equals(m.getName()));
		}
		@Test
		public void newR() {
			Main.recipt.clear();
			String cmd[] = new String[3];
			cmd[0] = "new";
			cmd[1] = "drink";
			cmd[2] = "testdrink";
			Command c = map.get(cmd[0]);
			c.execute(cmd);
			assertTrue(Main.recipt.get(0).getName().equals(d.getName()));
		}
		@Test
		public void Edit() {
			Main.material.clear();
			String cmd[] = new String[5];
			cmd[0] = "new";
			cmd[1] = "material";
			cmd[2] = "testmaterial";
			cmd[3] = "4.2";
			cmd[4] = "None";
			Command c = map.get(cmd[0]);
			c.execute(cmd);
			cmd[0] = "edit";
			cmd[1] = "testmaterial";
			cmd[2] = "material";
			cmd[3] = "4.2";
			cmd[4] = "None";
			c = map.get(cmd[0]);
			c.execute(cmd);
			assertTrue(Main.material.get(0).getName().equals(cmd[2]));
		}
		@Test
		public void remove() {
			Main.recipt.clear();
			Main.material.clear();
			Main.material.add(m);
			Main.recipt.add(d);
			String cmd[] = new String[5];
			cmd[0] = "add";
			cmd[1] = m.getName();
			cmd[2] = d.getName();
			cmd[3] = "2";
			cmd[4] = "dl";
			Command c = map.get(cmd[0]);
			c.execute(cmd);
			cmd[0] = "remove";
			cmd[1] = m.getName();
			cmd[2] = d.getName();
			cmd[3] = "1";
			cmd[4] = "dl";
			c = map.get(cmd[0]);
			c.execute(cmd);
			assertEquals(0.1,Main.recipt.get(0).storage.get(0).getQuantity(),1);
		}
		@Test
		public void testCorrect() {
			boolean b = Add.correction("dl");
			assertTrue(b == true);
		}
		
		@Test
		public void Add() {
			Main.recipt.clear();
			Main.material.clear();
			Main.material.add(m);
			Main.recipt.add(d);
			String cmd[] = new String[5];
			cmd[0] = "add";
			cmd[1] = m.getName();
			cmd[2] = d.getName();
			cmd[3] = "2";
			cmd[4] = "dl";
			Command c = map.get(cmd[0]);
			c.execute(cmd);
			assertTrue(Main.recipt.get(0).storage.get(0).getMaterial().getName().equals(m.getName()));
		}
		@Test
		public void testStringR() {
			String s = d.toString();
			String s2 = ("Recipt:testdrink, []0.0");
			assertTrue(s.equals(s2));
		}
		@Test
		public void testStringM() {
			Material m1 = m;  
			String s = m1.toString();
			String s2 = String.format("%-20s"+"%-20.1f"+"%-20s","testmaterial", 4.2, "None");
			assertTrue(s.equals(s2));
		}
		@Test
		public void testDeleteR() {
			Main.recipt.clear();
			Main.recipt.add(d);
			String cmd[] = new String[3];
			cmd[0] = "delete";
			cmd[1] = "recipt";
			cmd[2] = "testdrink";
			Command c = map.get(cmd[0]);
			c.execute(cmd);
			assertEquals(Main.recipt.size(),0);
		}
		@Test
		public void testDeleteM() { 
			Main.material.clear();
			Main.material.add(m);
			String cmd[] = new String[3];
			cmd[0] = "delete";
			cmd[1] = "material";
			cmd[2] = "testmaterial";
			Command c = map.get(cmd[0]);
			c.execute(cmd);
			assertEquals(Main.material.size(),0);
		}
		

}
