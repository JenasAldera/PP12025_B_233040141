package pertemuan2;

public class ListMain {
	private Node HEAD;
	
	public ListMain() {
		this.HEAD = null;
	}
	
	public boolean isEmpty() {
		return HEAD == null;
	}
	
	public static void main(String[] args) {
		StrukturList list = new StrukturList ();
		list.addTail(1);
		list.addTail(4);
		list.addTail(5);
		list.addTail(7);
		
		System.out.println("Elemen : ");
		list.displayElement();
	
		// 1. Create list dengan keyword new
		StrukturList listHEAD = new StrukturList();
		
		//2. Tambah elemen 5 di awal list
		listHEAD.addHead(5);
		
		//3. Tambah elemen 4 di awal list
		listHEAD.addHead(4);
		
		//4. Tambah elemen 3 di awal list
		 listHEAD.addHead(3);
		
		//5. Tampilkan elemen list
		System.out.println("Elemen: ");
		listHEAD.displayElement();
		
		 // List A: 3 2 1
        StrukturList listAHead = new StrukturList();
        listAHead.addHead(1);
        listAHead.addHead(2);
        listAHead.addHead(3);

        System.out.println("Elemen A: ");
        listAHead.displayElement();

        System.out.println("");

        // List b: 1 4 5 7
        StrukturList listBHead = new StrukturList();
        listBHead.addHead(7);
        listBHead.addHead(5);
        listBHead.addHead(4);
        listBHead.addHead(1);

        System.out.println("Elemen B: ");
        listBHead.displayElement();
	}
}
