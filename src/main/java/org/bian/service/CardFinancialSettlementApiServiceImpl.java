/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardFinancialSettlementApiServiceImpl implements CardFinancialSettlementApiService {

	public SDCardFinancialSettlementActivateOutputModel activate(SDCardFinancialSettlementActivateInputModel request){
		return JsonReader.read("activate-SDCardFinancialSettlementActivateOutputModel.json",new TypeReference<SDCardFinancialSettlementActivateOutputModel>(){});
	}
	
	public SDCardFinancialSettlementConfigureOutputModel configure(String sdReferenceId, SDCardFinancialSettlementConfigureInputModel request){
		return JsonReader.read("configure-SDCardFinancialSettlementConfigureOutputModel.json",new TypeReference<SDCardFinancialSettlementConfigureOutputModel>(){});
	}
	
	public SDCardFinancialSettlementFeedbackOutputModel feedback(String sdReferenceId, SDCardFinancialSettlementFeedbackInputModel request){
		return JsonReader.read("feedback-SDCardFinancialSettlementFeedbackOutputModel.json",new TypeReference<SDCardFinancialSettlementFeedbackOutputModel>(){});
	}
	
	public CRCardFinancialSettlementProcedureInitiateOutputModel initiate(String sdReferenceId, CRCardFinancialSettlementProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRCardFinancialSettlementProcedureInitiateOutputModel.json",new TypeReference<CRCardFinancialSettlementProcedureInitiateOutputModel>(){});
	}
	
	public CRCardFinancialSettlementProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCardFinancialSettlementProcedureRetrieveOutputModel.json",new TypeReference<CRCardFinancialSettlementProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQConsolidationRetrieveOutputModel retrieveConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQConsolidationRetrieveOutputModel.json",new TypeReference<BQConsolidationRetrieveOutputModel>(){});
	}
	
	public BQInstructionRetrieveOutputModel retrieveInstruction(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInstructionRetrieveOutputModel.json",new TypeReference<BQInstructionRetrieveOutputModel>(){});
	}
	
	public BQPaymentRetrieveOutputModel retrievePayment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPaymentRetrieveOutputModel.json",new TypeReference<BQPaymentRetrieveOutputModel>(){});
	}
	
	public BQProcessingRetrieveOutputModel retrieveProcessing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProcessingRetrieveOutputModel.json",new TypeReference<BQProcessingRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCardFinancialSettlementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCardFinancialSettlementRetrieveOutputModel.json",new TypeReference<SDCardFinancialSettlementRetrieveOutputModel>(){});
	}
	
	public CRCardFinancialSettlementProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCardFinancialSettlementProcedureUpdateInputModel request){
		return JsonReader.read("update-CRCardFinancialSettlementProcedureUpdateOutputModel.json",new TypeReference<CRCardFinancialSettlementProcedureUpdateOutputModel>(){});
	}
	
	public BQConsolidationUpdateOutputModel updateConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConsolidationUpdateInputModel request){
		return JsonReader.read("update-BQConsolidationUpdateOutputModel.json",new TypeReference<BQConsolidationUpdateOutputModel>(){});
	}
	
	public BQInstructionUpdateOutputModel updateInstruction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInstructionUpdateInputModel request){
		return JsonReader.read("update-BQInstructionUpdateOutputModel.json",new TypeReference<BQInstructionUpdateOutputModel>(){});
	}
	
	public BQPaymentUpdateOutputModel updatePayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentUpdateInputModel request){
		return JsonReader.read("update-BQPaymentUpdateOutputModel.json",new TypeReference<BQPaymentUpdateOutputModel>(){});
	}
	
	public BQProcessingUpdateOutputModel updateProcessing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProcessingUpdateInputModel request){
		return JsonReader.read("update-BQProcessingUpdateOutputModel.json",new TypeReference<BQProcessingUpdateOutputModel>(){});
	}
	
}
