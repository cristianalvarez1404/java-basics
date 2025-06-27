public class Friend {

    public static int numOfFriends;
    public String name;

    public Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    public static void showFriends(){
        System.out.println("You have " + numOfFriends);
    }
}
