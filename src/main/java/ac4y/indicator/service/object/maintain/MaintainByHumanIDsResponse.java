package ac4y.indicator.service.object.maintain;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class MaintainByHumanIDsResponse extends Ac4yServiceResponse {

	public MaintainByHumanIDsResponse() {
		getAc4yIdentification().getTemplate().setGUID("MaintainByHumanIDsResponse");
		setAc4yIdentification(null);
	}
	
}
