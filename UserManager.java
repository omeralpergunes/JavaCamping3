package kamp3day;

public class UserManager {
public void add(User user) {
	System.out.println(user.getuserName() + "kullan�c� ekleyelim");

}
public void update(User user) {
	System.out.println(user.getuserName() + "Kullan�c� G�ncellemesi");
	
}
public void delete(User user) {
	System.out.println(user.getuserName() + "Kullan�c� Siliniz");
}
}
