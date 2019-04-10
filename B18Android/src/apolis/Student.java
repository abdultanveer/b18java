package apolis;

/**
 * this is a student at apolis
 * @author Admin
 *
 */
public class Student {

	private int rollNo;
	private String name;
	private int age;
	
	


	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	/**
	 * this method return roll no of student.--- javadoc
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		if(rollNo <1990) {
			this.rollNo = rollNo;
		}
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("the object is about to be cleared from heap");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollNo+"\n"+name+"\n"+age;
				//super.toString();
	}
	
	
	public static void main(String[] args) {
		/*Student apolisStudent = new Student();
		apolisStudent.getRollNo();
		apolisStudent = null;
		System.gc();*/
	}

}
