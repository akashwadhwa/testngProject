
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReaderClass {

	Properties properties = new Properties();
	InputStream inputStream = null;

	public PropertyReaderClass() {
		loadProperties();
	}

	private void loadProperties() {
		try {
			inputStream = new FileInputStream("src/config/TestRunConfig.properties");
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String readProperty(String key) {
		return properties.getProperty(key);
	}
}