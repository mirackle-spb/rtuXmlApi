package pro.consultit.rtuapi.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum SubscriberDisplayNamePassingMethod {
	@XmlEnumValue("DoNotPass") DONT_PASS,
	@XmlEnumValue("FromName") FROM_NAME,
	@XmlEnumValue("FromDisplayName") FROM_DISPLAY_NAME,
	@XmlEnumValue("Transparent") TRANSPARENT
}
