package ac4y.indicator.service.object.get.balance;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByIndicatorAndDateRequest;

@XmlRootElement
public class GetBalanceOnDateRequest extends ByIndicatorAndDateRequest {
	
	public GetBalanceOnDateRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetBalanceOnDateRequest");
		setAc4yIdentification(null);
	}

	public GetBalanceOnDateRequest(
			String aIndicator
			,Date aDate) {
		super(aIndicator, aDate);
	}
	
}