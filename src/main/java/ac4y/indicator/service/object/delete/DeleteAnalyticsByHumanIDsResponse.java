package ac4y.indicator.service.object.delete;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class DeleteAnalyticsByHumanIDsResponse extends Ac4yServiceResponse {

	public DeleteAnalyticsByHumanIDsResponse() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByHumanIDsResponse");
		setAc4yIdentification(null);
	}
	
}