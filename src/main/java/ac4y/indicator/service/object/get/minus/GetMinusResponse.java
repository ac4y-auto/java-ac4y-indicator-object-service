package ac4y.indicator.service.object.get.minus;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.FloatResultResponse;

@XmlRootElement
public class GetMinusResponse extends FloatResultResponse {

	public GetMinusResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetMinusResponse");
		setAc4yIdentification(null);
	}
	
}
