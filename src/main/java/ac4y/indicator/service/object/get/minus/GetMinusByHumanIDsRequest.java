package ac4y.indicator.service.object.get.minus;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.HumanIds;
import ac4y.indicator.service.object.common.ByHumanIDsAndDateRequest;

@XmlRootElement
public class GetMinusByHumanIDsRequest extends ByHumanIDsAndDateRequest {
	
	public GetMinusByHumanIDsRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetMinusByHumanIDsRequest");
		setAc4yIdentification(null);
	}

	public GetMinusByHumanIDsRequest(
			HumanIds aHumanIds
			,Date aDate) {
		super(aHumanIds, aDate);
	}
	
}