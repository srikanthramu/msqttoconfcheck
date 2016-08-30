package net.mqtt.msqttoconfcheck.model;
/*
 * This models the mosquitto.conf file.
 */
public class Conf {

	private boolean upgrade_outgoing_qos;
	private boolean use_username_as_clientid;
	private int port = 8883;
	private String cafile = null;
	private String capath = null;
	private boolean require_certificate;
	private String crlfile = null;
	private boolean allow_anonymous;
	private String user = "root";
	
	public boolean isUpgrade_outgoing_qos() {
		return upgrade_outgoing_qos;
	}
	public void setUpgrade_outgoing_qos(boolean upgrade_outgoing_qos) {
		this.upgrade_outgoing_qos = upgrade_outgoing_qos;
	}
	public boolean isUse_username_as_clientid() {
		return use_username_as_clientid;
	}
	public void setUse_username_as_clientid(boolean use_username_as_clientid) {
		this.use_username_as_clientid = use_username_as_clientid;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getCafile() {
		return cafile;
	}
	public void setCafile(String cafile) {
		this.cafile = cafile;
	}
	public String getCapath() {
		return capath;
	}
	public void setCapath(String capath) {
		this.capath = capath;
	}
	public boolean isRequire_certificate() {
		return require_certificate;
	}
	public void setRequire_certificate(boolean require_certificate) {
		this.require_certificate = require_certificate;
	}
	public String getCrlfile() {
		return crlfile;
	}
	public void setCrlfile(String crlfile) {
		this.crlfile = crlfile;
	}
	public boolean isAllow_anonymous() {
		return allow_anonymous;
	}
	public void setAllow_anonymous(boolean allow_anonymous) {
		this.allow_anonymous = allow_anonymous;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Conf [upgrade_outgoing_qos=" + upgrade_outgoing_qos + ", use_username_as_clientid="
				+ use_username_as_clientid + ", port=" + port + ", cafile=" + cafile + ", capath=" + capath
				+ ", require_certificate=" + require_certificate + ", crlfile=" + crlfile + ", allow_anonymous="
				+ allow_anonymous + ", user=" + user + "]";
	}
	
	
}
