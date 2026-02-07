package ac4y.indicator.service.object.get.balance;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.FloatResultResponse;

@XmlRootElement
public class GetBalanceByHumanIDsResponse extends FloatResultResponse {

	public GetBalanceByHumanIDsResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetBalanceByHumanIDsResponse");
		setAc4yIdentification(null);
	}
	
}
