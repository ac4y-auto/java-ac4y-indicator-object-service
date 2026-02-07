package ac4y.indicator.service.object.get.plus;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.FloatResultResponse;

@XmlRootElement
public class GetPeriodPlusByHumanIDsResponse extends FloatResultResponse {

	public GetPeriodPlusByHumanIDsResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetPeriodPlusByHumanIDsResponse");
		setAc4yIdentification(null);
	}
	
}
