package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardFinancialSettlementProcedureInitiateInputModelCardFinancialSettlementProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardFinancialSettlementProcedureInitiateInputModel
 */
public class CRCardFinancialSettlementProcedureInitiateInputModel   {
  private String cardFinancialSettlementServicingSessionReference = null;

  private Object cardFinancialSettlementProcedureInitiateActionRecord = null;

  private String cardFinancialSettlementProcedureInstanceStatus = null;

  private CRCardFinancialSettlementProcedureInitiateInputModelCardFinancialSettlementProcedureInstanceRecord cardFinancialSettlementProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return cardFinancialSettlementProcedureInitiateActionRecord
  **/

  public Object getCardFinancialSettlementProcedureInitiateActionRecord() {
    return cardFinancialSettlementProcedureInitiateActionRecord;
  }

  public void setCardFinancialSettlementProcedureInitiateActionRecord(Object cardFinancialSettlementProcedureInitiateActionRecord) {
    this.cardFinancialSettlementProcedureInitiateActionRecord = cardFinancialSettlementProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Card Financial Settlement Procedure instance (e.g. initialised, pending, active) 
   * @return cardFinancialSettlementProcedureInstanceStatus
  **/

  public String getCardFinancialSettlementProcedureInstanceStatus() {
    return cardFinancialSettlementProcedureInstanceStatus;
  }

  public void setCardFinancialSettlementProcedureInstanceStatus(String cardFinancialSettlementProcedureInstanceStatus) {
    this.cardFinancialSettlementProcedureInstanceStatus = cardFinancialSettlementProcedureInstanceStatus;
  }


  /**
   * Get cardFinancialSettlementProcedureInstanceRecord
   * @return cardFinancialSettlementProcedureInstanceRecord
  **/

  public CRCardFinancialSettlementProcedureInitiateInputModelCardFinancialSettlementProcedureInstanceRecord getCardFinancialSettlementProcedureInstanceRecord() {
    return cardFinancialSettlementProcedureInstanceRecord;
  }

  public void setCardFinancialSettlementProcedureInstanceRecord(CRCardFinancialSettlementProcedureInitiateInputModelCardFinancialSettlementProcedureInstanceRecord cardFinancialSettlementProcedureInstanceRecord) {
    this.cardFinancialSettlementProcedureInstanceRecord = cardFinancialSettlementProcedureInstanceRecord;
  }


}

