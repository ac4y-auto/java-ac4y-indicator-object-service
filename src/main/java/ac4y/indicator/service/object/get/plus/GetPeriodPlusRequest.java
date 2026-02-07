package ac4y.indicator.service.object.get.plus;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByIndicatorAndPeriodRequest;

@XmlRootElement
public class GetPeriodPlusRequest extends ByIndicatorAndPeriodRequest {
	
	public GetPeriodPlusRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetPeriodPlusRequest");
		setAc4yIdentification(null);
	}

	public GetPeriodPlusRequest(
			String aIndicator
			,Date aFrom
			,Date aTo) {
		super(aIndicator, aFrom, aTo);
	}
	
}