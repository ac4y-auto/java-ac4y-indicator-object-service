package ac4y.indicator.service.object.analytics;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.Ac4yIndicatorAnalyticsResultResponse;

@XmlRootElement
public class AnalyticsByHumanIDsResponse extends Ac4yIndicatorAnalyticsResultResponse {

	public AnalyticsByHumanIDsResponse() {
		getAc4yIdentification().getTemplate().setGUID("AnalyticsByHumanIDsResponse");
		setAc4yIdentification(null);
	}
	
}
