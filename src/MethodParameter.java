public class MethodParameter {

    public static void main(String[] args) {

        sayHello("Kahfi", "Kurnia");
        sayHello("Budi", "Nugraha");
        sayHello("Joko", "Nugroho");

    }

    static void sayHello(String firstName, String lastName) {

        System.out.println("Hello " + firstName + " " + lastName);

    }
}
