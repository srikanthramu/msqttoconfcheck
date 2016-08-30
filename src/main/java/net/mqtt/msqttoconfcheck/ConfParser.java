package net.mqtt.msqttoconfcheck;

import java.util.stream.Stream;

import net.mqtt.msqttoconfcheck.model.Conf;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/*
 * ConfParser parses the mosquitto.conf file and checks for properties that have security implications. 
 */
public class ConfParser {
	
		private Conf conf = new Conf();
		public Conf parse(String fileName){
			
			try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
	
				stream.forEach(
						(line) -> {
							line = line.trim().toLowerCase();
							if(!line.startsWith("#") && !line.isEmpty()){
								constructConf(line);
							}
						}
						);
	
			} catch (IOException e) {
				e.printStackTrace();
			}
			return conf;
		}
		
		private void constructConf(String line){
			String[] key_val = line.split("\\s+");
			if(key_val.length != 2){
				return;
			}
			String key = key_val[0];
			String val = key_val[1];
			switch(key){
			case Constants.ALLOW_ANONYMOUS:
				conf.setAllow_anonymous(getBoolean(val));
				break;
			case Constants.REQUIRE_CERTIFICATE:
				conf.setAllow_anonymous(getBoolean(val));
				break;
			case Constants.CAFILE:
				conf.setCafile(getString(val));
				break;
			case Constants.CAPATH:
				conf.setCapath(getString(val));
				break;
			case Constants.CRLFILE:
				conf.setCrlfile(getString(val));
				break;
			case Constants.USER:
				conf.setUser(getString(val));
				break;
			}
		}
		
		private boolean getBoolean(String line){
			return Boolean.parseBoolean(line);
		}
		
		private String getString(String line){
			String val = null;
			if(!line.trim().isEmpty())
				val = line;
			return val;
		}

}
