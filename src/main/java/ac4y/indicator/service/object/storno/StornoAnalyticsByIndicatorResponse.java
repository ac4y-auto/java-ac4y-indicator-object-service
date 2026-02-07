package ac4y.indicator.service.object.storno;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class StornoAnalyticsByIndicatorResponse extends Ac4yServiceResponse {

	public StornoAnalyticsByIndicatorResponse() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByIndicatorResponse");
		setAc4yIdentification(null);
	}
	
}