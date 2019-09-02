package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInstructionUpdateInputModelInstructionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInstructionUpdateOutputModel
 */
public class BQInstructionUpdateOutputModel   {
  private BQInstructionUpdateInputModelInstructionInstanceRecord instructionInstanceRecord = null;

  private String instructionUpdateActionTaskReference = null;

  private Object instructionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return instructionUpdateActionTaskReference
  **/

  public String getInstructionUpdateActionTaskReference() {
    return instructionUpdateActionTaskReference;
  }

  public void setInstructionUpdateActionTaskReference(String instructionUpdateActionTaskReference) {
    this.instructionUpdateActionTaskReference = instructionUpdateActionTaskReference;
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

