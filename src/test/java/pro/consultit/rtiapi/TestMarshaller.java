package pro.consultit.rtiapi;

import org.junit.Test;
import pro.consultit.rtuapi.SubscriberReply;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class TestMarshaller {


	private String testResponse = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
			"<Root>\n" +
			"    <command name=\"Get\" table=\"User\">\n" +
			"        <User>\n" +
			"            <user>78123820356</user>\n" +
			"            <id>78123820356</id>\n" +
			"            <user_caller_id>78123820356</user_caller_id>\n" +
			"            <password>Ml43DkXc</password>\n" +
			"            <email>\n" +
			"            </email>\n" +
			"            <web_login>78123820356</web_login>\n" +
			"            <subscriber>BILL_FED_12821</subscriber>\n" +
			"           \n" +
			"\n" +
			"\n" +
			" <audio_space_limit>5</audio_space_limit>\n" +
			"            <enabled_disa_pin>false</enabled_disa_pin>\n" +
			"            <enabled_call_waiting>false</enabled_call_waiting>\n" +
			"            <enabled_call_intrusion>false</enabled_call_intrusion>\n" +
			"            <enabled>true</enabled>\n" +
			"            <add_domain_name>false</add_domain_name>\n" +
			"            <radius_autorize_number>false</radius_autorize_number>\n" +
			"            <radius_accounting>false</radius_accounting>\n" +
			"            <cpc>\n" +
			"            </cpc>\n" +
			"            <language>ru-RU</language>\n" +
			"            <pincode>\n" +
			"            </pincode>\n" +
			"            <is_virtual_number>false</is_virtual_number>\n" +
			"            <licensing_option>BusinessSubscriber</licensing_option>\n" +
			"            <clir>disabled</clir>\n" +
			"            <enable_clir_for_numbers>\n" +
			"            </enable_clir_for_numbers>\n" +
			"            <disable_clir_for_numbers>\n" +
			"            </disable_clir_for_numbers>\n" +
			"            <block_anonymous_calls>false</block_anonymous_calls>\n" +
			"            <radius_authorize_registration>false</radius_authorize_registration>\n" +
			"            <sorm_translation>78123820356</sorm_translation>\n" +
			"            <display_name_passing_method>FromName</display_name_passing_method>\n" +
			"            <billing_id>78123820356</billing_id>\n" +
			"            <type_of_number>NotSpecified</type_of_number>\n" +
			"            <numbering_plan>NotSpecified</numbering_plan>\n" +
			"            <play_prompt_if_originator>true</play_prompt_if_originator>\n" +
			"            <call_authentication>Always</call_authentication>\n" +
			"            <owner_capacity>2</owner_capacity>\n" +
			"            <in_capacity>1</in_capacity>\n" +
			"            <out_capacity>1</out_capacity>\n" +
			"            <total_capacity>1</total_capacity>\n" +
			"            <last_password_change>\n" +
			"            </last_password_change>\n" +
			"            <max_rtu_terminals>0</max_rtu_terminals>\n" +
			"            <enable_record>false</enable_record>\n" +
			"            <notify_originator_about_forward>DoNotNotify</notify_originator_about_forward>\n" +
			"            <comment>\n" +
			"            </comment>\n" +
			"            <groups>\n" +
			"                <group>\n" +
			"                    <name>MultiTerminal</name>\n" +
			"                    <enabled>true</enabled>\n" +
			"                </group>\n" +
			"                <group>\n" +
			"                    <name>CDRsAccess</name>\n" +
			"                    <enabled>true</enabled>\n" +
			"                </group>\n" +
			"                <group>\n" +
			"                    <name>AudiofilesManagement</name>\n" +
			"                    <enabled>true</enabled>\n" +
			"                </group>\n" +
			"            </groups>\n" +
			"            <user_terminals>\n" +
			"                <user_terminal>\n" +
			"                    <allowed_subnets>\n" +
			"                    </allowed_subnets>\n" +
			"                    <terminal_id>0</terminal_id>\n" +
			"                    <login>78123820356</login>\n" +
			"                    <password>s6FOj23N</password>\n" +
			"                    <terminal_type>Registerable</terminal_type>\n" +
			"                    <ttl>1800</ttl>\n" +
			"                    <terminal_kind>GenericSIPTerminal</terminal_kind>\n" +
			"                    <address>\n" +
			"                    </address>\n" +
			"                    <port>\n" +
			"                    </port>\n" +
			"                    <behind_gateway>\n" +
			"                    </behind_gateway>\n" +
			"                    <profile>Default Local SIP Client Profile</profile>\n" +
			"                    <external_number>\n" +
			"                    </external_number>\n" +
			"                    <description>\n" +
			"                    </description>\n" +
			"                    <rtu_client_type>Null</rtu_client_type>\n" +
			"                    <zone>\n" +
			"                    </zone>\n" +
			"                </user_terminal>\n" +
			"            </user_terminals>\n" +
			"            <packages>\n" +
			"                <package>Access to subscriber features</package>\n" +
			"                <package>Access to subscriber services</package>\n" +
			"                <package>All</package>\n" +
			"                <package>standart_user</package>\n" +
			"            </packages>\n" +
			"        </User>\n" +
			"    </command>\n" +
			"</Root>";

	@Test
	public void text() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(SubscriberReply.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		StringReader stringReader = new StringReader(testResponse);
		SubscriberReply document = (SubscriberReply) jaxbUnmarshaller.unmarshal(stringReader);
		System.out.println(document.getSubscriberList().size());
	}
}
