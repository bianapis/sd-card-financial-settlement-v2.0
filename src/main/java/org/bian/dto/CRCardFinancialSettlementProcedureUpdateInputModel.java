package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardFinancialSettlementProcedureUpdateInputModelCardFinancialSettlementProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardFinancialSettlementProcedureUpdateInputModel
 */
public class CRCardFinancialSettlementProcedureUpdateInputModel   {
  private String cardFinancialSettlementServicingSessionReference = null;

  private String cardFinancialSettlementProcedureInstanceReference = null;

  private CRCardFinancialSettlementProcedureUpdateInputModelCardFinancialSettlementProcedureInstanceRecord cardFinancialSettlementProcedureInstanceRecord = null;

  private Object cardFinancialSettlementProcedureUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return cardFinancialSettlementServicingSessionReference
  **/

  public String getCardFinancialSettlementServicingSessionReference() {
    return cardFinancialSettlementServicingSessionReference;
  }

  public void setCardFinancialSettlementServicingSessionReference(String cardFinancialSettlementServicingSessionReference) {
    this.cardFinancialSettlementServicingSessionReference = cardFinancialSettlementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Card Financial Settlement Procedure instance 
   * @return cardFinancialSettlementProcedureInstanceReference
  **/

  public String getCardFinancialSettlementProcedureInstanceReference() {
    return cardFinancialSettlementProcedureInstanceReference;
  }

  public void setCardFinancialSettlementProcedureInstanceReference(String cardFinancialSettlementProcedureInstanceReference) {
    this.cardFinancialSettlementProcedureInstanceReference = cardFinancialSettlementProcedureInstanceReference;
  }


  /**
   * Get cardFinancialSettlementProcedureInstanceRecord
   * @return cardFinancialSettlementProcedureInstanceRecord
  **/

  public CRCardFinancialSettlementProcedureUpdateInputModelCardFinancialSettlementProcedureInstanceRecord getCardFinancialSettlementProcedureInstanceRecord() {
    return cardFinancialSettlementProcedureInstanceRecord;
  }

  public void setCardFinancialSettlementProcedureInstanceRecord(CRCardFinancialSettlementProcedureUpdateInputModelCardFinancialSettlementProcedureInstanceRecord cardFinancialSettlementProcedureInstanceRecord) {
    this.cardFinancialSettlementProcedureInstanceRecord = cardFinancialSettlementProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return cardFinancialSettlementProcedureUpdateActionTaskRecord
  **/

  public Object getCardFinancialSettlementProcedureUpdateActionTaskRecord() {
    return cardFinancialSettlementProcedureUpdateActionTaskRecord;
  }

  public void setCardFinancialSettlementProcedureUpdateActionTaskRecord(Object cardFinancialSettlementProcedureUpdateActionTaskRecord) {
    this.cardFinancialSettlementProcedureUpdateActionTaskRecord = cardFinancialSettlementProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

