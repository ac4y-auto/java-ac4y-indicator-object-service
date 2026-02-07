package ac4y.indicator.service.object.get.minus;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.FloatResultResponse;

@XmlRootElement
public class GetPeriodMinusByHumanIDsResponse extends FloatResultResponse {

	public GetPeriodMinusByHumanIDsResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetPeriodMinusByHumanIDsResponse");
		setAc4yIdentification(null);
	}
	
}
