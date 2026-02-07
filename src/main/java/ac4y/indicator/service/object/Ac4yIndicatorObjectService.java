package ac4y.indicator.service.object;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ac4y.base.Ac4yException;
import ac4y.guid8humanid.service.Ac4yGUID8HumanIDService;
import ac4y.indicator.service.java.Ac4yIndicatorService;
import ac4y.indicator.service.object.analytics.AnalyticsByHumanIDsRequest;
import ac4y.indicator.service.object.analytics.AnalyticsByHumanIDsResponse;
import ac4y.indicator.service.object.analytics.AnalyticsRequest;
import ac4y.indicator.service.object.analytics.AnalyticsResponse;
import ac4y.indicator.service.object.delete.DeleteAnalyticsByHumanIDsRequest;
import ac4y.indicator.service.object.delete.DeleteAnalyticsByHumanIDsResponse;
import ac4y.indicator.service.object.delete.DeleteAnalyticsByIndicatorRequest;
import ac4y.indicator.service.object.delete.DeleteAnalyticsByIndicatorResponse;
import ac4y.indicator.service.object.delete.DeleteAnalyticsByOriginRequest;
import ac4y.indicator.service.object.delete.DeleteAnalyticsByOriginResponse;
import ac4y.indicator.service.object.delete.DeleteAnalyticsByPersistentIDRequest;
import ac4y.indicator.service.object.delete.DeleteAnalyticsByPersistentIDResponse;
import ac4y.indicator.service.object.delete.DeleteIndicatorBalanceHistoryByHumanIDsRequest;
import ac4y.indicator.service.object.delete.DeleteIndicatorBalanceHistoryByHumanIDsResponse;
import ac4y.indicator.service.object.delete.DeleteIndicatorBalanceHistoryByIndicatorRequest;
import ac4y.indicator.service.object.delete.DeleteIndicatorBalanceHistoryByIndicatorResponse;
import ac4y.indicator.service.object.delete.DeleteIndicatorBalanceHistoryByPersistentIDRequest;
import ac4y.indicator.service.object.delete.DeleteIndicatorBalanceHistoryByPersistentIDResponse;
import ac4y.indicator.service.object.get.balance.GetBalanceByHumanIDsRequest;
import ac4y.indicator.service.object.get.balance.GetBalanceByHumanIDsResponse;
import ac4y.indicator.service.object.get.balance.GetBalanceOnDateRequest;
import ac4y.indicator.service.object.get.balance.GetBalanceOnDateResponse;
import ac4y.indicator.service.object.get.balance.GetBalanceRequest;
import ac4y.indicator.service.object.get.balance.GetBalanceResponse;
import ac4y.indicator.service.object.get.balance.GetPeriodBalanceByHumanIDsRequest;
import ac4y.indicator.service.object.get.balance.GetPeriodBalanceByHumanIDsResponse;
import ac4y.indicator.service.object.get.balance.GetPeriodBalanceRequest;
import ac4y.indicator.service.object.get.balance.GetPeriodBalanceResponse;
import ac4y.indicator.service.object.get.minus.GetMinusByHumanIDsRequest;
import ac4y.indicator.service.object.get.minus.GetMinusByHumanIDsResponse;
import ac4y.indicator.service.object.get.minus.GetMinusRequest;
import ac4y.indicator.service.object.get.minus.GetMinusResponse;
import ac4y.indicator.service.object.get.minus.GetPeriodMinusByHumanIDsRequest;
import ac4y.indicator.service.object.get.minus.GetPeriodMinusByHumanIDsResponse;
import ac4y.indicator.service.object.get.minus.GetPeriodMinusRequest;
import ac4y.indicator.service.object.get.minus.GetPeriodMinusResponse;
import ac4y.indicator.service.object.get.plus.GetPlusByHumanIDsRequest;
import ac4y.indicator.service.object.get.plus.GetPlusByHumanIDsResponse;
import ac4y.indicator.service.object.get.plus.GetPlusRequest;
import ac4y.indicator.service.object.get.plus.GetPlusResponse;
import ac4y.indicator.service.object.list.analytics.GetAnalyticsListCountRequest;
import ac4y.indicator.service.object.list.analytics.GetAnalyticsListCountResponse;
import ac4y.indicator.service.object.list.analytics.GetAnalyticsListRequest;
import ac4y.indicator.service.object.list.analytics.GetAnalyticsListResponse;
import ac4y.indicator.service.object.list.analytics.GetIndicatorAnalyticsListByHumanIDsRequest;
import ac4y.indicator.service.object.list.analytics.GetIndicatorAnalyticsListByHumanIDsResponse;
import ac4y.indicator.service.object.list.analytics.GetIndicatorAnalyticsListCountRequest;
import ac4y.indicator.service.object.list.analytics.GetIndicatorAnalyticsListCountResponse;
import ac4y.indicator.service.object.list.analytics.GetIndicatorAnalyticsListRequest;
import ac4y.indicator.service.object.list.analytics.GetIndicatorAnalyticsListResponse;
import ac4y.indicator.service.object.list.analytics.GetOriginAnalyticsListCountRequest;
import ac4y.indicator.service.object.list.analytics.GetOriginAnalyticsListCountResponse;
import ac4y.indicator.service.object.list.analytics.GetOriginAnalyticsListRequest;
import ac4y.indicator.service.object.list.analytics.GetOriginAnalyticsListResponse;
import ac4y.indicator.service.object.list.balancehistory.GetBalanceHistoryListCountRequest;
import ac4y.indicator.service.object.list.balancehistory.GetBalanceHistoryListCountResponse;
import ac4y.indicator.service.object.list.balancehistory.GetBalanceHistoryListRequest;
import ac4y.indicator.service.object.list.balancehistory.GetBalanceHistoryListResponse;
import ac4y.indicator.service.object.list.transfer.GetIndicatorTransferListByHumanIDsRequest;
import ac4y.indicator.service.object.list.transfer.GetIndicatorTransferListByHumanIDsResponse;
import ac4y.indicator.service.object.list.transfer.GetIndicatorTransferListRequest;
import ac4y.indicator.service.object.list.transfer.GetIndicatorTransferListResponse;
import ac4y.indicator.service.object.list.transfer.GetOriginTransferListRequest;
import ac4y.indicator.service.object.list.transfer.GetOriginTransferListResponse;
import ac4y.indicator.service.object.list.transfer.GetTransferListCountRequest;
import ac4y.indicator.service.object.list.transfer.GetTransferListCountResponse;
import ac4y.indicator.service.object.list.transfer.GetTransferListRequest;
import ac4y.indicator.service.object.list.transfer.GetTransferListResponse;
import ac4y.indicator.service.object.maintain.MaintainByHumanIDsRequest;
import ac4y.indicator.service.object.maintain.MaintainByHumanIDsResponse;
import ac4y.indicator.service.object.maintain.MaintainRequest;
import ac4y.indicator.service.object.maintain.MaintainResponse;
import ac4y.indicator.service.object.storno.StornoAnalyticsByHumanIDsRequest;
import ac4y.indicator.service.object.storno.StornoAnalyticsByHumanIDsResponse;
import ac4y.indicator.service.object.storno.StornoAnalyticsByIndicatorRequest;
import ac4y.indicator.service.object.storno.StornoAnalyticsByIndicatorResponse;
import ac4y.indicator.service.object.storno.StornoAnalyticsByOriginRequest;
import ac4y.indicator.service.object.storno.StornoAnalyticsByOriginResponse;
import ac4y.indicator.service.object.storno.StornoAnalyticsByPersistentIDRequest;
import ac4y.indicator.service.object.storno.StornoAnalyticsByPersistentIDResponse;
import ac4y.indicator.service.object.storno.StornoTransferByHumanIDsRequest;
import ac4y.indicator.service.object.storno.StornoTransferByHumanIDsResponse;
import ac4y.indicator.service.object.storno.StornoTransferByIndicatorRequest;
import ac4y.indicator.service.object.storno.StornoTransferByIndicatorResponse;
import ac4y.indicator.service.object.storno.StornoTransferByOriginRequest;
import ac4y.indicator.service.object.storno.StornoTransferByOriginResponse;
import ac4y.indicator.service.object.storno.StornoTransferByPersistentIDRequest;
import ac4y.indicator.service.object.storno.StornoTransferByPersistentIDResponse;
import ac4y.indicator.service.object.transfer.TransferByHumanIDsRequest;
import ac4y.indicator.service.object.transfer.TransferByHumanIDsResponse;
import ac4y.indicator.service.object.transfer.TransferRequest;
import ac4y.indicator.service.object.transfer.TransferResponse;
import ac4y.indicator.service.object.get.plus.GetPeriodPlusByHumanIDsRequest;
import ac4y.indicator.service.object.get.plus.GetPeriodPlusByHumanIDsResponse;
import ac4y.indicator.service.object.get.plus.GetPeriodPlusRequest;
import ac4y.indicator.service.object.get.plus.GetPeriodPlusResponse;
import ac4y.log.service.object.domain.Ac4yLogObjectService;
import ac4y.log.service.persistence.Ac4yLogService;
import ac4y.service.domain.Ac4yProcessResult;
import ac4y.service.domain.Ac4yServiceResponse;

import javax.xml.bind.JAXBException;

public class Ac4yIndicatorObjectService {

	private static final Logger LOG = LogManager.getLogger(Ac4yIndicatorObjectService.class);

	final String LOGCLASS = "Ac4yIndicatorObjectService";
	
	// * analytics

	public AnalyticsResponse analytics(AnalyticsRequest request) throws JAXBException {

		final String MODULE = "analytics";
		
		AnalyticsResponse response = new AnalyticsResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");

			new Ac4yLogObjectService().insert(
					new ac4y.log.service.object.domain.InsertRequest(
					LOGCLASS
					,MODULE
					,"begin"
					,request.getAsXml()
					,null
					,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
					,new Date()
					)
			);

			if (request.getIndicator() == null || request.getIndicator() == "")
				throw new Ac4yException("indicator is empty!");

			if (request.getOrigin() == null || request.getOrigin() == "")
				throw new Ac4yException("origin is empty!");

			if (request.getDate() == null)
				throw new Ac4yException("date is empty!");

			response.setAc4yIndicatorAnalytics(
				new Ac4yIndicatorService().analytics().analytics(
					request.getIndicator()
					,request.getDate()
					,request.getAmount()
					,request.isNegative()
					,request.getOrigin()
					,false
				)
			);

			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
			new Ac4yLogObjectService().insert(
					new ac4y.log.service.object.domain.InsertRequest(
							LOGCLASS
							,MODULE
							,"fault"
							,new Ac4yException().getStackTraceAsString(e)
							,null
							,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
							,new Date()
					)
			);

		}

		new Ac4yLogObjectService().insert(
				new ac4y.log.service.object.domain.InsertRequest(
						LOGCLASS
						,MODULE
						,"end"
						,response.getAsXml()
						,null
						,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
						,new Date()
				)
		);

		return response;
		
	} // analytics

	public AnalyticsByHumanIDsResponse analyticsByHumanIDs(AnalyticsByHumanIDsRequest request) throws JAXBException {

		final String MODULE = "analyticsByHumanIDs";
		
		AnalyticsByHumanIDsResponse response = new AnalyticsByHumanIDsResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			new Ac4yLogService().insert(
					LOGCLASS
					,MODULE
					,"begin"
					,request.getAsXml()
					,null
					,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
					,new Date()
			);

			if (request.getHumanIDs() == null)
				throw new Ac4yException("humanIDs is missing!");
			
			if (request.getHumanIDs().getTemplateHumanID()==null || request.getHumanIDs().getTemplateHumanID()=="")
				throw new Ac4yException("templateHumanID is empty!");
			
			if (request.getHumanIDs().getHumanID()==null || request.getHumanIDs().getHumanID()=="")
				throw new Ac4yException("humanID is empty!");

			if (request.getOrigin() == null || request.getOrigin() == "")
				throw new Ac4yException("origin is empty!");
			
			if (request.getDate() == null)
				throw new Ac4yException("date is empty!");

			response.setAc4yIndicatorAnalytics(
				new Ac4yIndicatorService().analytics().analytics(
					request.getHumanIDs().getTemplateHumanID()
					,request.getHumanIDs().getHumanID()
					,request.getDate()
					,request.getAmount()
					,request.isMinusAmount()
					,request.getOrigin()
					,false
				)
			);

			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
			new Ac4yLogObjectService().insert(
					new ac4y.log.service.object.domain.InsertRequest(
							LOGCLASS
							,MODULE
							,"fault"
							,new Ac4yException().getStackTraceAsString(e)
							,null
							,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
							,new Date()
					)
			);

		}

		new Ac4yLogObjectService().insert(
				new ac4y.log.service.object.domain.InsertRequest(
						LOGCLASS
						,MODULE
						,"end"
						,response.getAsXml()
						,null
						,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
						,new Date()
				)
		);

		return response;
		
	} // analyticsByHumanIDs


	// * transfer	

	public TransferResponse transfer(TransferRequest request) throws JAXBException {

		final String MODULE = "transfer";

		LOG.info(request.getAsJson());

		TransferResponse response = new TransferResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			new Ac4yLogService().insert(
					LOGCLASS
					,MODULE
					,"begin"
					,request.getAsXml()
					,null
					,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
					,new Date()
			);

			if (request.getOrigin() == null || request.getOrigin() == "")
				throw new Ac4yException("origin is empty!");

			String dp=request.getPlus();
			String dm=request.getMinus();
			Date dd=request.getDate();
			float df=request.getAmount();
			String doo=request.getOrigin();
			Object dob=new Ac4yIndicatorService().transfer();
			response.setAc4yIndicatorTransfer(
				new Ac4yIndicatorService().transfer().transfer(
					request.getPlus()
					,request.getMinus()
					,request.getDate()
					,request.getAmount()
					,request.getOrigin()
					,false
				)
			);

			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
			new Ac4yLogObjectService().insert(
					new ac4y.log.service.object.domain.InsertRequest(
							LOGCLASS
							,MODULE
							,"fault"
							,new Ac4yException().getStackTraceAsString(e)
							,null
							,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
							,new Date()
					)
			);

		}

		new Ac4yLogObjectService().insert(
				new ac4y.log.service.object.domain.InsertRequest(
						LOGCLASS
						,MODULE
						,"end"
						,response.getAsXml()
						,null
						,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
						,new Date()
				)
		);

		LOG.info(response.getAsJson());

		return response;
		
	} // transfer

	public TransferByHumanIDsResponse transferByHumanIDs(TransferByHumanIDsRequest request) throws JAXBException {

		final String MODULE = "transferByHumanIDs";
		
		TransferByHumanIDsResponse response = new TransferByHumanIDsResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			new Ac4yLogService().insert(
					LOGCLASS
					,MODULE
					,"begin"
					,request.getAsXml()
					,null
					,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
					,new Date()
			);

			if (request.getPlus() == null)
				throw new Ac4yException("plus is missing!");
			
			if (request.getPlus().getTemplateHumanID()==null || request.getPlus().getTemplateHumanID()=="")
				throw new Ac4yException("plus.templateHumanID is empty!");
			
			if (request.getPlus().getHumanID()==null || request.getPlus().getHumanID()=="")
				throw new Ac4yException("plus.humanID is empty!");

			if (request.getMinus() == null)
				throw new Ac4yException("minus is missing!");
			
			if (request.getMinus().getTemplateHumanID()==null || request.getMinus().getTemplateHumanID()=="")
				throw new Ac4yException("minus.templateHumanID is empty!");
			
			if (request.getMinus().getHumanID()==null || request.getMinus().getHumanID()=="")
				throw new Ac4yException("minus.humanID is empty!");

			if (request.getOrigin() == null || request.getOrigin() == "")
				throw new Ac4yException("origin is empty!");
			
			if (request.getDate() == null)
				throw new Ac4yException("date is empty!");

			response.setAc4yIndicatorTransfer(
				new Ac4yIndicatorService().transfer().transfer(
					request.getPlus().getTemplateHumanID()
					,request.getPlus().getHumanID()
					,request.getMinus().getTemplateHumanID()
					,request.getMinus().getHumanID()
					,request.getDate()
					,request.getAmount()
					,request.getOrigin()
					,false
				)
			);

			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
			new Ac4yLogObjectService().insert(
					new ac4y.log.service.object.domain.InsertRequest(
							LOGCLASS
							,MODULE
							,"fault"
							,new Ac4yException().getStackTraceAsString(e)
							,null
							,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
							,new Date()
					)
			);

		}

		new Ac4yLogObjectService().insert(
				new ac4y.log.service.object.domain.InsertRequest(
						LOGCLASS
						,MODULE
						,"end"
						,response.getAsXml()
						,null
						,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
						,new Date()
				)
		);

		return response;
		
	} // transferByHumanIDs


	// * maintain

	// * storno analytics
	
	public StornoAnalyticsByPersistentIDResponse stornoAnalyticsByPersistentID(StornoAnalyticsByPersistentIDRequest request) throws JAXBException {

		final String MODULE = "stornoAnalyticsByPersistentID";
		
		StornoAnalyticsByPersistentIDResponse response = new StornoAnalyticsByPersistentIDResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			new Ac4yLogService().insert(
					LOGCLASS
					,MODULE
					,"begin"
					,request.getAsXml()
					,null
					,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
					,new Date()
			);

			new Ac4yIndicatorService().analytics().storno(request.getPersistentID());

			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
			new Ac4yLogObjectService().insert(
					new ac4y.log.service.object.domain.InsertRequest(
							LOGCLASS
							,MODULE
							,"fault"
							,new Ac4yException().getStackTraceAsString(e)
							,null
							,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
							,new Date()
					)
			);

		}

		new Ac4yLogObjectService().insert(
				new ac4y.log.service.object.domain.InsertRequest(
						LOGCLASS
						,MODULE
						,"end"
						,response.getAsXml()
						,null
						,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
						,new Date()
				)
		);

		return response;
		
	} // stornoAnalyticsByPersistentID

	public StornoAnalyticsByIndicatorResponse stornoAnalyticsByIndicator(StornoAnalyticsByIndicatorRequest request) throws JAXBException {

		final String MODULE = "stornoAnalyticsByIndicator";
		
		StornoAnalyticsByIndicatorResponse response = new StornoAnalyticsByIndicatorResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			new Ac4yLogService().insert(
					LOGCLASS
					,MODULE
					,"begin"
					,request.getAsXml()
					,null
					,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
					,new Date()
			);
			
			if (request.getIndicator() == null || request.getIndicator() == "")
				throw new Ac4yException("indicator is empty!");

			new Ac4yIndicatorService().analytics().storno(request.getIndicator());

			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
			new Ac4yLogObjectService().insert(
					new ac4y.log.service.object.domain.InsertRequest(
							LOGCLASS
							,MODULE
							,"fault"
							,new Ac4yException().getStackTraceAsString(e)
							,null
							,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
							,new Date()
					)
			);

		}

		new Ac4yLogObjectService().insert(
				new ac4y.log.service.object.domain.InsertRequest(
						LOGCLASS
						,MODULE
						,"end"
						,response.getAsXml()
						,null
						,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
						,new Date()
				)
		);

		return response;
		
	} // stornoAnalyticsByIndicator

	public StornoAnalyticsByHumanIDsResponse stornoAnalyticsByByHumanIDs(StornoAnalyticsByHumanIDsRequest request) throws JAXBException {

		final String MODULE = "stornoAnalyticsByByHumanIDs";
		
		StornoAnalyticsByHumanIDsResponse response = new StornoAnalyticsByHumanIDsResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			new Ac4yLogService().insert(
					LOGCLASS
					,MODULE
					,"begin"
					,request.getAsXml()
					,null
					,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
					,new Date()
			);

			if (request.getHumanIDs() == null)
				throw new Ac4yException("humanIDs is missing!");
			
			if (request.getHumanIDs().getTemplateHumanID()==null || request.getHumanIDs().getTemplateHumanID()=="")
				throw new Ac4yException("templateHumanID is empty!");
			
			if (request.getHumanIDs().getHumanID()==null || request.getHumanIDs().getHumanID()=="")
				throw new Ac4yException("humanID is empty!");
			
			new Ac4yIndicatorService().analytics().storno(
				request.getHumanIDs().getTemplateHumanID()
				,request.getHumanIDs().getHumanID()
			);

			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
			new Ac4yLogObjectService().insert(
					new ac4y.log.service.object.domain.InsertRequest(
							LOGCLASS
							,MODULE
							,"fault"
							,new Ac4yException().getStackTraceAsString(e)
							,null
							,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
							,new Date()
					)
			);

		}

		new Ac4yLogObjectService().insert(
				new ac4y.log.service.object.domain.InsertRequest(
						LOGCLASS
						,MODULE
						,"end"
						,response.getAsXml()
						,null
						,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
						,new Date()
				)
		);

		return response;
		
	} // stornoAnalyticsByByHumanIDs

	public StornoAnalyticsByOriginResponse stornoAnalyticsByOrigin(StornoAnalyticsByOriginRequest request) throws JAXBException {

		final String MODULE = "stornoAnalyticsByOrigin";
		
		StornoAnalyticsByOriginResponse response = new StornoAnalyticsByOriginResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			new Ac4yLogService().insert(
					LOGCLASS
					,MODULE
					,"begin"
					,request.getAsXml()
					,null
					,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
					,new Date()
			);

			if (request.getOrigin() == null || request.getOrigin() == "")
				throw new Ac4yException("origin is empty!");
			
			new Ac4yIndicatorService().analytics().byOrigin().storno(request.getOrigin());

			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
			new Ac4yLogObjectService().insert(
					new ac4y.log.service.object.domain.InsertRequest(
							LOGCLASS
							,MODULE
							,"fault"
							,new Ac4yException().getStackTraceAsString(e)
							,null
							,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
							,new Date()
					)
			);

		}

		new Ac4yLogObjectService().insert(
				new ac4y.log.service.object.domain.InsertRequest(
						LOGCLASS
						,MODULE
						,"end"
						,response.getAsXml()
						,null
						,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
						,new Date()
				)
		);

		return response;
		
	} // stornoAnalyticsByOrigin

	// * storno transfer	

	public StornoTransferByPersistentIDResponse stornoTransferByPersistentID(StornoTransferByPersistentIDRequest request) throws JAXBException {

		final String MODULE = "stornoTransferByPersistentID";
		
		StornoTransferByPersistentIDResponse response = new StornoTransferByPersistentIDResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			new Ac4yLogService().insert(
					LOGCLASS
					,MODULE
					,"begin"
					,request.getAsXml()
					,null
					,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
					,new Date()
			);

			new Ac4yIndicatorService().transfer().storno(request.getPersistentID());

			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
			new Ac4yLogObjectService().insert(
					new ac4y.log.service.object.domain.InsertRequest(
							LOGCLASS
							,MODULE
							,"fault"
							,new Ac4yException().getStackTraceAsString(e)
							,null
							,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
							,new Date()
					)
			);

		}

		new Ac4yLogObjectService().insert(
				new ac4y.log.service.object.domain.InsertRequest(
						LOGCLASS
						,MODULE
						,"end"
						,response.getAsXml()
						,null
						,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
						,new Date()
				)
		);

		return response;
		
	} // stornoTransferByPersistentID

	public StornoTransferByIndicatorResponse stornoTransferByIndicator(StornoTransferByIndicatorRequest request) throws JAXBException {

		final String MODULE = "stornoTransferByIndicator";
		
		StornoTransferByIndicatorResponse response = new StornoTransferByIndicatorResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			new Ac4yLogService().insert(
					LOGCLASS
					,MODULE
					,"begin"
					,request.getAsXml()
					,null
					,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
					,new Date()
			);
			
			if (request.getIndicator() == null || request.getIndicator() == "")
				throw new Ac4yException("indicator is empty!");

			new Ac4yIndicatorService().transfer().storno(request.getIndicator());

			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
			new Ac4yLogObjectService().insert(
					new ac4y.log.service.object.domain.InsertRequest(
							LOGCLASS
							,MODULE
							,"fault"
							,new Ac4yException().getStackTraceAsString(e)
							,null
							,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
							,new Date()
					)
			);

		}

		new Ac4yLogObjectService().insert(
				new ac4y.log.service.object.domain.InsertRequest(
						LOGCLASS
						,MODULE
						,"end"
						,response.getAsXml()
						,null
						,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
						,new Date()
				)
		);

		return response;
		
	} // stornoTransferByIndicator

	public StornoTransferByHumanIDsResponse stornoTransferByByHumanIDs(StornoTransferByHumanIDsRequest request) throws JAXBException {

		final String MODULE = "stornoTransferByByHumanIDs";
		
		StornoTransferByHumanIDsResponse response = new StornoTransferByHumanIDsResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			new Ac4yLogService().insert(
					LOGCLASS
					,MODULE
					,"begin"
					,request.getAsXml()
					,null
					,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
					,new Date()
			);

			if (request.getHumanIDs() == null)
				throw new Ac4yException("humanIDs is missing!");
			
			if (request.getHumanIDs().getTemplateHumanID()==null || request.getHumanIDs().getTemplateHumanID()=="")
				throw new Ac4yException("templateHumanID is empty!");
			
			if (request.getHumanIDs().getHumanID()==null || request.getHumanIDs().getHumanID()=="")
				throw new Ac4yException("humanID is empty!");
			
			new Ac4yIndicatorService().transfer().storno(
				request.getHumanIDs().getTemplateHumanID()
				,request.getHumanIDs().getHumanID()
			);

			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
			new Ac4yLogObjectService().insert(
					new ac4y.log.service.object.domain.InsertRequest(
							LOGCLASS
							,MODULE
							,"fault"
							,new Ac4yException().getStackTraceAsString(e)
							,null
							,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
							,new Date()
					)
			);

		}

		new Ac4yLogObjectService().insert(
				new ac4y.log.service.object.domain.InsertRequest(
						LOGCLASS
						,MODULE
						,"end"
						,response.getAsXml()
						,null
						,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
						,new Date()
				)
		);

		return response;
		
	} // stornoTransferByByHumanIDs

	public StornoTransferByOriginResponse stornoTransferByOrigin(StornoTransferByOriginRequest request) throws JAXBException {

		final String MODULE = "stornoTransferByOrigin";
		
		StornoTransferByOriginResponse response = new StornoTransferByOriginResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			new Ac4yLogService().insert(
					LOGCLASS
					,MODULE
					,"begin"
					,request.getAsXml()
					,null
					,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
					,new Date()
			);

			if (request.getOrigin() == null || request.getOrigin() == "")
				throw new Ac4yException("origin is empty!");
			
			new Ac4yIndicatorService().transfer().byOrigin().storno(request.getOrigin());

			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
			new Ac4yLogObjectService().insert(
					new ac4y.log.service.object.domain.InsertRequest(
							LOGCLASS
							,MODULE
							,"fault"
							,new Ac4yException().getStackTraceAsString(e)
							,null
							,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
							,new Date()
					)
			);

		}

		new Ac4yLogObjectService().insert(
				new ac4y.log.service.object.domain.InsertRequest(
						LOGCLASS
						,MODULE
						,"end"
						,response.getAsXml()
						,null
						,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
						,new Date()
				)
		);

		return response;
		
	} // stornoTransferByOrigin

	

	
	// * delete analytics


	// * delete indicator balance history	

	
	
	// * get sg

	public GetBalanceOnDateResponse getBalanceOnDate(GetBalanceOnDateRequest request) {
		
		GetBalanceOnDateResponse response = new GetBalanceOnDateResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			if (request.getIndicator() == null || request.getIndicator() == "")
				throw new Ac4yException("indicator is empty!");

			if (request.getDate() == null)
				throw new Ac4yException("date is empty!");

			response.setValue(
				new Ac4yIndicatorService().standard().getBalance(
					request.getIndicator()
					,request.getDate()
				)
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));

		}

		return response;
		
	} // getBalanceOnDate

	public GetBalanceResponse getBalance(GetBalanceRequest request) {
		
		GetBalanceResponse response = new GetBalanceResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			if (request.getIndicator() == null || request.getIndicator() == "")
				throw new Ac4yException("indicator is empty!");

			response.setValue(
				new Ac4yIndicatorService().standard().getBalance(
					request.getIndicator()
				)
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));

		}

		return response;
		
	} // getBalance

	public GetPlusResponse getPlus(GetPlusRequest request) {
		
		GetPlusResponse response = new GetPlusResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			if (request.getIndicator() == null || request.getIndicator() == "")
				throw new Ac4yException("indicator is empty!");

			if (request.getDate() == null)
				throw new Ac4yException("date is empty!");

			response.setValue(
				new Ac4yIndicatorService().standard().getPlus(
					request.getIndicator()
					,request.getDate()
				)
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));

		}

		return response;
		
	} // getPlus

	public GetMinusResponse getMinus(GetMinusRequest request) {
	
		GetMinusResponse response = new GetMinusResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			if (request.getIndicator() == null || request.getIndicator() == "")
				throw new Ac4yException("indicator is empty!");

			if (request.getDate() == null)
				throw new Ac4yException("date is empty!");

			response.setValue(
				new Ac4yIndicatorService().standard().getMinus(
					request.getIndicator()
					,request.getDate()
				)
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));

		}

		return response;
		
	} // getMinus

	public GetBalanceByHumanIDsResponse getBalanceByHumanIDs(GetBalanceByHumanIDsRequest request) {
		
		GetBalanceByHumanIDsResponse response = new GetBalanceByHumanIDsResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			if (request.getHumanIDs() == null)
				throw new Ac4yException("humanIDs is missing!");
			
			if (request.getHumanIDs().getTemplateHumanID()==null || request.getHumanIDs().getTemplateHumanID()=="")
				throw new Ac4yException("templateHumanID is empty!");
			
			if (request.getHumanIDs().getHumanID()==null || request.getHumanIDs().getHumanID()=="")
				throw new Ac4yException("humanID is empty!");
			
			if (request.getDate() == null)
				throw new Ac4yException("date is empty!");

			String GUID = 
				new Ac4yGUID8HumanIDService().getGUIDByHumanIDs(
					request.getHumanIDs().getTemplateHumanID()
					,request.getHumanIDs().getHumanID()
				);
				
			if (GUID == null)
				throw new Ac4yException("such object does not exist!");

			response.setValue(
				new Ac4yIndicatorService().standard().getBalanceByHumanIDs(
					request.getHumanIDs().getTemplateHumanID()
					,request.getHumanIDs().getHumanID()
					,request.getDate()
				)
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));

		}

		return response;
		
	} // getBalanceByHumanIDs

	public GetPlusByHumanIDsResponse getPlusByHumanIDs(GetPlusByHumanIDsRequest request) {
		
		GetPlusByHumanIDsResponse response = new GetPlusByHumanIDsResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			if (request.getHumanIDs() == null)
				throw new Ac4yException("humanIDs is missing!");
			
			if (request.getHumanIDs().getTemplateHumanID()==null || request.getHumanIDs().getTemplateHumanID()=="")
				throw new Ac4yException("templateHumanID is empty!");
			
			if (request.getHumanIDs().getHumanID()==null || request.getHumanIDs().getHumanID()=="")
				throw new Ac4yException("humanID is empty!");

			if (request.getDate() == null)
				throw new Ac4yException("date is empty!");

			String GUID = 
				new Ac4yGUID8HumanIDService().getGUIDByHumanIDs(
					request.getHumanIDs().getTemplateHumanID()
					,request.getHumanIDs().getHumanID()
				);
					
			if (GUID == null)
				throw new Ac4yException("such object does not exist!");
			
			response.setValue(
				new Ac4yIndicatorService().standard().getPlusByHumanIDs(
					request.getHumanIDs().getTemplateHumanID()
					,request.getHumanIDs().getHumanID()
					,request.getDate()
				)
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));

		}

		return response;
		
	} // getPlusByHumanIDs

	public GetMinusByHumanIDsResponse getMinusByHumanIDs(GetMinusByHumanIDsRequest request) {
	
		GetMinusByHumanIDsResponse response = new GetMinusByHumanIDsResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			if (request.getHumanIDs() == null)
				throw new Ac4yException("humanIDs is missing!");
			
			if (request.getHumanIDs().getTemplateHumanID()==null || request.getHumanIDs().getTemplateHumanID()=="")
				throw new Ac4yException("templateHumanID is empty!");
			
			if (request.getHumanIDs().getHumanID()==null || request.getHumanIDs().getHumanID()=="")
				throw new Ac4yException("humanID is empty!");

			if (request.getDate() == null)
				throw new Ac4yException("date is empty!");

			String GUID = 
					new Ac4yGUID8HumanIDService().getGUIDByHumanIDs(
						request.getHumanIDs().getTemplateHumanID()
						,request.getHumanIDs().getHumanID()
					);
						
				if (GUID == null)
					throw new Ac4yException("such object does not exist!");
				
			response.setValue(
				new Ac4yIndicatorService().standard().getMinusByHumanIDs(
					request.getHumanIDs().getTemplateHumanID()
					,request.getHumanIDs().getHumanID()
					,request.getDate()
				)
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));

		}

		return response;
		
	} // getMinusByHumanIDs

	public GetPeriodBalanceResponse getPeriodBalance(GetPeriodBalanceRequest request) {
		
		GetPeriodBalanceResponse response = new GetPeriodBalanceResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			if (request.getIndicator() == null || request.getIndicator() == "")
				throw new Ac4yException("indicator is empty!");

			if (request.getFrom() == null)
				throw new Ac4yException("from is empty!");

			if (request.getTo() == null)
				throw new Ac4yException("to is empty!");

			response.setValue(
				new Ac4yIndicatorService().standard().getPeriodBalance(
					request.getIndicator()
					,request.getFrom()
					,request.getTo()
				)
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));

		}

		return response;
		
	} // getPeriodBalance

	public GetPeriodPlusResponse getPeriodPlus(GetPeriodPlusRequest request) {
		
		GetPeriodPlusResponse response = new GetPeriodPlusResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			if (request.getIndicator() == null || request.getIndicator() == "")
				throw new Ac4yException("indicator is empty!");

			if (request.getFrom() == null)
				throw new Ac4yException("from is empty!");

			if (request.getTo() == null)
				throw new Ac4yException("to is empty!");

			response.setValue(
				new Ac4yIndicatorService().standard().getPeriodPlus(
					request.getIndicator()
					,request.getFrom()
					,request.getTo()
				)
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));

		}

		return response;
		
	} // getPeriodPlus

	public GetPeriodMinusResponse getPeriodMinus(GetPeriodMinusRequest request) {
	
		GetPeriodMinusResponse response = new GetPeriodMinusResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			if (request.getIndicator() == null || request.getIndicator() == "")
				throw new Ac4yException("indicator is empty!");

			if (request.getFrom() == null)
				throw new Ac4yException("from is empty!");

			if (request.getTo() == null)
				throw new Ac4yException("to is empty!");

			response.setValue(
				new Ac4yIndicatorService().standard().getPeriodMinus(
					request.getIndicator()
					,request.getFrom()
					,request.getTo()
				)
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));

		}

		return response;
		
	} // getPeriodMinus

	public GetPeriodBalanceByHumanIDsResponse getPeriodBalanceByHumanIDs(GetPeriodBalanceByHumanIDsRequest request) {
		
		GetPeriodBalanceByHumanIDsResponse response = new GetPeriodBalanceByHumanIDsResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			if (request.getHumanIDs() == null)
				throw new Ac4yException("humanIDs is missing!");
			
			if (request.getHumanIDs().getTemplateHumanID()==null || request.getHumanIDs().getTemplateHumanID()=="")
				throw new Ac4yException("templateHumanID is empty!");
			
			if (request.getHumanIDs().getHumanID()==null || request.getHumanIDs().getHumanID()=="")
				throw new Ac4yException("humanID is empty!");
			
			if (request.getFrom() == null)
				throw new Ac4yException("from is empty!");

			if (request.getTo() == null)
				throw new Ac4yException("to is empty!");

			String GUID = 
				new Ac4yGUID8HumanIDService().getGUIDByHumanIDs(
					request.getHumanIDs().getTemplateHumanID()
					,request.getHumanIDs().getHumanID()
				);
				
			if (GUID == null)
				throw new Ac4yException("such object does not exist!");

			response.setValue(
				new Ac4yIndicatorService().standard().getPeriodBalanceByHumanIDs(
					request.getHumanIDs().getTemplateHumanID()
					,request.getHumanIDs().getHumanID()
					,request.getFrom()
					,request.getTo()
				)
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));

		}

		return response;
		
	} // getPeriodBalanceByHumanIDs

	public GetPeriodPlusByHumanIDsResponse getPeriodPlusByHumanIDs(GetPeriodPlusByHumanIDsRequest request) {
		
		GetPeriodPlusByHumanIDsResponse response = new GetPeriodPlusByHumanIDsResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			if (request.getHumanIDs() == null)
				throw new Ac4yException("humanIDs is missing!");
			
			if (request.getHumanIDs().getTemplateHumanID()==null || request.getHumanIDs().getTemplateHumanID()=="")
				throw new Ac4yException("templateHumanID is empty!");
			
			if (request.getHumanIDs().getHumanID()==null || request.getHumanIDs().getHumanID()=="")
				throw new Ac4yException("humanID is empty!");

			if (request.getFrom() == null)
				throw new Ac4yException("from is empty!");

			if (request.getTo() == null)
				throw new Ac4yException("to is empty!");

			String GUID = 
				new Ac4yGUID8HumanIDService().getGUIDByHumanIDs(
					request.getHumanIDs().getTemplateHumanID()
					,request.getHumanIDs().getHumanID()
				);
					
			if (GUID == null)
				throw new Ac4yException("such object does not exist!");
			
			response.setValue(
				new Ac4yIndicatorService().standard().getPeriodPlusByHumanIDs(
					request.getHumanIDs().getTemplateHumanID()
					,request.getHumanIDs().getHumanID()
					,request.getFrom()
					,request.getTo()
				)
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));

		}

		return response;
		
	} // getPeriodPlusByHumanIDs

	public GetPeriodMinusByHumanIDsResponse getPeriodMinusByHumanIDs(GetPeriodMinusByHumanIDsRequest request) {
	
		GetPeriodMinusByHumanIDsResponse response = new GetPeriodMinusByHumanIDsResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
			
			if (request.getHumanIDs() == null)
				throw new Ac4yException("humanIDs is missing!");
			
			if (request.getHumanIDs().getTemplateHumanID()==null || request.getHumanIDs().getTemplateHumanID()=="")
				throw new Ac4yException("templateHumanID is empty!");
			
			if (request.getHumanIDs().getHumanID()==null || request.getHumanIDs().getHumanID()=="")
				throw new Ac4yException("humanID is empty!");

			if (request.getFrom() == null)
				throw new Ac4yException("from is empty!");

			if (request.getTo() == null)
				throw new Ac4yException("to is empty!");

			String GUID = 
					new Ac4yGUID8HumanIDService().getGUIDByHumanIDs(
						request.getHumanIDs().getTemplateHumanID()
						,request.getHumanIDs().getHumanID()
					);
						
				if (GUID == null)
					throw new Ac4yException("such object does not exist!");
				
			response.setValue(
				new Ac4yIndicatorService().standard().getPeriodMinusByHumanIDs(
					request.getHumanIDs().getTemplateHumanID()
					,request.getHumanIDs().getHumanID()
					,request.getFrom()
					,request.getTo()
				)
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));

		}

		return response;
		
	} // getPeriodMinusByHumanIDs

	public GetAnalyticsListResponse getAnalyticsList(GetAnalyticsListRequest request) {

		GetAnalyticsListResponse response = new GetAnalyticsListResponse();

		try {

			response.setAc4yIndicatorAnalyticsList(
				new Ac4yIndicatorService().analytics().analyticsStandard().getAnalyticsList(
							request.getWhere()
				)
			);
			
			if ((response.getAc4yIndicatorAnalyticsList().getAc4yIndicatorAnalytics().isEmpty()))
				response.setResult(new Ac4yProcessResult(0, "empty list", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));
				
		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getAnalyticsList

	public GetAnalyticsListCountResponse getAnalyticsListCount(GetAnalyticsListCountRequest request) {

		GetAnalyticsListCountResponse response = new GetAnalyticsListCountResponse();

		try {

			response.setCount(
				new Ac4yIndicatorService().analytics().analyticsStandard().getAnalyticsListCount(request.getWhere())
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));
				
		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getAnalyticsList

	public GetIndicatorAnalyticsListResponse getIndicatorAnalyticsList(GetIndicatorAnalyticsListRequest request) {
		
		GetIndicatorAnalyticsListResponse response = new GetIndicatorAnalyticsListResponse();

		try {

			if (request.getIndicator() == null || request.getIndicator() == "")
				throw new Ac4yException("indicator is empty!");
			
			response.setIndicatorAnalyticsList(
				new Ac4yIndicatorService().analytics().analyticsStandard().getIndicatorAnalyticsList(
					request.getIndicator()
				)
			);
			
			if ((response.getIndicatorAnalyticsList().getIndicatorAnalytics().isEmpty()))
				response.setResult(new Ac4yProcessResult(0, "empty list", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));
				
		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getIndicatorAnalyticsList

	public GetIndicatorAnalyticsListCountResponse getIndicatorAnalyticsListCount(GetIndicatorAnalyticsListCountRequest request) {
		
		GetIndicatorAnalyticsListCountResponse response = new GetIndicatorAnalyticsListCountResponse();

		try {

			if (request.getIndicator() == null || request.getIndicator() == "")
				throw new Ac4yException("indicator is empty!");
			
			response.setCount(
				new Ac4yIndicatorService().analytics().analyticsStandard().getIndicatorAnalyticsListCount(
					request.getIndicator()
				)
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));
				
		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getIndicatorAnalyticsListCount

	public GetIndicatorAnalyticsListByHumanIDsResponse getIndicatorAnalyticsListByHumanIDs(GetIndicatorAnalyticsListByHumanIDsRequest request) {
		
		GetIndicatorAnalyticsListByHumanIDsResponse response = new GetIndicatorAnalyticsListByHumanIDsResponse();

		try {

			if (request.getHumanIDs() == null)
				throw new Ac4yException("humanIDs is missing!");
			
			if (request.getHumanIDs().getTemplateHumanID()==null || request.getHumanIDs().getTemplateHumanID()=="")
				throw new Ac4yException("templateHumanID is empty!");
			
			if (request.getHumanIDs().getHumanID()==null || request.getHumanIDs().getHumanID()=="")
				throw new Ac4yException("humanID is empty!");

			String GUID = 
					new Ac4yGUID8HumanIDService().getGUIDByHumanIDs(
						request.getHumanIDs().getTemplateHumanID()
						,request.getHumanIDs().getHumanID()
					);
					
			if (GUID == null)
				throw new Ac4yException("such object does not exist!");
			
			response.setIndicatorAnalyticsList(
				new Ac4yIndicatorService().analytics().analyticsStandard().getIndicatorAnalyticsList(GUID)
			);
			
			if ((response.getIndicatorAnalyticsList().getIndicatorAnalytics().isEmpty()))
				response.setResult(new Ac4yProcessResult(0, "empty list", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));
				
		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getIndicatorAnalyticsListByHumanIDs

	public GetOriginAnalyticsListResponse getOriginAnalyticsList(GetOriginAnalyticsListRequest request) {

		GetOriginAnalyticsListResponse response = new GetOriginAnalyticsListResponse();

		try {

			if (request.getOrigin() == null || request.getOrigin() == "")
				throw new Ac4yException("origin is empty!");
			
			response.setOriginAnalyticsList(
				new Ac4yIndicatorService().analytics().analyticsStandard().getOriginAnalyticsList(
					request.getOrigin()
				)
			);
			
			if ((response.getOriginAnalyticsList().getOriginAnalytics().isEmpty()))
				response.setResult(new Ac4yProcessResult(0, "empty list", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));
				
		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getOriginAnalyticsList

	public GetTransferListResponse getTransferList(GetTransferListRequest request) {

		GetTransferListResponse response = new GetTransferListResponse();

		try {

			response.setAc4yIndicatorTransferList(
				new Ac4yIndicatorService().analytics().analyticsStandard().getTransferList(
					request.getWhere()
				)
			);
			
			if ((response.getAc4yIndicatorTransferList().getAc4yIndicatorTransfer().isEmpty()))
				response.setResult(new Ac4yProcessResult(0, "empty list", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));
				
		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getTransferList

	public GetTransferListCountResponse getTransferListCount(GetTransferListCountRequest request) {

		GetTransferListCountResponse response = new GetTransferListCountResponse();

		try {

			response.setCount(
				new Ac4yIndicatorService().analytics().analyticsStandard().getTransferListCount(request.getWhere())
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));
				
		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getTransferListCount

	public GetIndicatorTransferListResponse getIndicatorTransferList(GetIndicatorTransferListRequest request) {

		GetIndicatorTransferListResponse response = new GetIndicatorTransferListResponse();

		try {

			if (request.getIndicator() == null || request.getIndicator() == "")
				throw new Ac4yException("indicator is empty!");
			
			response.setIndicatorTransferList(
				new Ac4yIndicatorService().analytics().analyticsStandard().getIndicatorTransferList(
					request.getIndicator()
				)
			);
			
			if ((response.getIndicatorTransferList().getIndicatorTransfer().isEmpty()))
				response.setResult(new Ac4yProcessResult(0, "empty list", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));
				
		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getIndicatorTransferList

	public GetIndicatorTransferListByHumanIDsResponse getIndicatorTransferListByHumanIDs(GetIndicatorTransferListByHumanIDsRequest request) {

		GetIndicatorTransferListByHumanIDsResponse response = new GetIndicatorTransferListByHumanIDsResponse();

		try {

			if (request.getHumanIDs() == null)
				throw new Ac4yException("humanIDs is missing!");
			
			if (request.getHumanIDs().getTemplateHumanID()==null || request.getHumanIDs().getTemplateHumanID()=="")
				throw new Ac4yException("templateHumanID is empty!");
			
			if (request.getHumanIDs().getHumanID()==null || request.getHumanIDs().getHumanID()=="")
				throw new Ac4yException("humanID is empty!");

			String GUID = 
					new Ac4yGUID8HumanIDService().getGUIDByHumanIDs(
						request.getHumanIDs().getTemplateHumanID()
						,request.getHumanIDs().getHumanID()
					);
					
			if (GUID == null)
				throw new Ac4yException("such object does not exist!");
			
			response.setIndicatorTransferList(
				new Ac4yIndicatorService().analytics().analyticsStandard().getIndicatorTransferList(GUID)
			);
				
			if ((response.getIndicatorTransferList().getIndicatorTransfer().isEmpty()))
				response.setResult(new Ac4yProcessResult(0, "empty list", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));
				
		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getIndicatorTransferListByHumanIDs

	public GetOriginTransferListResponse getOriginTransferList(GetOriginTransferListRequest request) {

		GetOriginTransferListResponse response = new GetOriginTransferListResponse();

		try {

			if (request.getOrigin() == null || request.getOrigin() == "")
				throw new Ac4yException("origin is empty!");
			
			response.setOriginTransferList(
				new Ac4yIndicatorService().analytics().analyticsStandard().getOriginTransferList(
					request.getOrigin()
				)
			);
			
			if ((response.getOriginTransferList().getOriginTransfer().isEmpty()))
				response.setResult(new Ac4yProcessResult(0, "empty list", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));
				
		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getOriginTransferList

	public GetBalanceHistoryListResponse getBalanceHistoryList(GetBalanceHistoryListRequest request) {

		GetBalanceHistoryListResponse response = new GetBalanceHistoryListResponse();

		try {

			response.setAc4yIndicatorBalanceHistoryList(
				new Ac4yIndicatorService().analytics().analyticsStandard().getBalanceHistoryList(
					request.getWhere()
				)
			);
			
			if ((response.getAc4yIndicatorBalanceHistoryList().getAc4yIndicatorBalanceHistory().isEmpty()))
				response.setResult(new Ac4yProcessResult(0, "empty list", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));
				
		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getBalanceHistoryList

	public GetBalanceHistoryListCountResponse getBalanceHistoryListCount(GetBalanceHistoryListCountRequest request) {

		GetBalanceHistoryListCountResponse response = new GetBalanceHistoryListCountResponse();

		try {

			response.setCount(
				new Ac4yIndicatorService().standard().getBalanceHistoryListCount(
					request.getWhere()
				)
			);
			
			response.setResult(new Ac4yProcessResult(1, "ok", null));
				
		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getBalanceHistoryListCount
	
}