package Design.Patterns.structural.adapter;

public class AdapterTest {
	
	public static void main(String[] args) {
		SubStaionAdapter adapter = new SubStaionAdapter();
		Power p1=adapter.getPower("home");
		Power p2=adapter.getPower("industry");
		Power p3=adapter.getPower("school");
		System.out.println(p1+" \n"+p2+"\n "+p3);
	}

}
