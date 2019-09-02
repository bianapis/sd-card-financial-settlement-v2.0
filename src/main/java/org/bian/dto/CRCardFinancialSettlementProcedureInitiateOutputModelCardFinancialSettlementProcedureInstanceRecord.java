package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardFinancialSettlementProcedureInitiateOutputModelCardFinancialSettlementProcedureInstanceRecord
 */
public class CRCardFinancialSettlementProcedureInitiateOutputModelCardFinancialSettlementProcedureInstanceRecord   {
  private String cardFinancialSettlementProcessDateTime = null;

  private String cardFinancialSettlementServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The scheduled time for the process - likely initiation time 
   * @return cardFinancialSettlementProcessDateTime
  **/

  public String getCardFinancialSettlementProcessDateTime() {
    return cardFinancialSettlementProcessDateTime;
  }

  public void setCardFinancialSettlementProcessDateTime(String cardFinancialSettlementProcessDateTime) {
    this.cardFinancialSettlementProcessDateTime = cardFinancialSettlementProcessDateTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type and scheduling of card settlement processing, includes Issuer and Acquirer involvement/scheduling details as necessary 
   * @return cardFinancialSettlementServiceSchedule
  **/

  public String getCardFinancialSettlementServiceSchedule() {
    return cardFinancialSettlementServiceSchedule;
  }

  public void setCardFinancialSettlementServiceSchedule(String cardFinancialSettlementServiceSchedule) {
    this.cardFinancialSettlementServiceSchedule = cardFinancialSettlementServiceSchedule;
  }


}

