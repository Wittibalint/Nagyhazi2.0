package recipt;

class Help implements Command {

	public void execute(String[] cmd) {
		System.out.println("Új ital felvétele:"+" "+"new drink név");
		System.out.println("Új anyag felvétele:"+" "+"new material név alkoholtartalom allergén");
		System.out.println("Anyag hozzáadása italhoz:"+" "+"add alapanyag ital mérõszám mértékegység");
		System.out.println("Anyag kivonása italbõl:"+" "+"remove alapanyag ital mérõszám mértékegység");
		System.out.println("Anyag módosítása:"+" "+"edit alapanyag_név új_alapanyag új_alkoholtartalom új_allergén");
		System.out.println("Anyag törlése:"+" "+"delete material alapanyag");
		System.out.println("Ital törlése:"+" "+"delete recipt ital");
		System.out.println("Ital kiírása:"+" "+"search ital");
		System.out.println("Italok kiírása:"+" "+"list drinks");
		System.out.println("Alkoholmetnes italok kiírása:"+" "+"list zero");
		System.out.println("Allergén mentes italok kiírása:"+" "+"list noalg");
		System.out.println("Alapanyagok kiírása:"+" "+"list material");
		System.out.println("Brexit"+" "+"brexit");
		System.out.println("Kilépés:"+" "+"exit");
	}
}
