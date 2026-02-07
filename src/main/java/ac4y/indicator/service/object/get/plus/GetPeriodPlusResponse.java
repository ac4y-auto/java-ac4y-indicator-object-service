package ac4y.indicator.service.object.get.plus;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.FloatResultResponse;

@XmlRootElement
public class GetPeriodPlusResponse extends FloatResultResponse {

	public GetPeriodPlusResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetPeriodPlusResponse");
		setAc4yIdentification(null);
	}
	
}
