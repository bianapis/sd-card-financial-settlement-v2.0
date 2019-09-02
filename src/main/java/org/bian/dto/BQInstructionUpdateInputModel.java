package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInstructionUpdateInputModelInstructionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInstructionUpdateInputModel
 */
public class BQInstructionUpdateInputModel   {
  private String cardFinancialSettlementProcedureInstanceReference = null;

  private String instructionInstanceReference = null;

  private BQInstructionUpdateInputModelInstructionInstanceRecord instructionInstanceRecord = null;

  private Object instructionUpdateActionTaskRecord = null;

  private String instructionUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Card Financial Settlement Procedure instance 
   * @return cardFinancialSettlementProcedureInstanceReference
  **/

  public String getCardFinancialSettlementProcedureInstanceReference() {
    return cardFinancialSettlementProcedureInstanceReference;
  }

  public void setCardFinancialSettlementProcedureInstanceReference(String cardFinancialSettlementProcedureInstanceReference) {
    this.cardFinancialSettlementProcedureInstanceReference = cardFinancialSettlementProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Instruction instance 
   * @return instructionInstanceReference
  **/

  public String getInstructionInstanceReference() {
    return instructionInstanceReference;
  }

  public void setInstructionInstanceReference(String instructionInstanceReference) {
    this.instructionInstanceReference = instructionInstanceReference;
  }


  /**
   * Get instructionInstanceRecord
   * @return instructionInstanceRecord
  **/

  public BQInstructionUpdateInputModelInstructionInstanceRecord getInstructionInstanceRecord() {
    return instructionInstanceRecord;
  }

  public void setInstructionInstanceRecord(BQInstructionUpdateInputModelInstructionInstanceRecord instructionInstanceRecord) {
    this.instructionInstanceRecord = instructionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return instructionUpdateActionTaskRecord
  **/

  public Object getInstructionUpdateActionTaskRecord() {
    return instructionUpdateActionTaskRecord;
  }

  public void setInstructionUpdateActionTaskRecord(Object instructionUpdateActionTaskRecord) {
    this.instructionUpdateActionTaskRecord = instructionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return instructionUpdateActionRequest
  **/

  public String getInstructionUpdateActionRequest() {
    return instructionUpdateActionRequest;
  }

  public void setInstructionUpdateActionRequest(String instructionUpdateActionRequest) {
    this.instructionUpdateActionRequest = instructionUpdateActionRequest;
  }


}

