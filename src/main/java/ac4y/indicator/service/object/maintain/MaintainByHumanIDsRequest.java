package ac4y.indicator.service.object.maintain;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.ByHumanIdsRequest;
import ac4y.guid8humanid.service.object.common.HumanIds;

@XmlRootElement
public class MaintainByHumanIDsRequest extends ByHumanIdsRequest {
	
	public MaintainByHumanIDsRequest() {
		getAc4yIdentification().getTemplate().setGUID("MaintainByHumanIDsRequest");
		setAc4yIdentification(null);
	}

	public MaintainByHumanIDsRequest(
			HumanIds humanIds
			,Date aDate
			,float aPlus
			,float aMinus) {
		super(humanIds);
		setDate(aDate);
		setPlus(aPlus);
		setMinus(aMinus);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getPlus() {
		return credit;
	}

	public void setPlus(float credit) {
		this.credit = credit;
	}

	public float getMinus() {
		return debit;
	}

	public void setMinus(float debit) {
		this.debit = debit;
	}

	protected Date date;
	protected float credit;
	protected float debit;

}