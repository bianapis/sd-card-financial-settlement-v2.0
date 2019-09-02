package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInstructionRetrieveInputModelInstructionInstanceAnalysis;
import org.bian.dto.BQInstructionRetrieveInputModelInstructionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInstructionRetrieveInputModel
 */
public class BQInstructionRetrieveInputModel   {
  private Object instructionRetrieveActionTaskRecord = null;

  private String instructionRetrieveActionRequest = null;

  private BQInstructionRetrieveInputModelInstructionInstanceReport instructionInstanceReport = null;

  private BQInstructionRetrieveInputModelInstructionInstanceAnalysis instructionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return instructionRetrieveActionTaskRecord
  **/

  public Object getInstructionRetrieveActionTaskRecord() {
    return instructionRetrieveActionTaskRecord;
  }

  public void setInstructionRetrieveActionTaskRecord(Object instructionRetrieveActionTaskRecord) {
    this.instructionRetrieveActionTaskRecord = instructionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return instructionRetrieveActionRequest
  **/

  public String getInstructionRetrieveActionRequest() {
    return instructionRetrieveActionRequest;
  }

  public void setInstructionRetrieveActionRequest(String instructionRetrieveActionRequest) {
    this.instructionRetrieveActionRequest = instructionRetrieveActionRequest;
  }


  /**
   * Get instructionInstanceReport
   * @return instructionInstanceReport
  **/

  public BQInstructionRetrieveInputModelInstructionInstanceReport getInstructionInstanceReport() {
    return instructionInstanceReport;
  }

  public void setInstructionInstanceReport(BQInstructionRetrieveInputModelInstructionInstanceReport instructionInstanceReport) {
    this.instructionInstanceReport = instructionInstanceReport;
  }


  /**
   * Get instructionInstanceAnalysis
   * @return instructionInstanceAnalysis
  **/

  public BQInstructionRetrieveInputModelInstructionInstanceAnalysis getInstructionInstanceAnalysis() {
    return instructionInstanceAnalysis;
  }

  public void setInstructionInstanceAnalysis(BQInstructionRetrieveInputModelInstructionInstanceAnalysis instructionInstanceAnalysis) {
    this.instructionInstanceAnalysis = instructionInstanceAnalysis;
  }


}

