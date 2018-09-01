public class EEEC{
	public static String result;
	public static void main(String [] v) throws Exception {
		ClsDetails c = new ClsDetails();
		c.setDOB("29-07-1996");
		String[] temp = {"a","b","c"};
		c.setTotalLesson(temp);
		ClsDetails c1 = new ClsDetails();
		c1.setDOB("27-01-1996");
		o2j oo = new o2j();
		result = oo.obj2json(c);
		System.out.println(result);		
		
		oo.json2obj(result, ClsDetails.class);
		System.out.println(c.getDOB()+" "+c.getTotalLesson());
	}
}