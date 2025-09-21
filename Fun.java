
import java.util.ArrayList;

interface ccom{
	void showdetails();
}

class lesson implements ccom{
	String t;
	String l;

	String nn;

	String mm;

    public lesson(String t, String l) {
this.t = t;
this.l =l;
    }

	
  public void showdetails()
  {
	System.out.println(t+" "+l);
  }
}

class Coures implements ccom{
    String n;
	ArrayList<ccom> compnts = new ArrayList<>();
	public Coures(String n)
	{
		this.n = n;
	}
	public void add(ccom l)
	{
		compnts.add(l);
	}
	@Override
	public void showdetails()
	{
		System.out.println("modu" + n);
		for(ccom c: compnts)
		{
			c.showdetails();
		}
	}
}
public class Fun {
	public static void main(String[] args)
	{
		System.out.println("Hello");
		lesson l = new lesson("ee","dd");
		Coures c = new Coures("cse");
		c.add(l);
		c.showdetails();
	}
}

