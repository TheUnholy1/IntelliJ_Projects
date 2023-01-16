package ALCANTARA;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dogs objDog1 = new Dogs("Dog1", "Aspin", 3, "brown");
        Dogs objDog2 = new Dogs("Dog2", "Aspin", 3, "black");
        Dogs objDog3 = new Dogs("Dog2", "Aspin", 3, "black");
        System.out.println(objDog1.name);
        System.out.println(objDog2.name);
        System.out.println(objDog3.getAge());
    }
}
