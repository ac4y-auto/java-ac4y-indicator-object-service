package ac4y.indicator.service.object.list.analytics;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.IndicatorAnalyticsListResponse;

@XmlRootElement
public class GetIndicatorAnalyticsListResponse extends IndicatorAnalyticsListResponse {

	public GetIndicatorAnalyticsListResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetIndicatorAnalyticsListResponse");
		setAc4yIdentification(null);
	}

}
