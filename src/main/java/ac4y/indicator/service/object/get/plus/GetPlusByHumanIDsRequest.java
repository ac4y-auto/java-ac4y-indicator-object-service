package ac4y.indicator.service.object.get.plus;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.HumanIds;
import ac4y.indicator.service.object.common.ByHumanIDsAndDateRequest;

@XmlRootElement
public class GetPlusByHumanIDsRequest extends ByHumanIDsAndDateRequest {
	
	public GetPlusByHumanIDsRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetPlusByHumanIDsRequest");
		setAc4yIdentification(null);
	}

	public GetPlusByHumanIDsRequest(
			HumanIds aHumanIds
			,Date aDate) {
		super(aHumanIds, aDate);
	}
	
}