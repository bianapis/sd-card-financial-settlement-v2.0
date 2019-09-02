package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord
 */
public class CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord   {
  private String networkReference = null;

  private String cardFinancialSettlementProcessType = null;

  private String cardFinancialSettlementProcessDateTime = null;

  private String cardFinancialSettlementServiceSchedule = null;

  private String participantAcquirerBankReference = null;

  private String participantIssuerBankReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the card network 
   * @return networkReference
  **/

  public String getNetworkReference() {
    return networkReference;
  }

  public void setNetworkReference(String networkReference) {
    this.networkReference = networkReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of settlement process (e.g. scheduled processing, ad-hoc processing) 
   * @return cardFinancialSettlementProcessType
  **/

  public String getCardFinancialSettlementProcessType() {
    return cardFinancialSettlementProcessType;
  }

  public void setCardFinancialSettlementProcessType(String cardFinancialSettlementProcessType) {
    this.cardFinancialSettlementProcessType = cardFinancialSettlementProcessType;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the Acquiring bank for which the Network orchestrates settlement processing 
   * @return participantAcquirerBankReference
  **/

  public String getParticipantAcquirerBankReference() {
    return participantAcquirerBankReference;
  }

  public void setParticipantAcquirerBankReference(String participantAcquirerBankReference) {
    this.participantAcquirerBankReference = participantAcquirerBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the Issuing bank for which the Network orchestrates settlement processing 
   * @return participantIssuerBankReference
  **/

  public String getParticipantIssuerBankReference() {
    return participantIssuerBankReference;
  }

  public void setParticipantIssuerBankReference(String participantIssuerBankReference) {
    this.participantIssuerBankReference = participantIssuerBankReference;
  }


}

