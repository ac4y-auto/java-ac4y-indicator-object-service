package ac4y.indicator.service.object.list.analytics;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.CountResponse;

@XmlRootElement
public class GetOriginAnalyticsListCountResponse extends CountResponse {

	public GetOriginAnalyticsListCountResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetOriginAnalyticsListCountResponse");
		setAc4yIdentification(null);
	}

}
