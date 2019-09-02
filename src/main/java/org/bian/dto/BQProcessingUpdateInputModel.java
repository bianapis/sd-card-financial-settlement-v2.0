package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProcessingUpdateInputModelProcessingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProcessingUpdateInputModel
 */
public class BQProcessingUpdateInputModel   {
  private String cardFinancialSettlementProcedureInstanceReference = null;

  private String processingInstanceReference = null;

  private BQProcessingUpdateInputModelProcessingInstanceRecord processingInstanceRecord = null;

  private Object processingUpdateActionTaskRecord = null;

  private String processingUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Card Financial Settlement Procedure instance 
   * @return cardFinancialSettlementProcedureInstanceReference
  **/

  public String getCardFinancialSettlementProcedureInstanceReference() {
    return cardFinancialSettlementProcedureInstanceReference;
  }

  public void setCardFinancialSettlementProcedureInstanceReference(String cardFinancialSettlementProcedureInstanceReference) {
    this.cardFinancialSettlementProcedureInstanceReference = cardFinancialSettlementProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Processing instance 
   * @return processingInstanceReference
  **/

  public String getProcessingInstanceReference() {
    return processingInstanceReference;
  }

  public void setProcessingInstanceReference(String processingInstanceReference) {
    this.processingInstanceReference = processingInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return processingUpdateActionTaskRecord
  **/

  public Object getProcessingUpdateActionTaskRecord() {
    return processingUpdateActionTaskRecord;
  }

  public void setProcessingUpdateActionTaskRecord(Object processingUpdateActionTaskRecord) {
    this.processingUpdateActionTaskRecord = processingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return processingUpdateActionRequest
  **/

  public String getProcessingUpdateActionRequest() {
    return processingUpdateActionRequest;
  }

  public void setProcessingUpdateActionRequest(String processingUpdateActionRequest) {
    this.processingUpdateActionRequest = processingUpdateActionRequest;
  }


}

