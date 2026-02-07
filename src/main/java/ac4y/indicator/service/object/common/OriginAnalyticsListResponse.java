package ac4y.indicator.service.object.common;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.domain.OriginAnalyticsList;
import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class OriginAnalyticsListResponse extends Ac4yServiceResponse {

	public OriginAnalyticsListResponse() {
		getAc4yIdentification().getTemplate().setGUID("OriginAnalyticsListResponse");
		//setAc4yIdentification(null);
	}

	protected OriginAnalyticsList originAnalyticsList;

	public OriginAnalyticsList getOriginAnalyticsList() {
		return originAnalyticsList;
	}

	public void setOriginAnalyticsList(OriginAnalyticsList originAnalyticsList) {
		this.originAnalyticsList = originAnalyticsList;
	}

}
