import java.util.ArrayList;

public class List
{
    private ArrayList<Integer> list;

	public List() {
		this.list = new ArrayList<Integer>();
	}

    public void append(int e) {
    	this.list.add(e);
    }

    public int len() {
    	return this.list.size();
    }

    public String str() {
    	return this.list.toString();
    }

    public void set(int i, int e) {
    	this.list.set(i, e);
    }

    public int get(int i) {
    	return this.list.get(i);
    }
}
