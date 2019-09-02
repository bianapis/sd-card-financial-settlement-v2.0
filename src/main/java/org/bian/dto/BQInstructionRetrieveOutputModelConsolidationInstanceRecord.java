package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInstructionRetrieveOutputModelConsolidationInstanceRecordCardTransactionRecord;

import javax.validation.Valid;
  
/**
 * BQInstructionRetrieveOutputModelConsolidationInstanceRecord
 */
public class BQInstructionRetrieveOutputModelConsolidationInstanceRecord   {
  private String cardTransactionRecordReference = null;

  private BQInstructionRetrieveOutputModelConsolidationInstanceRecordCardTransactionRecord cardTransactionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the card transaction as recorded by issuer and/or acquirer - these are consolidated for the settlement period/window  
   * @return cardTransactionRecordReference
  **/

  public String getCardTransactionRecordReference() {
    return cardTransactionRecordReference;
  }

  public void setCardTransactionRecordReference(String cardTransactionRecordReference) {
    this.cardTransactionRecordReference = cardTransactionRecordReference;
  }


  /**
   * Get cardTransactionRecord
   * @return cardTransactionRecord
  **/

  public BQInstructionRetrieveOutputModelConsolidationInstanceRecordCardTransactionRecord getCardTransactionRecord() {
    return cardTransactionRecord;
  }

  public void setCardTransactionRecord(BQInstructionRetrieveOutputModelConsolidationInstanceRecordCardTransactionRecord cardTransactionRecord) {
    this.cardTransactionRecord = cardTransactionRecord;
  }


}

