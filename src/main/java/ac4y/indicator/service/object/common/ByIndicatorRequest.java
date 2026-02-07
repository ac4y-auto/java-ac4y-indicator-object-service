package ac4y.indicator.service.object.common;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class ByIndicatorRequest extends Ac4yServiceRequest {
	
	public ByIndicatorRequest() {
		getAc4yIdentification().getTemplate().setGUID("ByIndicatorRequest");
		//setAc4yIdentification(null);
	}

	public ByIndicatorRequest(
			String aIndicator
			) {
		this(); 
		setIndicator(aIndicator);
	}

	protected String indicator;

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	} 
	
}