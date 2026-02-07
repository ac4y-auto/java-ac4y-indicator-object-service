package ac4y.indicator.service.object.common;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.domain.IndicatorAnalyticsList;
import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class IndicatorAnalyticsListResponse extends Ac4yServiceResponse {

	public IndicatorAnalyticsListResponse() {
		getAc4yIdentification().getTemplate().setGUID("IndicatorAnalyticsListResponse");
		//setAc4yIdentification(null);
	}

	protected IndicatorAnalyticsList indicatorAnalyticsList;

	public IndicatorAnalyticsList getIndicatorAnalyticsList() {
		return indicatorAnalyticsList;
	}

	public void setIndicatorAnalyticsList(IndicatorAnalyticsList indicatorAnalyticsList) {
		this.indicatorAnalyticsList = indicatorAnalyticsList;
	}

}
