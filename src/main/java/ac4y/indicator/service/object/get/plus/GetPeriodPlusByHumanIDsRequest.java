package ac4y.indicator.service.object.get.plus;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.HumanIds;
import ac4y.indicator.service.object.common.ByHumanIDsAndPeriodRequest;

@XmlRootElement
public class GetPeriodPlusByHumanIDsRequest extends ByHumanIDsAndPeriodRequest {
	
	public GetPeriodPlusByHumanIDsRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetPeriodPlusByHumanIDsRequest");
		setAc4yIdentification(null);
	}

	public GetPeriodPlusByHumanIDsRequest(
			HumanIds aHumanIds
			,Date aFrom
			,Date aTo) {
		
		super(aHumanIds, aFrom, aTo);
		
	}
	
}