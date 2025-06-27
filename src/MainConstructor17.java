public class MainConstructor17 {
    public static void main(String[] args){
        //constructor = A special method to initialize objects
        Student student1 = new Student("bob",30,3.2);
        Student student2 = new Student("can",42,4.5);
        student1.study();
        student2.study();

        User user1 = new User("cris");
        User user2 = new User("crist","info@gmail.com");
        User user3 = new User("cristi","info@gmail.com",29);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println(user2.email);
        System.out.println(user3.age);
        System.out.println(user4.username);
    }
}
