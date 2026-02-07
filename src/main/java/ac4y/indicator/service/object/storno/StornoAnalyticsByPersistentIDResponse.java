package ac4y.indicator.service.object.storno;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class StornoAnalyticsByPersistentIDResponse extends Ac4yServiceResponse {

	public StornoAnalyticsByPersistentIDResponse() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByPersistentIDResponse");
		setAc4yIdentification(null);
	}
	
}