public class MainStatic19 {
    public static void main(String[] args){
        // static = Makes a variable or method belong to the class rather than any specific object.
        //Commonly used for utility methods or shared resources.
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("patrick");

        System.out.println(friend1.name);
        System.out.println(friend1.numOfFriends);
        System.out.println(Friend.numOfFriends);
        Friend.showFriends();
        Math.round(3.99);

    }
}
