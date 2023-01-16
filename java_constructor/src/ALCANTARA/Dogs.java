package ALCANTARA;

public class Dogs {
    public String name;
    private int age;
    private String breed;
    private String color;
    Dogs(String name, String breed, int age, String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return age;
    }
    void barking() {
    }
    void sleeping() {
    }
}
