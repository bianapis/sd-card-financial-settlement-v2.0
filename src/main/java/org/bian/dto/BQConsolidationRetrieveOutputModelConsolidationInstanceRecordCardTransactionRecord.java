package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQConsolidationRetrieveOutputModelConsolidationInstanceRecordCardTransactionRecord
 */
public class BQConsolidationRetrieveOutputModelConsolidationInstanceRecordCardTransactionRecord   {
  private String cardTransactionProductInstanceReference = null;

  private String cardTransactionIssuingBankReference = null;

  private String cardTransactionMerchantAcquiringBankReference = null;

  private String cardTransactionType = null;

  private String cardTransactionCurrency = null;

  private String cardTransactionAmountType = null;

  private String cardTransactionAmount = null;

  private String cardTransactionMerchantReference = null;

  private String cardTransactionLocationReference = null;

  private String cardTransactionProductServiceReference = null;

  private String cardTransactionDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The account number associated with the card transaction 
   * @return cardTransactionProductInstanceReference
  **/

  public String getCardTransactionProductInstanceReference() {
    return cardTransactionProductInstanceReference;
  }

  public void setCardTransactionProductInstanceReference(String cardTransactionProductInstanceReference) {
    this.cardTransactionProductInstanceReference = cardTransactionProductInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the card holder's issuing bank 
   * @return cardTransactionIssuingBankReference
  **/

  public String getCardTransactionIssuingBankReference() {
    return cardTransactionIssuingBankReference;
  }

  public void setCardTransactionIssuingBankReference(String cardTransactionIssuingBankReference) {
    this.cardTransactionIssuingBankReference = cardTransactionIssuingBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the merchant's acquiring bank 
   * @return cardTransactionMerchantAcquiringBankReference
  **/

  public String getCardTransactionMerchantAcquiringBankReference() {
    return cardTransactionMerchantAcquiringBankReference;
  }

  public void setCardTransactionMerchantAcquiringBankReference(String cardTransactionMerchantAcquiringBankReference) {
    this.cardTransactionMerchantAcquiringBankReference = cardTransactionMerchantAcquiringBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of transaction (purchase, cash advance, etc.) 
   * @return cardTransactionType
  **/

  public String getCardTransactionType() {
    return cardTransactionType;
  }

  public void setCardTransactionType(String cardTransactionType) {
    this.cardTransactionType = cardTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The currency that the transaction is made in 
   * @return cardTransactionCurrency
  **/

  public String getCardTransactionCurrency() {
    return cardTransactionCurrency;
  }

  public void setCardTransactionCurrency(String cardTransactionCurrency) {
    this.cardTransactionCurrency = cardTransactionCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Type of amount (e.g. original amount, billing currency amount, conversion rate, FX Mark-up) 
   * @return cardTransactionAmountType
  **/

  public String getCardTransactionAmountType() {
    return cardTransactionAmountType;
  }

  public void setCardTransactionAmountType(String cardTransactionAmountType) {
    this.cardTransactionAmountType = cardTransactionAmountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount corresponding to the type 
   * @return cardTransactionAmount
  **/

  public String getCardTransactionAmount() {
    return cardTransactionAmount;
  }

  public void setCardTransactionAmount(String cardTransactionAmount) {
    this.cardTransactionAmount = cardTransactionAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the merchant initiating settlement 
   * @return cardTransactionMerchantReference
  **/

  public String getCardTransactionMerchantReference() {
    return cardTransactionMerchantReference;
  }

  public void setCardTransactionMerchantReference(String cardTransactionMerchantReference) {
    this.cardTransactionMerchantReference = cardTransactionMerchantReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the point of sale location 
   * @return cardTransactionLocationReference
  **/

  public String getCardTransactionLocationReference() {
    return cardTransactionLocationReference;
  }

  public void setCardTransactionLocationReference(String cardTransactionLocationReference) {
    this.cardTransactionLocationReference = cardTransactionLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Details of the transaction (e.g. purchased service/product, purpose) 
   * @return cardTransactionProductServiceReference
  **/

  public String getCardTransactionProductServiceReference() {
    return cardTransactionProductServiceReference;
  }

  public void setCardTransactionProductServiceReference(String cardTransactionProductServiceReference) {
    this.cardTransactionProductServiceReference = cardTransactionProductServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Significant dates and times associated with the transaction 
   * @return cardTransactionDateTime
  **/

  public String getCardTransactionDateTime() {
    return cardTransactionDateTime;
  }

  public void setCardTransactionDateTime(String cardTransactionDateTime) {
    this.cardTransactionDateTime = cardTransactionDateTime;
  }


}

