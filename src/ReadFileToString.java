import java.io.FileReader;
import java.io.IOException;

/**
 * Read input file using BufferedReader by one char at a time.
 * 
 * @author ton
 *
 */
public class ReadFileToString implements Runnable {
	private String filename;
	private int charCount;

	public ReadFileToString(String filename) {
		this.filename = filename;
	}

	public String readFileToString(String filename) {
		String stringRead = "";
		try {
			System.out.println("Reading " + filename + "file using FileReader " + this.getClass().toString());
			FileReader reader = new FileReader(filename);
			while (reader.ready()) {
				this.charCount++;
				stringRead += (char) reader.read();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Can not find " + filename);
			stringRead = "";
		}
		System.out.print("Read " + this.charCount + " chars. ");
		return stringRead;
	}

	@Override
	public void run() {
		readFileToString(this.filename);
	}

	public String toString() {
		return this.getClass().toString() + " task with " + this.filename;
	}

}
