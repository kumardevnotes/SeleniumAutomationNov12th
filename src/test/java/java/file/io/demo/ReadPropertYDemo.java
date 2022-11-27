package java.file.io.demo;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertYDemo {

	static Properties props = new Properties();

	public static void main(String[] args) throws Exception {
		String rootFolderpath = System.getProperty("user.dir");
		props.load(new FileInputStream(rootFolderpath + "/src/test/resources/app.properties"));
		System.out.println((props.getProperty("appBrowser")));
	}

}
