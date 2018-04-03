package pro.consultit.rtuapi.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum SubscriberCallAuthentication {
	@XmlEnumValue("Never") NEVER,
	@XmlEnumValue("NoRegistration") NOREG,
	@XmlEnumValue("Always") ALWAYS
}
