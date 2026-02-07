package ac4y.indicator.service.object.delete;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class DeleteAnalyticsByIndicatorResponse extends Ac4yServiceResponse {

	public DeleteAnalyticsByIndicatorResponse() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByIndicatorResponse");
		setAc4yIdentification(null);
	}
	
}