package ac4y.indicator.service.object.get.balance;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.FloatResultResponse;

@XmlRootElement
public class GetPeriodBalanceByHumanIDsResponse extends FloatResultResponse {

	public GetPeriodBalanceByHumanIDsResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetPeriodBalanceByHumanIDsResponse");
		setAc4yIdentification(null);
	}
	
}
