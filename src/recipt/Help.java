package recipt;

class Help implements Command {

	public void execute(String[] cmd) {
		System.out.println("�j ital felv�tele:"+" "+"new drink n�v");
		System.out.println("�j anyag felv�tele:"+" "+"new material n�v alkoholtartalom allerg�n");
		System.out.println("Anyag hozz�ad�sa italhoz:"+" "+"add alapanyag ital m�r�sz�m m�rt�kegys�g");
		System.out.println("Anyag kivon�sa italb�l:"+" "+"remove alapanyag ital m�r�sz�m m�rt�kegys�g");
		System.out.println("Anyag m�dos�t�sa:"+" "+"edit alapanyag_n�v �j_alapanyag �j_alkoholtartalom �j_allerg�n");
		System.out.println("Anyag t�rl�se:"+" "+"delete material alapanyag");
		System.out.println("Ital t�rl�se:"+" "+"delete recipt ital");
		System.out.println("Ital ki�r�sa:"+" "+"search ital");
		System.out.println("Italok ki�r�sa:"+" "+"list drinks");
		System.out.println("Alkoholmetnes italok ki�r�sa:"+" "+"list zero");
		System.out.println("Allerg�n mentes italok ki�r�sa:"+" "+"list noalg");
		System.out.println("Alapanyagok ki�r�sa:"+" "+"list material");
		System.out.println("Brexit"+" "+"brexit");
		System.out.println("Kil�p�s:"+" "+"exit");
	}
}
