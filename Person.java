public class Person {
    //Attributes
    private String name;
    private int age;
    //Constructor
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    //Method
    public void DisplayDetails(){
        System.out.println("Person Details: ");
        System.out.println("Name :"+ name);
        System.out.println("Age :"+ age);
    }
    public static void main(String[] args) {
        //object creation
        Person p = new Person("Abhi yadav",19);
        p.DisplayDetails();
    }
}
