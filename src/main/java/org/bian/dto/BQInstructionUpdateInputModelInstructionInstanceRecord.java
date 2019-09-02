package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInstructionUpdateInputModelInstructionInstanceRecord
 */
public class BQInstructionUpdateInputModelInstructionInstanceRecord   {
  private String participantAcquirerBankSettlementAccountStatement = null;

  private String participantIssuerBankSettlementAccountStatement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Settlement account statement for processing window - used to confirm payments 
   * @return participantAcquirerBankSettlementAccountStatement
  **/

  public String getParticipantAcquirerBankSettlementAccountStatement() {
    return participantAcquirerBankSettlementAccountStatement;
  }

  public void setParticipantAcquirerBankSettlementAccountStatement(String participantAcquirerBankSettlementAccountStatement) {
    this.participantAcquirerBankSettlementAccountStatement = participantAcquirerBankSettlementAccountStatement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Settlement account statement for processing window - used to confirm payments 
   * @return participantIssuerBankSettlementAccountStatement
  **/

  public String getParticipantIssuerBankSettlementAccountStatement() {
    return participantIssuerBankSettlementAccountStatement;
  }

  public void setParticipantIssuerBankSettlementAccountStatement(String participantIssuerBankSettlementAccountStatement) {
    this.participantIssuerBankSettlementAccountStatement = participantIssuerBankSettlementAccountStatement;
  }


}

