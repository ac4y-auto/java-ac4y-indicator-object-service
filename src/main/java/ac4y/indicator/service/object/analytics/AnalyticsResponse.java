package ac4y.indicator.service.object.analytics;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.Ac4yIndicatorAnalyticsResultResponse;

@XmlRootElement
public class AnalyticsResponse extends Ac4yIndicatorAnalyticsResultResponse {

	public AnalyticsResponse() {
		getAc4yIdentification().getTemplate().setGUID("AnalyticsResponse");
		setAc4yIdentification(null);
	}
	
}