package ac4y.indicator.service.object.get.plus;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.FloatResultResponse;

@XmlRootElement
public class GetPlusByHumanIDsResponse extends FloatResultResponse {

	public GetPlusByHumanIDsResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetPlusByHumanIDsResponse");
		setAc4yIdentification(null);
	}
	
}
