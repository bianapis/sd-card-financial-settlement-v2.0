/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardFinancialSettlementApiService {

	SDCardFinancialSettlementActivateOutputModel activate(SDCardFinancialSettlementActivateInputModel request);
	
	SDCardFinancialSettlementConfigureOutputModel configure(String sdReferenceId, SDCardFinancialSettlementConfigureInputModel request);
	
	SDCardFinancialSettlementFeedbackOutputModel feedback(String sdReferenceId, SDCardFinancialSettlementFeedbackInputModel request);
	
	CRCardFinancialSettlementProcedureInitiateOutputModel initiate(String sdReferenceId, CRCardFinancialSettlementProcedureInitiateInputModel request);
	
	CRCardFinancialSettlementProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQConsolidationRetrieveOutputModel retrieveConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInstructionRetrieveOutputModel retrieveInstruction(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPaymentRetrieveOutputModel retrievePayment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProcessingRetrieveOutputModel retrieveProcessing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCardFinancialSettlementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCardFinancialSettlementProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCardFinancialSettlementProcedureUpdateInputModel request);
	
	BQConsolidationUpdateOutputModel updateConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConsolidationUpdateInputModel request);
	
	BQInstructionUpdateOutputModel updateInstruction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInstructionUpdateInputModel request);
	
	BQPaymentUpdateOutputModel updatePayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentUpdateInputModel request);
	
	BQProcessingUpdateOutputModel updateProcessing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProcessingUpdateInputModel request);
	
}
