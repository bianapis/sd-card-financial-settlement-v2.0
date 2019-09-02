package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInstructionRetrieveInputModelInstructionInstanceReport
 */
public class BQInstructionRetrieveInputModelInstructionInstanceReport   {
  private String instructionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return instructionInstanceReportReference
  **/

  public String getInstructionInstanceReportReference() {
    return instructionInstanceReportReference;
  }

  public void setInstructionInstanceReportReference(String instructionInstanceReportReference) {
    this.instructionInstanceReportReference = instructionInstanceReportReference;
  }


}

