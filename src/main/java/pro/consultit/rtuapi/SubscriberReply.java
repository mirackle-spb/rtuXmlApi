package pro.consultit.rtuapi;

import pro.consultit.rtuapi.user.Subscriber;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Root")
@XmlAccessorType(XmlAccessType.FIELD)
public class SubscriberReply {
	@XmlElementWrapper(name = "command")
	@XmlElement(name = "User")
	private List<Subscriber> subscriberList = new ArrayList<>();


	public List<Subscriber> getSubscriberList() {
		return subscriberList;
	}

	public SubscriberReply setSubscriberList(List<Subscriber> subscriberList) {
		this.subscriberList = subscriberList;
		return this;
	}
}
