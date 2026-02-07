package ac4y.indicator.service.object.get.balance;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.HumanIds;
import ac4y.indicator.service.object.common.ByHumanIDsAndPeriodRequest;

@XmlRootElement
public class GetPeriodBalanceByHumanIDsRequest extends ByHumanIDsAndPeriodRequest {
	
	public GetPeriodBalanceByHumanIDsRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetPeriodBalanceByHumanIDsRequest");
		setAc4yIdentification(null);
	}

	public GetPeriodBalanceByHumanIDsRequest(
			HumanIds aHumanIds
			,Date aFrom
			,Date aTo) {
		
		super(aHumanIds, aFrom, aTo);
		
	}
	
}