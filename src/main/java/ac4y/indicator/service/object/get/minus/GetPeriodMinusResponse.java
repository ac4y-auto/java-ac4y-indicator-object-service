package ac4y.indicator.service.object.get.minus;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.FloatResultResponse;

@XmlRootElement
public class GetPeriodMinusResponse extends FloatResultResponse {

	public GetPeriodMinusResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetPeriodPlusResponse");
		setAc4yIdentification(null);
	}
	
}
