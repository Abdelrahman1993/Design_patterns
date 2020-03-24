
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d1 = new Duck1();
		d1.display();
		
		//set flyBehavior
		d1.setFlyBehavior(new FlywithTwoWings());
		d1.performFly();
		
		//set flyBehavior during run time
		d1.setFlyBehavior(new FlyNoFly());
		d1.performFly();
		
		d1.setQuackBehavior(new Quack());
		d1.performQuack();
		
		d1.setQuackBehavior(new MuteQuack());
		d1.performQuack();
		
	}
	

}
