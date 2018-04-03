package pro.consultit.rtuapi.user;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class Subscriber {
	@XmlElement(name = "id")
	private String number;
	@XmlElement(name = "type_of_number")
	private SubscriberNumberType numberType;
	@XmlElement(name = "numbering_plan")
	private SubscriberNumberingPlan numberingPlan;

	@XmlElement(name = "subscriber")
	private String name;

	@XmlElement(name = "licensing_option")
	private SubscriberLicensing licensing;
	@XmlElement(name = "is_virtual_number")
	private boolean virtual;

	@XmlElement(name = "enabled")
	private boolean enabled;

	@XmlElement(name = "user")
	private String username;
	@XmlElement(name = "password")
	private String password;

	@XmlElement(name = "user_caller_id")
	private String displayName;

	@XmlElement(name = "web_login")
	private String webLogin;

	@XmlElement(name = "web_password")
	private String webPassword;

	@XmlElement(name = "email")
	private String email;

	@XmlElement(name = "cpc")
	private int cpc;

	@XmlElement(name = "display_name_passing_method")
	private SubscriberDisplayNamePassingMethod namePassingMethod;

	@XmlElement(name = "call_authentication")
	private SubscriberCallAuthentication callAuthentication;

	@XmlElement(name = "add_domain_name")
	private boolean addDomainToNumber;

	@XmlElement(name = "play_prompt_if_originator")
	private boolean playPromptOnError;

	@XmlElement(name = "in_capacity")
	private Integer inCapacity;

	@XmlElement(name = "out_capacity")
	private Integer outCapacity;

	@XmlElement(name = "total_capacity")
	private Integer totalCapacity;

	@XmlElement(name = "owner_capacity")
	private Integer ownerCapacity;

	@XmlElement(name = "radius_autorize_number")
	private boolean radiusAuthorizeCall;

	@XmlElement(name = "radius_authorize_regtistration")
	private boolean radiusAuthorizeRegistration;

	@XmlElement(name = "radius_accounting")
	private boolean radiusAccounting;

	@XmlElement(name = "clir")
	private boolean clir;

	@XmlElement(name = "enabled_disa_pin")
	private boolean disaPinEnabled;

	@XmlElement(name = "pincode")
	private String disaPinCode;

	@XmlElement(name = "enabled_call_waiting")
	private boolean callWaiting;

	@XmlElement(name = "enabled_call_intrusion")
	private boolean callIntrusion;

	@XmlElement(name = "audio_space_limit")
	private Integer audioSpaceLimit;

	@XmlElement(name = "enable_record")
	private Integer allowCallRecord;

	@XmlElement(name = "max_rtu_terminals")
	private Integer macRtuClientTerminals;

	@XmlElement(name = "language")
	private String language;

	@XmlElement(name = "enable_clir_for_numbers")
	private String clirEnabledNumbers;

	@XmlElement(name = "<disable_clir_for_numbers")
	private String clirDisabledNumbers;

	@XmlElement(name = "block_anonymous_calls")
	private boolean blockAnonymousCalls;

	@XmlElementWrapper(name = "groups")
	@XmlElement(name = "group")
	private List<SubscriberGroup> groupList = new ArrayList<>();

	@XmlElementWrapper(name = "packages")
	@XmlElement(name = "package")
	private List<String> packageList = new ArrayList<>();

	@XmlElementWrapper(name = "user_terminals")
	@XmlElement(name = "user_terminal")
	private List<SubscriberTerminal> terminalList = new ArrayList<>();

	public String getNumber() {
		return number;
	}

	public Subscriber setNumber(String number) {
		this.number = number;
		return this;
	}

	public SubscriberNumberType getNumberType() {
		return numberType;
	}

	public Subscriber setNumberType(SubscriberNumberType numberType) {
		this.numberType = numberType;
		return this;
	}

	public SubscriberNumberingPlan getNumberingPlan() {
		return numberingPlan;
	}

	public Subscriber setNumberingPlan(SubscriberNumberingPlan numberingPlan) {
		this.numberingPlan = numberingPlan;
		return this;
	}

	public String getName() {
		return name;
	}

	public Subscriber setName(String name) {
		this.name = name;
		return this;
	}

	public SubscriberLicensing getLicensing() {
		return licensing;
	}

	public Subscriber setLicensing(SubscriberLicensing licensing) {
		this.licensing = licensing;
		return this;
	}

	public boolean isVirtual() {
		return virtual;
	}

	public Subscriber setVirtual(boolean virtual) {
		this.virtual = virtual;
		return this;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public Subscriber setEnabled(boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	public String getUsername() {
		return username;
	}

	public Subscriber setUsername(String username) {
		this.username = username;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public Subscriber setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getDisplayName() {
		return displayName;
	}

	public Subscriber setDisplayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	public String getWebLogin() {
		return webLogin;
	}

	public Subscriber setWebLogin(String webLogin) {
		this.webLogin = webLogin;
		return this;
	}

	public String getWebPassword() {
		return webPassword;
	}

	public Subscriber setWebPassword(String webPassword) {
		this.webPassword = webPassword;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Subscriber setEmail(String email) {
		this.email = email;
		return this;
	}

	public int getCpc() {
		return cpc;
	}

	public Subscriber setCpc(int cpc) {
		this.cpc = cpc;
		return this;
	}

	public SubscriberDisplayNamePassingMethod getNamePassingMethod() {
		return namePassingMethod;
	}

	public Subscriber setNamePassingMethod(SubscriberDisplayNamePassingMethod namePassingMethod) {
		this.namePassingMethod = namePassingMethod;
		return this;
	}

	public SubscriberCallAuthentication getCallAuthentication() {
		return callAuthentication;
	}

	public Subscriber setCallAuthentication(SubscriberCallAuthentication callAuthentication) {
		this.callAuthentication = callAuthentication;
		return this;
	}

	public boolean isAddDomainToNumber() {
		return addDomainToNumber;
	}

	public Subscriber setAddDomainToNumber(boolean addDomainToNumber) {
		this.addDomainToNumber = addDomainToNumber;
		return this;
	}

	public boolean isPlayPromptOnError() {
		return playPromptOnError;
	}

	public Subscriber setPlayPromptOnError(boolean playPromptOnError) {
		this.playPromptOnError = playPromptOnError;
		return this;
	}

	public Integer getInCapacity() {
		return inCapacity;
	}

	public Subscriber setInCapacity(Integer inCapacity) {
		this.inCapacity = inCapacity;
		return this;
	}

	public Integer getOutCapacity() {
		return outCapacity;
	}

	public Subscriber setOutCapacity(Integer outCapacity) {
		this.outCapacity = outCapacity;
		return this;
	}

	public Integer getTotalCapacity() {
		return totalCapacity;
	}

	public Subscriber setTotalCapacity(Integer totalCapacity) {
		this.totalCapacity = totalCapacity;
		return this;
	}

	public Integer getOwnerCapacity() {
		return ownerCapacity;
	}

	public Subscriber setOwnerCapacity(Integer ownerCapacity) {
		this.ownerCapacity = ownerCapacity;
		return this;
	}

	public boolean isRadiusAuthorizeCall() {
		return radiusAuthorizeCall;
	}

	public Subscriber setRadiusAuthorizeCall(boolean radiusAuthorizeCall) {
		this.radiusAuthorizeCall = radiusAuthorizeCall;
		return this;
	}

	public boolean isRadiusAuthorizeRegistration() {
		return radiusAuthorizeRegistration;
	}

	public Subscriber setRadiusAuthorizeRegistration(boolean radiusAuthorizeRegistration) {
		this.radiusAuthorizeRegistration = radiusAuthorizeRegistration;
		return this;
	}

	public boolean isRadiusAccounting() {
		return radiusAccounting;
	}

	public Subscriber setRadiusAccounting(boolean radiusAccounting) {
		this.radiusAccounting = radiusAccounting;
		return this;
	}

	public boolean isClir() {
		return clir;
	}

	public Subscriber setClir(boolean clir) {
		this.clir = clir;
		return this;
	}

	public boolean isDisaPinEnabled() {
		return disaPinEnabled;
	}

	public Subscriber setDisaPinEnabled(boolean disaPinEnabled) {
		this.disaPinEnabled = disaPinEnabled;
		return this;
	}

	public String getDisaPinCode() {
		return disaPinCode;
	}

	public Subscriber setDisaPinCode(String disaPinCode) {
		this.disaPinCode = disaPinCode;
		return this;
	}

	public boolean isCallWaiting() {
		return callWaiting;
	}

	public Subscriber setCallWaiting(boolean callWaiting) {
		this.callWaiting = callWaiting;
		return this;
	}

	public boolean isCallIntrusion() {
		return callIntrusion;
	}

	public Subscriber setCallIntrusion(boolean callIntrusion) {
		this.callIntrusion = callIntrusion;
		return this;
	}

	public Integer getAudioSpaceLimit() {
		return audioSpaceLimit;
	}

	public Subscriber setAudioSpaceLimit(Integer audioSpaceLimit) {
		this.audioSpaceLimit = audioSpaceLimit;
		return this;
	}

	public Integer getAllowCallRecord() {
		return allowCallRecord;
	}

	public Subscriber setAllowCallRecord(Integer allowCallRecord) {
		this.allowCallRecord = allowCallRecord;
		return this;
	}

	public Integer getMacRtuClientTerminals() {
		return macRtuClientTerminals;
	}

	public Subscriber setMacRtuClientTerminals(Integer macRtuClientTerminals) {
		this.macRtuClientTerminals = macRtuClientTerminals;
		return this;
	}

	public String getLanguage() {
		return language;
	}

	public Subscriber setLanguage(String language) {
		this.language = language;
		return this;
	}

	public String getClirEnabledNumbers() {
		return clirEnabledNumbers;
	}

	public Subscriber setClirEnabledNumbers(String clirEnabledNumbers) {
		this.clirEnabledNumbers = clirEnabledNumbers;
		return this;
	}

	public String getClirDisabledNumbers() {
		return clirDisabledNumbers;
	}

	public Subscriber setClirDisabledNumbers(String clirDisabledNumbers) {
		this.clirDisabledNumbers = clirDisabledNumbers;
		return this;
	}

	public boolean isBlockAnonymousCalls() {
		return blockAnonymousCalls;
	}

	public Subscriber setBlockAnonymousCalls(boolean blockAnonymousCalls) {
		this.blockAnonymousCalls = blockAnonymousCalls;
		return this;
	}

	public List<SubscriberGroup> getGroupList() {
		return groupList;
	}

	public Subscriber setGroupList(List<SubscriberGroup> groupList) {
		this.groupList = groupList;
		return this;
	}

	public List<String> getPackageList() {
		return packageList;
	}

	public Subscriber setPackageList(List<String> packageList) {
		this.packageList = packageList;
		return this;
	}

	public List<SubscriberTerminal> getTerminalList() {
		return terminalList;
	}

	public Subscriber setTerminalList(List<SubscriberTerminal> terminalList) {
		this.terminalList = terminalList;
		return this;
	}
}