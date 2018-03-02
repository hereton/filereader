import java.io.FileReader;
import java.io.IOException;

public class ReadFileToStringBuilder implements Runnable {
	private String filename;
	private int charCount;

	public ReadFileToStringBuilder(String filename) {
		this.filename = filename;
	}

	public String readFileToStringBuilder(String filename) {
		StringBuilder sb = new StringBuilder("");
		try {
			System.out.println("Reading " + filename + " file using FileReader " + this.getClass().toString());
			FileReader reader = new FileReader(filename);
			while (reader.ready()) {
				this.charCount++;
				sb.append((char) reader.read());
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Can not find " + filename);
		}
		System.out.print("Read " + this.charCount + " chars. ");
		return sb.toString();
	}

	@Override
	public void run() {
		readFileToStringBuilder(this.filename);
	}

	public String toString() {
		return this.getClass().toString() + " task with " + this.filename;
	}

}
