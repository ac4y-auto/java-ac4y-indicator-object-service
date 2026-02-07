package ac4y.indicator.service.object.get.plus;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByIndicatorAndDateRequest;

@XmlRootElement
public class GetPlusRequest extends ByIndicatorAndDateRequest {
	
	public GetPlusRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetPlusRequest");
		setAc4yIdentification(null);
	}

	public GetPlusRequest(
			String aIndicator
			,Date aDate) {
		super(aIndicator, aDate);
	}
	
}