package net.mqtt.msqttoconfcheck;

/*
 * Message that gets printed in the report.
 */
public class Messages {

	public final static String BANNER = "------------------------------------\nReport\n------------------------------------\n";
	public final static String END = "----------------------------------------------------------------------------------";
	public final static String ALLOW_ANONYMOUS = "WARN: allow_anonymous is true - Allows clients with username and password to connect";
	public final static String REQUIRE_CERTIFICATE = "WARN: require_certificate is false - Mutual authentication is not set and Server will not verifiy the Client's certificate";
	public final static String NoTLS = "WARN: Neither cafile nor capath set - No TLS/SSL is enabled";
	public final static String NOCRL = "WARN: Certificate Revocation is not checked";
}
