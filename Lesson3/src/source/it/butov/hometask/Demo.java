package source.it.butov.hometask;

public class Demo
{

	public static void main(String[] args)
	{
		FractionNumberOperation fractionNumberOperation = new FractionNumberOperationImpl();

		FractionNumber a = new FractionNumberImpl(1, 2);
		FractionNumber b = new FractionNumberImpl(2, 4);

		System.out.println(fractionNumberOperation.add(a, b));
		System.out.println(fractionNumberOperation.sub(a, b));
		System.out.println(fractionNumberOperation.mul(a, b));
		System.out.println(fractionNumberOperation.div(a, b));
	}

}
