package net.mqtt.msqttoconfcheck;

import net.mqtt.msqttoconfcheck.model.Conf;
/*
 * Prints the warning message based on insecure configuration.
 */
public class Report {
	
	public void genReport(Conf conf){
		print(Messages.BANNER);
		if(conf.isAllow_anonymous()){
			print(Messages.ALLOW_ANONYMOUS);
		}
		if(!conf.isRequire_certificate()){
			print(Messages.REQUIRE_CERTIFICATE);
		}
		if(conf.getCafile() == null && conf.getCapath() == null){
			print(Messages.NoTLS);
		}
		if(conf.getCrlfile() != null){
			print(Messages.NOCRL);
		}
		print(Messages.END);
	}
	public void print(String message){
		System.out.println(message);
	}

}
