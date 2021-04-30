package kamp3day;

public class UserManager {
public void add(User user) {
	System.out.println(user.getuserName() + "kullanýcý ekleyelim");

}
public void update(User user) {
	System.out.println(user.getuserName() + "Kullanýcý Güncellemesi");
	
}
public void delete(User user) {
	System.out.println(user.getuserName() + "Kullanýcý Siliniz");
}
}
