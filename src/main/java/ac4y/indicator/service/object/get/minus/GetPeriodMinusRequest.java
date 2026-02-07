package ac4y.indicator.service.object.get.minus;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByIndicatorAndPeriodRequest;

@XmlRootElement
public class GetPeriodMinusRequest extends ByIndicatorAndPeriodRequest {
	
	public GetPeriodMinusRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetPeriodMinusRequest");
		setAc4yIdentification(null);
	}

	public GetPeriodMinusRequest(
			String aIndicator
			,Date aFrom
			,Date aTo) {
		super(aIndicator, aFrom, aTo);
	}
	
}