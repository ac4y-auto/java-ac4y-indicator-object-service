package ac4y.indicator.service.object.get.minus;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.FloatResultResponse;

@XmlRootElement
public class GetMinusByHumanIDsResponse extends FloatResultResponse {

	public GetMinusByHumanIDsResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetMinusByHumanIDsResponse");
		setAc4yIdentification(null);
	}
	
}
