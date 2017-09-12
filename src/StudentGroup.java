import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students){
		// Add your implementation here
		
		
		if(students==null)
		throw IllegalArgumentException;
	

		this.students=students;
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		
		if(index<0 || index>students.length)
		throw IllegalArgumentException;
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null || index<0 || index>students.length)
		throw IllegalArgumentException;
		students[index]=student;
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
		throw IllegalArgumentException;
		/*ArrayList<Student> as=new ArrayList<Student>();
		as.add(student);
		for(int i=0;i<students.length;++i)
		as.add(students[i]);*/
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
		throw IllegalArgumentException;
		students[students.length-1]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null || index<0 || index>students.length)
		throw IllegalArgumentException;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		int i;
		if(index<0 || index>students.length)
		throw IllegalArgumentException;
		if(index==students.length-1)
		{
		students[index]=null;
		return;
		}
		else
		for(i=index;i<students.length-1;++i)
		{
		students[i]=students[i+1];
		students[students.length-1]=null;
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		boolean flag=false;
		int i,j;
		if(student==null)
		throw IllegalArgumentException;
		for(i=0;i<students.length;++i)
		if(students[i]==student)
		{
			j=i;
			flag=true;
			break;
		}
		if(i==students.length)
		throw IllegalArgumentException("Student not exist");
		else
		{
		for(i=j;i<students.length-1;++i)
		students[i]=students[i+1];
		students[students.length-1]=null;
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || index>students.length)
		throw IllegalArgumentException;
		for(int i=index+1;i<students.length;++i)
		students[i]=null;
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student==null)
		throw IllegalArgumentException;
		int i,j;
		for(i=0;i<students.length;++i)
		if(students[i]==student)
		{
		j=i;
		break;
		}
		if(i==students.length)
		return;
		else if(j==students.length-1)
		students[j]=null;
		else
		{
		for(i=j;i<students.length;++i)
		students[i]=students[i+1];
		students[students.length-1]=null;
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0 || index>students.length)
		throw IllegalArgumentException;
		for(int i=0;i<students.length-index;++i)
		students[i]=students[index];
		for(int i=students.length-1;i>students.length-index;--i)
		students[i]=null;
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		boolean flag=false;
		int i,j;
		if(student==null)
		throw IllegalArgumentException;
		for(i=0;i<students.length;++i)
		if(students[i]==student)
		{
			j=i;
			flag=true;
			break;
		}
		for(i=0;i<students.length-j;++i)
		students[i]=students[i+j];
		for(i=students.length-1;i>students.length-j;i--)
		students[i]=null;
		
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		for(int i=0;i<students.length;++i)
		for(int j=i;j<students.length;++j)
		if(students[i].compareTo(students[j])>0)
		{
		Student temp;
		temp=students[i];
		students[i]=students[j];
		students[j]=temp;
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		/*Students[] mystudents=new Students[students.length];
		for(int i=0,j=0;i<students.length;++i)
		if(students[i].age==age)
		mystudents[j++]=student[i];
		return mystudents;*/
return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		/*double maxAvgMark=students[0].avgMark;
		for(int i=0;i<students.length;++i)
		if(maxAvgMark<students[i].avgMark)
		maxAvgMark=students[i].avgMark;
		Students[] mystudents=new Students[students.length];
		for(int i=0,j=0;i<students.length;++i)
		if(students[i].avgMark==maxAvgMark)
		mystudents[j++]=students[i];
		return mystudents;*/
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(student==null)
		throw IllegalArgumentException;
		for(int i=0;i<students.length;++i)
		if(students[i]==student)
		{
			return students[i+1];
			break;
		}
		return null;
	}
}
