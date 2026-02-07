package ac4y.indicator.service.object.list.analytics;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.CountResponse;

@XmlRootElement
public class GetAnalyticsListCountResponse extends CountResponse {

	public GetAnalyticsListCountResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetTransferListCountResponse");
		setAc4yIdentification(null);
	}

}
