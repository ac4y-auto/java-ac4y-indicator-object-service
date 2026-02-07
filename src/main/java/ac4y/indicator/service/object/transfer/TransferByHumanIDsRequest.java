package ac4y.indicator.service.object.transfer;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.HumanIds;
import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class TransferByHumanIDsRequest extends Ac4yServiceRequest {

	public TransferByHumanIDsRequest() {
		getAc4yIdentification().getTemplate().setGUID("TransferByHumanIDsRequest");
		setAc4yIdentification(null);
	}

	public TransferByHumanIDsRequest(
			HumanIds aPlus
			,HumanIds aMinus
			,Date aDate
			,float aAmount
			,String aOrigin	) {

		setPlus(aPlus);
		setMinus(aMinus);
		setDate(aDate);
		setAmount(aAmount);
		setOrigin(aOrigin);
	}

	public HumanIds getPlus() {
		return plus;
	}

	public void setPlus(HumanIds plus) {
		this.plus = plus;
	}

	public HumanIds getMinus() {
		return minus;
	}

	public void setMinus(HumanIds minus) {
		this.minus = minus;
	}

	protected HumanIds plus;
	protected HumanIds minus;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	protected Date date;

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	protected float amount;
	protected String origin;
	
}