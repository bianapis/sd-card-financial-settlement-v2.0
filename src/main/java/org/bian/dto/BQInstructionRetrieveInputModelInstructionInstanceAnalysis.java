package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInstructionRetrieveInputModelInstructionInstanceAnalysis
 */
public class BQInstructionRetrieveInputModelInstructionInstanceAnalysis   {
  private String instructionInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return instructionInstanceAnalysisReference
  **/

  public String getInstructionInstanceAnalysisReference() {
    return instructionInstanceAnalysisReference;
  }

  public void setInstructionInstanceAnalysisReference(String instructionInstanceAnalysisReference) {
    this.instructionInstanceAnalysisReference = instructionInstanceAnalysisReference;
  }


}

