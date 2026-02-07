package ac4y.indicator.service.object.get.balance;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.FloatResultResponse;

@XmlRootElement
public class GetBalanceOnDateResponse extends FloatResultResponse {

	public GetBalanceOnDateResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetBalanceOnDateResponse");
		setAc4yIdentification(null);
	}
	
}
