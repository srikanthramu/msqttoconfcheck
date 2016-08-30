package net.mqtt.msqttoconfcheck;

import java.io.File;

import net.mqtt.msqttoconfcheck.model.Conf;

/**
 * ConfChecker checks the security configurations from mosquitto.conf file.
 *
 */
public class ConfChecker 
{
	/*
	 * Parses the conf file and constructs the conf object and generates the report.
	 */
	public static void confChecker(String fileName){
		ConfParser confParser = new ConfParser();
        Conf conf = confParser.parse(fileName);
        Report report = new Report();
        report.genReport(conf);
	}
    public static void main( String[] args )
    {
    	if(args.length != 1){
    		System.out.println("USAGE: Enter mosquitto.conf file with it path as argument.");
    		return;
    	}
    	File f = new File(args[0]);
		if(!f.exists()) { 
		   System.out.println("File not found.");
		   return;
		}
        confChecker(args[0]);
    }
}
