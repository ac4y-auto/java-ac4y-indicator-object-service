package ac4y.indicator.service.object.list.analytics;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.CountResponse;

@XmlRootElement
public class GetIndicatorAnalyticsListCountResponse extends CountResponse {

	public GetIndicatorAnalyticsListCountResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetIndicatorAnalyticsListCountResponse");
		setAc4yIdentification(null);
	}

}
