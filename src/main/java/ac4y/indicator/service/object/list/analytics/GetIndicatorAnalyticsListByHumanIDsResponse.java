package ac4y.indicator.service.object.list.analytics;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.IndicatorAnalyticsListResponse;

@XmlRootElement
public class GetIndicatorAnalyticsListByHumanIDsResponse extends IndicatorAnalyticsListResponse {

	public GetIndicatorAnalyticsListByHumanIDsResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetIndicatorAnalyticsListByHumanIDsResponse");
		setAc4yIdentification(null);
	}

}
