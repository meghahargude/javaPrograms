package abc;

public class Constructor {

	private String name;
    private int age;

    // Parameterized constructor
    public Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor student1 = new Constructor("Alice", 20);

        // Access the object's properties using getters
        String studentName = student1.getName();
        int studentAge = student1.getAge();

        // Display the student's information
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }

		// TODO Auto-generated method stub

	}


