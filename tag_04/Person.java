package tag_04;

public class Person {

    String name;
    int age;
    String maritalStatus = "single";

    // Constructor
    public Person(String name, int age) {
        setDetails(name, age);
    }

    public void setDetails(String name, int age) {

        if (name != null && name.length() != 0) {
            this.name = name;
        } else {
            System.out.println("Enter a valid name!");
        }
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Enter valid age!");
        }

    }
    
    public void setMaritalStatus(String maritalStatus){

        if (maritalStatus.toLowerCase().equals("single") || maritalStatus.toLowerCase().equals("married") || maritalStatus.toLowerCase().equals("divorced") || maritalStatus.toLowerCase().equals("widowed")){
            System.out.println("Enter a valid Marrital Status!");
        }
        else{
            this.maritalStatus = maritalStatus;
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void celebrateBirthday() {
        this.age++;
        System.out.println("Let's party!");
    }

    public void info() {
        System.out.println("Person: " + this.name + ", " + this.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
