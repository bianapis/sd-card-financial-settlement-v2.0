package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInstructionRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord;
import org.bian.dto.BQInstructionRetrieveOutputModelConsolidationInstanceRecord;
import org.bian.dto.BQInstructionRetrieveOutputModelInstructionInstanceAnalysis;
import org.bian.dto.BQInstructionRetrieveOutputModelInstructionInstanceReport;
import org.bian.dto.BQInstructionUpdateInputModelInstructionInstanceRecord;
import org.bian.dto.BQProcessingUpdateInputModelProcessingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInstructionRetrieveOutputModel
 */
public class BQInstructionRetrieveOutputModel   {
  private BQInstructionRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord cardFinancialSettlementProcedureInstanceRecord = null;

  private BQInstructionRetrieveOutputModelConsolidationInstanceRecord consolidationInstanceRecord = null;

  private BQProcessingUpdateInputModelProcessingInstanceRecord processingInstanceRecord = null;

  private BQInstructionUpdateInputModelInstructionInstanceRecord instructionInstanceRecord = null;

  private String instructionRetrieveActionTaskReference = null;

  private Object instructionRetrieveActionTaskRecord = null;

  private String instructionRetrieveActionResponse = null;

  private BQInstructionRetrieveOutputModelInstructionInstanceReport instructionInstanceReport = null;

  private BQInstructionRetrieveOutputModelInstructionInstanceAnalysis instructionInstanceAnalysis = null;


  /**
   * Get cardFinancialSettlementProcedureInstanceRecord
   * @return cardFinancialSettlementProcedureInstanceRecord
  **/

  public BQInstructionRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord getCardFinancialSettlementProcedureInstanceRecord() {
    return cardFinancialSettlementProcedureInstanceRecord;
  }

  public void setCardFinancialSettlementProcedureInstanceRecord(BQInstructionRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord cardFinancialSettlementProcedureInstanceRecord) {
    this.cardFinancialSettlementProcedureInstanceRecord = cardFinancialSettlementProcedureInstanceRecord;
  }


  /**
   * Get consolidationInstanceRecord
   * @return consolidationInstanceRecord
  **/

  public BQInstructionRetrieveOutputModelConsolidationInstanceRecord getConsolidationInstanceRecord() {
    return consolidationInstanceRecord;
  }

  public void setConsolidationInstanceRecord(BQInstructionRetrieveOutputModelConsolidationInstanceRecord consolidationInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Instruction instance retrieve service call 
   * @return instructionRetrieveActionTaskReference
  **/

  public String getInstructionRetrieveActionTaskReference() {
    return instructionRetrieveActionTaskReference;
  }

  public void setInstructionRetrieveActionTaskReference(String instructionRetrieveActionTaskReference) {
    this.instructionRetrieveActionTaskReference = instructionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return instructionRetrieveActionTaskRecord
  **/

  public Object getInstructionRetrieveActionTaskRecord() {
    return instructionRetrieveActionTaskRecord;
  }

  public void setInstructionRetrieveActionTaskRecord(Object instructionRetrieveActionTaskRecord) {
    this.instructionRetrieveActionTaskRecord = instructionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return instructionRetrieveActionResponse
  **/

  public String getInstructionRetrieveActionResponse() {
    return instructionRetrieveActionResponse;
  }

  public void setInstructionRetrieveActionResponse(String instructionRetrieveActionResponse) {
    this.instructionRetrieveActionResponse = instructionRetrieveActionResponse;
  }


  /**
   * Get instructionInstanceReport
   * @return instructionInstanceReport
  **/

  public BQInstructionRetrieveOutputModelInstructionInstanceReport getInstructionInstanceReport() {
    return instructionInstanceReport;
  }

  public void setInstructionInstanceReport(BQInstructionRetrieveOutputModelInstructionInstanceReport instructionInstanceReport) {
    this.instructionInstanceReport = instructionInstanceReport;
  }


  /**
   * Get instructionInstanceAnalysis
   * @return instructionInstanceAnalysis
  **/

  public BQInstructionRetrieveOutputModelInstructionInstanceAnalysis getInstructionInstanceAnalysis() {
    return instructionInstanceAnalysis;
  }

  public void setInstructionInstanceAnalysis(BQInstructionRetrieveOutputModelInstructionInstanceAnalysis instructionInstanceAnalysis) {
    this.instructionInstanceAnalysis = instructionInstanceAnalysis;
  }


}

