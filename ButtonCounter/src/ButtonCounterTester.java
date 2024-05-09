public class ButtonCounterTester	{

	public static void main(String[] args)	{
		ButtonCounter tally = new ButtonCounter();
		tally.add();
		tally.add();
		tally.add();
		System.out.println(tally.getCount());
		System.out.println("Expected: 3");
		tally.minus();
		System.out.println(tally.getCount());
		System.out.println("Expected: 2");
		tally.minus();
		tally.minus();
		tally.minus();
		System.out.println(tally.getCount());
		System.out.println("Expected: 0");
	}
}
