package ac4y.indicator.service.object.list.analytics;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.OriginAnalyticsListResponse;

@XmlRootElement
public class GetOriginAnalyticsListResponse extends OriginAnalyticsListResponse {

	public GetOriginAnalyticsListResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetOriginAnalyticsListResponse");
		setAc4yIdentification(null);
	}

}
