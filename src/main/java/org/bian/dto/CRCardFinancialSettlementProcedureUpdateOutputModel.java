package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardFinancialSettlementProcedureUpdateInputModelCardFinancialSettlementProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardFinancialSettlementProcedureUpdateOutputModel
 */
public class CRCardFinancialSettlementProcedureUpdateOutputModel   {
  private CRCardFinancialSettlementProcedureUpdateInputModelCardFinancialSettlementProcedureInstanceRecord cardFinancialSettlementProcedureInstanceRecord = null;

  private String cardFinancialSettlementProcedureUpdateActionTaskReference = null;

  private Object cardFinancialSettlementProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return cardFinancialSettlementProcedureUpdateActionTaskReference
  **/

  public String getCardFinancialSettlementProcedureUpdateActionTaskReference() {
    return cardFinancialSettlementProcedureUpdateActionTaskReference;
  }

  public void setCardFinancialSettlementProcedureUpdateActionTaskReference(String cardFinancialSettlementProcedureUpdateActionTaskReference) {
    this.cardFinancialSettlementProcedureUpdateActionTaskReference = cardFinancialSettlementProcedureUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

