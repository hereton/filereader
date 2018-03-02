import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileToStringLine implements Runnable {

	private String filename;

	public ReadFileToStringLine(String filename) {
		this.filename = filename;
	}

	public String readFileToStringLine(String filename) {
		String string = "";
		try {
			System.out.println("Reading " + filename + " file using BufferedReader " + this.getClass().toString());
			BufferedReader bin = new BufferedReader(new FileReader(filename));
			while (bin.ready()) {

				string += bin.readLine() + "\n";
			}
			bin.close();
		} catch (IOException e) {
			System.out.println("Cannot find " + filename);
		}
		System.out.print("Read " + string.length() +" chars. ");
		return string;
	}

	@Override
	public void run() {
		readFileToStringLine(this.filename);
	}

	public String toString() {
		return this.getClass().toString() + " task with " + this.filename;
	}
}
