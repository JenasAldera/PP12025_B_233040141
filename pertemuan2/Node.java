package pertemuan2;

public class Node {
	private int data;
	private Node next;
	
	/** Inisialisasi atribut node */
	
	public Node (int data) {
		this.data = data;
	}
	
	//Setter
	public void setData (int data) {
		this.data = data;
	}
	
	//Getter
	public int getData () {
		return data;
	}
	
	//Setter
	public void setNext (Node next) {
		this.next = next;
	}
	
	//Getter
	public Node getNext() {
		return next;
	}
}
