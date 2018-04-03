package pro.consultit.rtuapi.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class SubscriberGroup {
	@XmlElement(name = "name")
	private String name;

	@XmlElement(name = "enabled")
	private boolean enabled;

}
