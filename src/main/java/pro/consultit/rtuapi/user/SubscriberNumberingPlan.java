package pro.consultit.rtuapi.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum SubscriberNumberingPlan {
	@XmlEnumValue("NotSpecified") NOT_SPECIFIED,
	@XmlEnumValue("Unknown") UNKNOWN,
	@XmlEnumValue("ISDNTelephonyNumberingPlanRecommendationE164") E164,
	@XmlEnumValue("DataNumberingPlanRecommendationX121") X121,
	@XmlEnumValue("TelexNumberingPlanRecommendationF69") F69,
	@XmlEnumValue("NationalStandardNumberingPlan") NATIONAL,
	@XmlEnumValue("PrivateNumberingPlan") PRIVATE
}
