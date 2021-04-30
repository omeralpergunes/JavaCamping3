package kamp3day;

public class Main {

	public static void main(String[] args) {
	Student student1 =new Student();
	student1.setuserName("Ömer Alper Güneþ");
	student1.setnationalIdentity("56165115665");
	student1.setpassword("123456");
	student1.setschool("HHKMTAL");
	
   Constructor constructor1 = new Constructor();
   constructor1.setuserName("Engin Demirog");
   constructor1.setnationalIdentity("5564854121");
   constructor1.setpassword("56465416");
   constructor1.setschool("Ankara Lisesi");
   
   ConstructorManager constructorManager= new ConstructorManager();
   StudentManager studentManager = new StudentManager();
   
   studentManager.add(student1);
   System.out.println("Boþluðu Dolduralým");
   constructorManager.add(constructor1);
	

	}

}
