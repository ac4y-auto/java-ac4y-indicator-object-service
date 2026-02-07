package ac4y.indicator.service.object.common;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.ByHumanIdsRequest;
import ac4y.guid8humanid.service.object.common.HumanIds;

@XmlRootElement
public class ByHumanIDsAndDateRequest extends ByHumanIdsRequest {
	
	public ByHumanIDsAndDateRequest() {
		getAc4yIdentification().getTemplate().setGUID("ByHumanIDsAndDateRequest");
		//setAc4yIdentification(null);
	}

	public ByHumanIDsAndDateRequest(
			HumanIds aHumanIds
			,Date aDate) {
		
		super(aHumanIds);
		setDate(aDate);
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	protected Date date;
	
}