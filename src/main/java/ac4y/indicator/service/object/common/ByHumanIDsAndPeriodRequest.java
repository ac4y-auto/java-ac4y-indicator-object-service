package ac4y.indicator.service.object.common;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.ByHumanIdsRequest;
import ac4y.guid8humanid.service.object.common.HumanIds;

@XmlRootElement
public class ByHumanIDsAndPeriodRequest extends ByHumanIdsRequest {
	
	public ByHumanIDsAndPeriodRequest() {
		getAc4yIdentification().getTemplate().setGUID("ByHumanIDsAndDateRequest");
		//setAc4yIdentification(null);
	}

	public ByHumanIDsAndPeriodRequest(
			HumanIds aHumanIds
			,Date aFrom
			,Date aTo) {
		
		super(aHumanIds);
		setFrom(aFrom);
		setTo(aTo);
		
	}

	protected Date from;

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}
	
	protected Date to;

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}
	
}