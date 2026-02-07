package ac4y.indicator.service.object.delete;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class DeleteAnalyticsByOriginResponse extends Ac4yServiceResponse {

	public DeleteAnalyticsByOriginResponse() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByOriginResponse");
		setAc4yIdentification(null);
	}
	
}