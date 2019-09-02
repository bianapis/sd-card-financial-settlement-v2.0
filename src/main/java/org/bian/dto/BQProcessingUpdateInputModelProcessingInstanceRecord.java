package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProcessingUpdateInputModelProcessingInstanceRecord
 */
public class BQProcessingUpdateInputModelProcessingInstanceRecord   {
  private String participantAcquirerBankSettlementTerms = null;

  private String participantIssuerBankSettlementTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the card settlement fees/terms in force  
   * @return participantAcquirerBankSettlementTerms
  **/

  public String getParticipantAcquirerBankSettlementTerms() {
    return participantAcquirerBankSettlementTerms;
  }

  public void setParticipantAcquirerBankSettlementTerms(String participantAcquirerBankSettlementTerms) {
    this.participantAcquirerBankSettlementTerms = participantAcquirerBankSettlementTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines card settlement fees/terms in force 
   * @return participantIssuerBankSettlementTerms
  **/

  public String getParticipantIssuerBankSettlementTerms() {
    return participantIssuerBankSettlementTerms;
  }

  public void setParticipantIssuerBankSettlementTerms(String participantIssuerBankSettlementTerms) {
    this.participantIssuerBankSettlementTerms = participantIssuerBankSettlementTerms;
  }


}

