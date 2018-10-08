package node;


public class LinkedList<T> {
	public static <T>LinkedList<T> init(){
		return new LinkedList<T>();
	}
	
	private Node<T> first = null;
	
	public void append(T element) {
		if (first == null) {
			first = new Node<T>(element);
		} else {
			Node<T> last = first;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(new Node<T>(element));
		}
	}
	
	public Node<T> getFirst(){
		return first;
	}
}