public class p20
{
	public static void main(String[] args)
	{
		Car car1 = new Car();
		car1.num = 1234;
		car1.gas = -10;
		
		car1.show();
	}

}
class Car
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.print("汽油量是:"+this.gas);
	}
}