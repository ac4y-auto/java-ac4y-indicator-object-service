package ac4y.indicator.service.object.get.plus;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.FloatResultResponse;

@XmlRootElement
public class GetPlusResponse extends FloatResultResponse {

	public GetPlusResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetPlusResponse");
		setAc4yIdentification(null);
	}
	
}
