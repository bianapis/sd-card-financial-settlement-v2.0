package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInstructionUpdateInputModelInstructionInstanceRecord;
import org.bian.dto.BQPaymentRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord;
import org.bian.dto.BQPaymentRetrieveOutputModelConsolidationInstanceRecord;
import org.bian.dto.BQPaymentRetrieveOutputModelPaymentInstanceAnalysis;
import org.bian.dto.BQPaymentRetrieveOutputModelPaymentInstanceReport;
import org.bian.dto.BQPaymentUpdateInputModelPaymentInstanceRecord;
import org.bian.dto.BQProcessingUpdateInputModelProcessingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPaymentRetrieveOutputModel
 */
public class BQPaymentRetrieveOutputModel   {
  private BQPaymentRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord cardFinancialSettlementProcedureInstanceRecord = null;

  private BQPaymentRetrieveOutputModelConsolidationInstanceRecord consolidationInstanceRecord = null;

  private BQProcessingUpdateInputModelProcessingInstanceRecord processingInstanceRecord = null;

  private BQInstructionUpdateInputModelInstructionInstanceRecord instructionInstanceRecord = null;

  private BQPaymentUpdateInputModelPaymentInstanceRecord paymentInstanceRecord = null;

  private String paymentRetrieveActionTaskReference = null;

  private Object paymentRetrieveActionTaskRecord = null;

  private String paymentRetrieveActionResponse = null;

  private BQPaymentRetrieveOutputModelPaymentInstanceReport paymentInstanceReport = null;

  private BQPaymentRetrieveOutputModelPaymentInstanceAnalysis paymentInstanceAnalysis = null;


  /**
   * Get cardFinancialSettlementProcedureInstanceRecord
   * @return cardFinancialSettlementProcedureInstanceRecord
  **/

  public BQPaymentRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord getCardFinancialSettlementProcedureInstanceRecord() {
    return cardFinancialSettlementProcedureInstanceRecord;
  }

  public void setCardFinancialSettlementProcedureInstanceRecord(BQPaymentRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord cardFinancialSettlementProcedureInstanceRecord) {
    this.cardFinancialSettlementProcedureInstanceRecord = cardFinancialSettlementProcedureInstanceRecord;
  }


  /**
   * Get consolidationInstanceRecord
   * @return consolidationInstanceRecord
  **/

  public BQPaymentRetrieveOutputModelConsolidationInstanceRecord getConsolidationInstanceRecord() {
    return consolidationInstanceRecord;
  }

  public void setConsolidationInstanceRecord(BQPaymentRetrieveOutputModelConsolidationInstanceRecord consolidationInstanceRecord) {
    this.consolidationInstanceRecord = consolidationInstanceRecord;
  }


  /**
   * Get processingInstanceRecord
   * @return processingInstanceRecord
  **/

  public BQProcessingUpdateInputModelProcessingInstanceRecord getProcessingInstanceRecord() {
    return processingInstanceRecord;
  }

  public void setProcessingInstanceRecord(BQProcessingUpdateInputModelProcessingInstanceRecord processingInstanceRecord) {
    this.processingInstanceRecord = processingInstanceRecord;
  }


  /**
   * Get instructionInstanceRecord
   * @return instructionInstanceRecord
  **/

  public BQInstructionUpdateInputModelInstructionInstanceRecord getInstructionInstanceRecord() {
    return instructionInstanceRecord;
  }

  public void setInstructionInstanceRecord(BQInstructionUpdateInputModelInstructionInstanceRecord instructionInstanceRecord) {
    this.instructionInstanceRecord = instructionInstanceRecord;
  }


  /**
   * Get paymentInstanceRecord
   * @return paymentInstanceRecord
  **/

  public BQPaymentUpdateInputModelPaymentInstanceRecord getPaymentInstanceRecord() {
    return paymentInstanceRecord;
  }

  public void setPaymentInstanceRecord(BQPaymentUpdateInputModelPaymentInstanceRecord paymentInstanceRecord) {
    this.paymentInstanceRecord = paymentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payment instance retrieve service call 
   * @return paymentRetrieveActionTaskReference
  **/

  public String getPaymentRetrieveActionTaskReference() {
    return paymentRetrieveActionTaskReference;
  }

  public void setPaymentRetrieveActionTaskReference(String paymentRetrieveActionTaskReference) {
    this.paymentRetrieveActionTaskReference = paymentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return paymentRetrieveActionTaskRecord
  **/

  public Object getPaymentRetrieveActionTaskRecord() {
    return paymentRetrieveActionTaskRecord;
  }

  public void setPaymentRetrieveActionTaskRecord(Object paymentRetrieveActionTaskRecord) {
    this.paymentRetrieveActionTaskRecord = paymentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return paymentRetrieveActionResponse
  **/

  public String getPaymentRetrieveActionResponse() {
    return paymentRetrieveActionResponse;
  }

  public void setPaymentRetrieveActionResponse(String paymentRetrieveActionResponse) {
    this.paymentRetrieveActionResponse = paymentRetrieveActionResponse;
  }


  /**
   * Get paymentInstanceReport
   * @return paymentInstanceReport
  **/

  public BQPaymentRetrieveOutputModelPaymentInstanceReport getPaymentInstanceReport() {
    return paymentInstanceReport;
  }

  public void setPaymentInstanceReport(BQPaymentRetrieveOutputModelPaymentInstanceReport paymentInstanceReport) {
    this.paymentInstanceReport = paymentInstanceReport;
  }


  /**
   * Get paymentInstanceAnalysis
   * @return paymentInstanceAnalysis
  **/

  public BQPaymentRetrieveOutputModelPaymentInstanceAnalysis getPaymentInstanceAnalysis() {
    return paymentInstanceAnalysis;
  }

  public void setPaymentInstanceAnalysis(BQPaymentRetrieveOutputModelPaymentInstanceAnalysis paymentInstanceAnalysis) {
    this.paymentInstanceAnalysis = paymentInstanceAnalysis;
  }


}

