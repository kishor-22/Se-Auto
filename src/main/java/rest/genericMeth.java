package rest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.codehaus.groovy.binding.PropertyChangeProxyTargetBinding;

public class genericMeth 
{
	public void fileRead() throws IOException {
	
	Properties prop = new Properties();
	BufferedReader br = new BufferedReader(new FileReader("env.properties"));
	prop.load(br);
	prop.getProperty("URI");

}
}