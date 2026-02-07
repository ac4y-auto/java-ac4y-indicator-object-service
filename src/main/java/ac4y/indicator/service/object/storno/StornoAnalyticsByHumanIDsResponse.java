package ac4y.indicator.service.object.storno;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class StornoAnalyticsByHumanIDsResponse extends Ac4yServiceResponse {

	public StornoAnalyticsByHumanIDsResponse() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByHumanIDsResponse");
		setAc4yIdentification(null);
	}
	
}