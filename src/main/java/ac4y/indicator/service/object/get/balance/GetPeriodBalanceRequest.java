package ac4y.indicator.service.object.get.balance;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByIndicatorAndPeriodRequest;

@XmlRootElement
public class GetPeriodBalanceRequest extends ByIndicatorAndPeriodRequest {
	
	public GetPeriodBalanceRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetPeriodBalanceRequest");
		setAc4yIdentification(null);
	}

	public GetPeriodBalanceRequest(
			String aIndicator
			,Date aFrom
			,Date aTo) {
		super(aIndicator, aFrom, aTo);
	}
	
}