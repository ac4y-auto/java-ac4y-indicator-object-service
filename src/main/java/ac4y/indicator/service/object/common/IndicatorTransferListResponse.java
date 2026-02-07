package ac4y.indicator.service.object.common;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.domain.IndicatorTransferList;
import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class IndicatorTransferListResponse extends Ac4yServiceResponse {

	public IndicatorTransferListResponse() {
		getAc4yIdentification().getTemplate().setGUID("IndicatorTransferListResponse");
		//setAc4yIdentification(null);
	}

	protected IndicatorTransferList indicatorTransferList;

	public IndicatorTransferList getIndicatorTransferList() {
		return indicatorTransferList;
	}

	public void setIndicatorTransferList(IndicatorTransferList indicatorTransferList) {
		this.indicatorTransferList = indicatorTransferList;
	}

}
