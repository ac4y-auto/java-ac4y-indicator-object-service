package ac4y.indicator.service.object.get.balance;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.FloatResultResponse;

@XmlRootElement
public class GetBalanceResponse extends FloatResultResponse {

	public GetBalanceResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetBalanceResponse");
		setAc4yIdentification(null);
	}
	
}
