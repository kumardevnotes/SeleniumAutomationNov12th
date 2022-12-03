package testdemo.io;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertYDemo {

	public static Properties propsObj = new Properties();

	public static void main(String[] args) throws Exception {
		String rootFolderpath = System.getProperty("user.dir");
		propsObj.load(new FileInputStream(rootFolderpath + "/src/test/resources/app.properties"));
		System.out.println((propsObj.getProperty("appBrowser")));
		System.out.println((propsObj.getProperty("appUrl")));
		System.out.println((propsObj.getProperty("appUserEmailID")));
		System.out.println((propsObj.getProperty("appPwd")));
	}

}
