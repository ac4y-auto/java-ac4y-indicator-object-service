package ac4y.indicator.service.object.delete;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class DeleteAnalyticsByPersistentIDResponse extends Ac4yServiceResponse {

	public DeleteAnalyticsByPersistentIDResponse() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByPersistentIDResponse");
		setAc4yIdentification(null);
	}
	
}