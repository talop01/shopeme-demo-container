package bt.edu.gcit;

public class Alien {
    private int age;
    private computer laptop;

    // public Alien(int age, Laptop laptop) {
    //     this.age = age;
    //     this.laptop = laptop;
    // }

    public Alien() {
        System.out.println("Alien Object Created");
    }

    public void code() {
        System.out.println("coding");
        laptop.compile();
    }

    // Getters and Setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age Setting");
        this.age = age;
    }

    public computer getLaptop() {
        return laptop;
    }

    public void setLaptop(computer laptop) {
        this.laptop = laptop;
    }
}