package pro.consultit.rtuapi.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum SubscriberTerminalType {
	@XmlEnumValue("Registerable") REGISTERABLE,
	@XmlEnumValue("Static") STATIC
}
