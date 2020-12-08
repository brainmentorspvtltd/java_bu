import javax.management.RuntimeErrorException;

public class Student {
        // Instance Members of a class
        private int rollno;
        private String name;
        private String course;
        private double fees;
        private String collegeName;
        private String email;
        private String phone;
        private String city;
        private String state;
        
      
        
        public int getRollno() {
			return rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public double getFees() {
			return fees;
		}
		public void setFees(double fees) {
			if(fees>0) {
			this.fees = fees;
			}
			else {
			throw new RuntimeException("Invalid Fees");
			}
		}
		public String getCollegeName() {
			return collegeName;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public  Student(){
                // init instance members
               collegeName = "BDU";
               fees = 10000;
                System.out.println("Default Cons Call");
                
        }
        void print() {
        	System.out.println("Roll No is "+rollno);
        	System.out.println("Name is "+name);
        	System.out.println("Course is "+course);
        	System.out.println("Fees is "+fees);
        }
        public Student(int rollno, String name){
        	this();
            this.rollno = rollno;
            this.name = name;
            System.out.println("2 Param cons");
        }
        public Student(int rollno, String name, String course){
            this(rollno, name);
            this.course = course;
            System.out.println("3 Param Cons");
        }
}
