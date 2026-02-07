package ac4y.indicator.service.object.get.balance;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.FloatResultResponse;

@XmlRootElement
public class GetPeriodBalanceResponse extends FloatResultResponse {

	public GetPeriodBalanceResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetPeriodBalanceResponse");
		setAc4yIdentification(null);
	}
	
}
