public class p14
{
	public static void main(String[] args)
	{
		Car car1 = new Car();
		
		car1.setNum(1234);
		car1.setGas(20.5);
	}

}
class Car
{
	int num;
	double gas;
	
	void setNum(int n)
	{
		num = n;
		System.out.println("將車號設為:"+this.num);
	}
	
	void setGas(double g)
	{
		gas = g;
		System.out.print("將汽油設為:"+this.gas);
	}
}