package ac4y.indicator.service.object.storno;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class StornoAnalyticsByOriginResponse extends Ac4yServiceResponse {

	public StornoAnalyticsByOriginResponse() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByOriginResponse");
		setAc4yIdentification(null);
	}
	
}