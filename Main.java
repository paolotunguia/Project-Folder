public class Main {

    public static void main(String[] args) {
        Person first = new Person();
        Person second = new Person();
        Person third = new Person();
        Person fourth = new Person();
        Person fifth = new Person();

        first.setFirstName("Paolo");
        first.setLastName("Tunguia");

        second.setFirstName("Godspeed");
        second.setLastName("Guinto");

        third.setFirstName("Renz");
        third.setLastName("Layco");

        fourth.setFirstName("Joaquinn");
        fourth.setLastName("Quilat");

        fifth.setFirstName("Jasper");
        fifth.setLastName("Santos");

        System.out.println("Person 1: "+ first.getFirstname() + first.getLastName());
        System.out.println("Person 2: "+ second.getFirstname()+ second.getLastName());
        System.out.println("Person 3: "+ third.getFirstname()+ third.getLastName());
        System.out.println("Person 4: "+ fourth.getFirstname()+ fourth.getLastName());
        System.out.println("Person 5: "+ fifth.getFirstname()+ fifth.getLastName());

    }
}