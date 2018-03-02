
public class Main {
	public static void main(String[] args) {
		TaskTimer t = new TaskTimer();
		String file = "aliceinwonderland.txt";
		t.run(new ReadFileToString(file));
		t.run(new ReadFileToStringBuilder(file));
		t.run(new ReadFileToStringLine(file));
	}
}
