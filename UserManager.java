package kamp3day;

public class UserManager {
public void add(User user) {
	System.out.println(user.getuserName() + "kullanıcı ekleyelim");

}
public void update(User user) {
	System.out.println(user.getuserName() + "Kullanıcı Güncellemesi");
	
}
public void delete(User user) {
	System.out.println(user.getuserName() + "Kullanıcı Siliniz");
}
}
