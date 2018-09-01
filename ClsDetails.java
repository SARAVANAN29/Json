 class ClsDetails {

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		this.DOB = dOB;
	}
	private int rollno;
	private String name;
	private String DOB;
	private String[] TotalLesson;

	public String[] getTotalLesson() {
		System.out.println(TotalLesson[1]);
		return TotalLesson;
	}
	public void setTotalLesson(String[] totalLesson) {
		this.TotalLesson = totalLesson;
	}
	
		
}


	