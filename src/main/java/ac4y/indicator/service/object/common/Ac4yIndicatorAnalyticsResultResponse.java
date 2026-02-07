package ac4y.indicator.service.object.common;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.domain.Ac4yIndicatorAnalytics;
import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class Ac4yIndicatorAnalyticsResultResponse extends Ac4yServiceResponse {

	public Ac4yIndicatorAnalyticsResultResponse() {
		getAc4yIdentification().getTemplate().setGUID("Ac4yIndicatorAnalyticsResultResponse");
		//setAc4yIdentification(null);
	}
	
	protected Ac4yIndicatorAnalytics ac4yIndicatorAnalytics;

	public Ac4yIndicatorAnalytics getAc4yIndicatorAnalytics() {
		return ac4yIndicatorAnalytics;
	}

	public void setAc4yIndicatorAnalytics(Ac4yIndicatorAnalytics ac4yIndicatorAnalytics) {
		this.ac4yIndicatorAnalytics = ac4yIndicatorAnalytics;
	}

	
}
