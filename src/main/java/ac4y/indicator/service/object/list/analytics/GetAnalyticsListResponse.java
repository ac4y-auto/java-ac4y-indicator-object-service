package ac4y.indicator.service.object.list.analytics;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.domain.Ac4yIndicatorAnalyticsList;
import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class GetAnalyticsListResponse extends Ac4yServiceResponse {

	public GetAnalyticsListResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetAnalyticsListResponse");
		setAc4yIdentification(null);
	}

	protected Ac4yIndicatorAnalyticsList ac4yIndicatorAnalyticsList;

	public Ac4yIndicatorAnalyticsList getAc4yIndicatorAnalyticsList() {
		return ac4yIndicatorAnalyticsList;
	}

	public void setAc4yIndicatorAnalyticsList(Ac4yIndicatorAnalyticsList ac4yIndicatorAnalyticsList) {
		this.ac4yIndicatorAnalyticsList = ac4yIndicatorAnalyticsList;
	}



}
