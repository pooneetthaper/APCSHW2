public class LList{
    private Node l;
    private int len;

    public LList(){
	l=new Node(-1);
    }
    
    public LLit getLLit(){
	LLit i = new LLit(l.getNext());
	return i;
    }

    public void add(int i){
	Node tmp = new Node(i);
	tmp.setNext(l.getNext());
	l.setNext(tmp);
	len++;
	//tmp.setNext(l);
	//l = tmp;
    }
    public String toString(){
	String s = "";
	Node tmp;;
	for (tmp=l ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    public int get(int n){
	int count=0;
	Node tmp;;
	for (tmp=l ; tmp!=null ; tmp=tmp.getNext()){
	    if (count==n+1) return tmp.getData();
	    else count++;
	}
	return -1;
    }
    public void add(int n, int stuff){
	int count=0;
	Node in = new Node(stuff);
	for (Node tmp=l; tmp!=null;tmp=tmp.getNext()){
	    if (count==n){
		in.setNext(tmp.getNext());
		tmp.setNext(in);
	    }
	    count++;
	}
	len++;
	
    }

    public int size(){
	return len;
    }
    //commented out because they have the same input
    /*
    public int remove(int n){
	int i=-1;
	int count=0;
	for (Node tmp=l; tmp!=null;tmp=tmp.getNext()){
	    if (count==n){
		i=tmp.getNext().getData();
		tmp.setNext(tmp.getNext().getNext());
		len--;
		break;
	    }
	    count++;
	}
	return i;	
    }
    */
    public boolean remove(int i){
	int count=0;
	for (Node tmp=l; tmp.getNext()!=null;tmp=tmp.getNext()){
	    if (tmp.getNext().getData()==i){
		tmp.setNext(tmp.getNext().getNext());
		len--;
		return true;
	    }
	    count++;
	}
	return false;
    }
}
