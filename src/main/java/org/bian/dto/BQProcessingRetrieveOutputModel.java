package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProcessingRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord;
import org.bian.dto.BQProcessingRetrieveOutputModelConsolidationInstanceRecord;
import org.bian.dto.BQProcessingRetrieveOutputModelProcessingInstanceAnalysis;
import org.bian.dto.BQProcessingRetrieveOutputModelProcessingInstanceReport;
import org.bian.dto.BQProcessingUpdateInputModelProcessingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProcessingRetrieveOutputModel
 */
public class BQProcessingRetrieveOutputModel   {
  private BQProcessingRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord cardFinancialSettlementProcedureInstanceRecord = null;

  private BQProcessingRetrieveOutputModelConsolidationInstanceRecord consolidationInstanceRecord = null;

  private BQProcessingUpdateInputModelProcessingInstanceRecord processingInstanceRecord = null;

  private String processingRetrieveActionTaskReference = null;

  private Object processingRetrieveActionTaskRecord = null;

  private String processingRetrieveActionResponse = null;

  private BQProcessingRetrieveOutputModelProcessingInstanceReport processingInstanceReport = null;

  private BQProcessingRetrieveOutputModelProcessingInstanceAnalysis processingInstanceAnalysis = null;


  /**
   * Get cardFinancialSettlementProcedureInstanceRecord
   * @return cardFinancialSettlementProcedureInstanceRecord
  **/

  public BQProcessingRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord getCardFinancialSettlementProcedureInstanceRecord() {
    return cardFinancialSettlementProcedureInstanceRecord;
  }

  public void setCardFinancialSettlementProcedureInstanceRecord(BQProcessingRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord cardFinancialSettlementProcedureInstanceRecord) {
    this.cardFinancialSettlementProcedureInstanceRecord = cardFinancialSettlementProcedureInstanceRecord;
  }


  /**
   * Get consolidationInstanceRecord
   * @return consolidationInstanceRecord
  **/

  public BQProcessingRetrieveOutputModelConsolidationInstanceRecord getConsolidationInstanceRecord() {
    return consolidationInstanceRecord;
  }

  public void setConsolidationInstanceRecord(BQProcessingRetrieveOutputModelConsolidationInstanceRecord consolidationInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Processing instance retrieve service call 
   * @return processingRetrieveActionTaskReference
  **/

  public String getProcessingRetrieveActionTaskReference() {
    return processingRetrieveActionTaskReference;
  }

  public void setProcessingRetrieveActionTaskReference(String processingRetrieveActionTaskReference) {
    this.processingRetrieveActionTaskReference = processingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return processingRetrieveActionTaskRecord
  **/

  public Object getProcessingRetrieveActionTaskRecord() {
    return processingRetrieveActionTaskRecord;
  }

  public void setProcessingRetrieveActionTaskRecord(Object processingRetrieveActionTaskRecord) {
    this.processingRetrieveActionTaskRecord = processingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return processingRetrieveActionResponse
  **/

  public String getProcessingRetrieveActionResponse() {
    return processingRetrieveActionResponse;
  }

  public void setProcessingRetrieveActionResponse(String processingRetrieveActionResponse) {
    this.processingRetrieveActionResponse = processingRetrieveActionResponse;
  }


  /**
   * Get processingInstanceReport
   * @return processingInstanceReport
  **/

  public BQProcessingRetrieveOutputModelProcessingInstanceReport getProcessingInstanceReport() {
    return processingInstanceReport;
  }

  public void setProcessingInstanceReport(BQProcessingRetrieveOutputModelProcessingInstanceReport processingInstanceReport) {
    this.processingInstanceReport = processingInstanceReport;
  }


  /**
   * Get processingInstanceAnalysis
   * @return processingInstanceAnalysis
  **/

  public BQProcessingRetrieveOutputModelProcessingInstanceAnalysis getProcessingInstanceAnalysis() {
    return processingInstanceAnalysis;
  }

  public void setProcessingInstanceAnalysis(BQProcessingRetrieveOutputModelProcessingInstanceAnalysis processingInstanceAnalysis) {
    this.processingInstanceAnalysis = processingInstanceAnalysis;
  }


}

