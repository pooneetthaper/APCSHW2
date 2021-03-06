public class myStack<E>{
    
    private Node<E> top,base;

    public myStack(){
	base=new Node();
	top=base;
    }

    public void push(E data){
	Node<E> n= new Node(data);
	n.setNext(top);
	top.setAbove(n);
	top=n;
    }

    public E pop(){
	E retval=top.getData();
	Node<E> temp= top.getNext();
	temp.setAbove(null);
	top.setNext(null);
	top=temp;
	return retval;
    }

    public boolean empty(){
	return top==base;
    }

    public E top(){
	return top.getData();
    }
}
