public class UserManager {

    public void add(User user){
        System.out.println(user.getName() + "eklendi.");
    }

    public void addMultipleUser(User[] users){

        for(User user: users){
            add(user); }
    }

}
