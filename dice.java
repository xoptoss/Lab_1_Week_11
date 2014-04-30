package mainPackage;
import java.util.Random;
public class dice {
int value,newValue;

	Random random = new Random();

	public int Throw()
	{
		newValue = random.nextInt(6)+1;
		return newValue;
	}
	
	public int GetValue()
	{
		value = newValue;
		return value;
	}
	
	
}
