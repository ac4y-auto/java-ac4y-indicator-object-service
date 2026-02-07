package ac4y.indicator.service.object.get.minus;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.HumanIds;
import ac4y.indicator.service.object.common.ByHumanIDsAndPeriodRequest;

@XmlRootElement
public class GetPeriodMinusByHumanIDsRequest extends ByHumanIDsAndPeriodRequest {
	
	public GetPeriodMinusByHumanIDsRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetPeriodMinusByHumanIDsRequest");
		setAc4yIdentification(null);
	}

	public GetPeriodMinusByHumanIDsRequest(
			HumanIds aHumanIds
			,Date aFrom
			,Date aTo) {
		
		super(aHumanIds, aFrom, aTo);
		
	}
	
}