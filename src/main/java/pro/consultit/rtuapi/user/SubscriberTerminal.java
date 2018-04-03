package pro.consultit.rtuapi.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class SubscriberTerminal {
	@XmlElement(name = "terminal_id")
	private Integer id;

	@XmlElement(name = "login")
	private String login;

	@XmlElement(name = "password")
	private String password;

	@XmlElement(name = "allowed_subnets")
	private String allowedSubnets;

	@XmlElement(name = "zone")
	private String zone;

	@XmlElement(name = "terminal_type")
	private SubscriberTerminalType type;

	@XmlElement(name = "ttl")
	private Integer ttl;

	@XmlElement(name = "terminal_kind")
	private Integer terminalKind;

	@XmlElement(name = "address")
	private String address;

	@XmlElement(name = "port")
	private Integer port;

	@XmlElement(name = "behind_gateway")
	private boolean behindGateway;

	@XmlElement(name = "profile")
	private String profile;

	@XmlElement(name = "external_number")
	private String externalNumber;

	@XmlElement(name = "description")
	private String description;

	@XmlElement(name = "rtu_client_type")
	private String rtuClientType;

	public Integer getId() {
		return id;
	}

	public SubscriberTerminal setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getLogin() {
		return login;
	}

	public SubscriberTerminal setLogin(String login) {
		this.login = login;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public SubscriberTerminal setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getAllowedSubnets() {
		return allowedSubnets;
	}

	public SubscriberTerminal setAllowedSubnets(String allowedSubnets) {
		this.allowedSubnets = allowedSubnets;
		return this;
	}

	public String getZone() {
		return zone;
	}

	public SubscriberTerminal setZone(String zone) {
		this.zone = zone;
		return this;
	}

	public SubscriberTerminalType getType() {
		return type;
	}

	public SubscriberTerminal setType(SubscriberTerminalType type) {
		this.type = type;
		return this;
	}

	public Integer getTtl() {
		return ttl;
	}

	public SubscriberTerminal setTtl(Integer ttl) {
		this.ttl = ttl;
		return this;
	}

	public Integer getTerminalKind() {
		return terminalKind;
	}

	public SubscriberTerminal setTerminalKind(Integer terminalKind) {
		this.terminalKind = terminalKind;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public SubscriberTerminal setAddress(String address) {
		this.address = address;
		return this;
	}

	public Integer getPort() {
		return port;
	}

	public SubscriberTerminal setPort(Integer port) {
		this.port = port;
		return this;
	}

	public boolean isBehindGateway() {
		return behindGateway;
	}

	public SubscriberTerminal setBehindGateway(boolean behindGateway) {
		this.behindGateway = behindGateway;
		return this;
	}

	public String getProfile() {
		return profile;
	}

	public SubscriberTerminal setProfile(String profile) {
		this.profile = profile;
		return this;
	}

	public String getExternalNumber() {
		return externalNumber;
	}

	public SubscriberTerminal setExternalNumber(String externalNumber) {
		this.externalNumber = externalNumber;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public SubscriberTerminal setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getRtuClientType() {
		return rtuClientType;
	}

	public SubscriberTerminal setRtuClientType(String rtuClientType) {
		this.rtuClientType = rtuClientType;
		return this;
	}
}

