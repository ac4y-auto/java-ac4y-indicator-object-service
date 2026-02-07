package ac4y.indicator.service.object.get.balance;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByIndicatorRequest;

@XmlRootElement
public class GetBalanceRequest extends ByIndicatorRequest {
	
	public GetBalanceRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetBalanceRequest");
		setAc4yIdentification(null);
	}

	public GetBalanceRequest(
			String aIndicator) {
		super(aIndicator);
	}
	
}