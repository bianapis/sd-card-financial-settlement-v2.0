/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class CardFinancialSettlementApiController {

	@Autowired
	CardFinancialSettlementApiService service;
	
	@Process.Activate
	public BianResponse<SDCardFinancialSettlementActivateOutputModel> activate(@RequestBody BianRequest<SDCardFinancialSettlementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Process.Configure
	public BianResponse<SDCardFinancialSettlementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCardFinancialSettlementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Feedback
	public BianResponse<SDCardFinancialSettlementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCardFinancialSettlementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Initiate
	public BianResponse<CRCardFinancialSettlementProcedureInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCardFinancialSettlementProcedureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<CRCardFinancialSettlementProcedureRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("consolidation")
	@Process.Retrieve
	public BianResponse<BQConsolidationRetrieveOutputModel> retrieveConsolidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveConsolidation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("instruction")
	@Process.Retrieve
	public BianResponse<BQInstructionRetrieveOutputModel> retrieveInstruction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInstruction(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("payment")
	@Process.Retrieve
	public BianResponse<BQPaymentRetrieveOutputModel> retrievePayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePayment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("processing")
	@Process.Retrieve
	public BianResponse<BQProcessingRetrieveOutputModel> retrieveProcessing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProcessing(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Process.RetrieveSD
	public BianResponse<SDCardFinancialSettlementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Process.Update
	public BianResponse<CRCardFinancialSettlementProcedureUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCardFinancialSettlementProcedureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("consolidation")
	@Process.Update
	public BianResponse<BQConsolidationUpdateOutputModel> updateConsolidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQConsolidationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateConsolidation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("instruction")
	@Process.Update
	public BianResponse<BQInstructionUpdateOutputModel> updateInstruction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInstructionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInstruction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("payment")
	@Process.Update
	public BianResponse<BQPaymentUpdateOutputModel> updatePayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updatePayment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("processing")
	@Process.Update
	public BianResponse<BQProcessingUpdateOutputModel> updateProcessing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProcessingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProcessing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
