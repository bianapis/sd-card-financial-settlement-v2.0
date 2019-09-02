package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentUpdateInputModelPaymentInstanceRecord
 */
public class BQPaymentUpdateInputModelPaymentInstanceRecord   {
  private String participantPaymentTransaction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Transaction details 
   * @return participantPaymentTransaction
  **/

  public String getParticipantPaymentTransaction() {
    return participantPaymentTransaction;
  }

  public void setParticipantPaymentTransaction(String participantPaymentTransaction) {
    this.participantPaymentTransaction = participantPaymentTransaction;
  }


}

