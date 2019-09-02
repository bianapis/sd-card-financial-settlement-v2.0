package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardFinancialSettlementProcedureInitiateOutputModelCardFinancialSettlementProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardFinancialSettlementProcedureInitiateOutputModel
 */
public class CRCardFinancialSettlementProcedureInitiateOutputModel   {
  private String cardFinancialSettlementProcedureInstanceReference = null;

  private String cardFinancialSettlementProcedureInitiateActionReference = null;

  private Object cardFinancialSettlementProcedureInitiateActionRecord = null;

  private String cardFinancialSettlementProcedureInstanceStatus = null;

  private CRCardFinancialSettlementProcedureInitiateOutputModelCardFinancialSettlementProcedureInstanceRecord cardFinancialSettlementProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return cardFinancialSettlementProcedureInitiateActionReference
  **/

  public String getCardFinancialSettlementProcedureInitiateActionReference() {
    return cardFinancialSettlementProcedureInitiateActionReference;
  }

  public void setCardFinancialSettlementProcedureInitiateActionReference(String cardFinancialSettlementProcedureInitiateActionReference) {
    this.cardFinancialSettlementProcedureInitiateActionReference = cardFinancialSettlementProcedureInitiateActionReference;
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

  public CRCardFinancialSettlementProcedureInitiateOutputModelCardFinancialSettlementProcedureInstanceRecord getCardFinancialSettlementProcedureInstanceRecord() {
    return cardFinancialSettlementProcedureInstanceRecord;
  }

  public void setCardFinancialSettlementProcedureInstanceRecord(CRCardFinancialSettlementProcedureInitiateOutputModelCardFinancialSettlementProcedureInstanceRecord cardFinancialSettlementProcedureInstanceRecord) {
    this.cardFinancialSettlementProcedureInstanceRecord = cardFinancialSettlementProcedureInstanceRecord;
  }


}

