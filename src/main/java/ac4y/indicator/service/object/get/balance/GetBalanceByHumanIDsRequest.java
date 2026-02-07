package ac4y.indicator.service.object.get.balance;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.HumanIds;
import ac4y.indicator.service.object.common.ByHumanIDsAndDateRequest;

@XmlRootElement
public class GetBalanceByHumanIDsRequest extends ByHumanIDsAndDateRequest {
	
	public GetBalanceByHumanIDsRequest() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByHumanIDsRequest");
		setAc4yIdentification(null);
	}

	public GetBalanceByHumanIDsRequest(
			HumanIds aHumanIds
			,Date aDate) {
		super(aHumanIds, aDate);
	}
	
}