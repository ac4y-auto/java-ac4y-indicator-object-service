package ac4y.indicator.service.object.get.minus;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByIndicatorAndDateRequest;

@XmlRootElement
public class GetMinusRequest extends ByIndicatorAndDateRequest {
	
	public GetMinusRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetMinusRequest");
		setAc4yIdentification(null);
	}

	public GetMinusRequest(
			String aIndicator
			,Date aDate) {
		super(aIndicator, aDate);
	}
	
}