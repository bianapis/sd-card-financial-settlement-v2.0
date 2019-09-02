package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInstructionRetrieveOutputModelInstructionInstanceReport
 */
public class BQInstructionRetrieveOutputModelInstructionInstanceReport   {
  private Object instructionInstanceReportRecord = null;

  private String instructionInstanceReportType = null;

  private String instructionInstanceReportParameters = null;

  private Object instructionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return instructionInstanceReportRecord
  **/

  public Object getInstructionInstanceReportRecord() {
    return instructionInstanceReportRecord;
  }

  public void setInstructionInstanceReportRecord(Object instructionInstanceReportRecord) {
    this.instructionInstanceReportRecord = instructionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return instructionInstanceReportType
  **/

  public String getInstructionInstanceReportType() {
    return instructionInstanceReportType;
  }

  public void setInstructionInstanceReportType(String instructionInstanceReportType) {
    this.instructionInstanceReportType = instructionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return instructionInstanceReportParameters
  **/

  public String getInstructionInstanceReportParameters() {
    return instructionInstanceReportParameters;
  }

  public void setInstructionInstanceReportParameters(String instructionInstanceReportParameters) {
    this.instructionInstanceReportParameters = instructionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return instructionInstanceReport
  **/

  public Object getInstructionInstanceReport() {
    return instructionInstanceReport;
  }

  public void setInstructionInstanceReport(Object instructionInstanceReport) {
    this.instructionInstanceReport = instructionInstanceReport;
  }


}

