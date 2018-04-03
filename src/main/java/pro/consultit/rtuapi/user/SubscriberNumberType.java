package pro.consultit.rtuapi.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum SubscriberNumberType {
	@XmlEnumValue("NotSpecified") NOT_SPECIFIED,
	@XmlEnumValue("Unknown") UNKNOWN,
	@XmlEnumValue("InternationalNumber") INTERNATIONAL,
	@XmlEnumValue("NationalNumber") NATIONAL,
	@XmlEnumValue("NetworkSpecificNumber") NETWORK_SPECIFIC,
	@XmlEnumValue("SubscriberNumber") SUBSCRIBER,
	@XmlEnumValue("AbbreviatedNumber") ABBREVIATED
}
