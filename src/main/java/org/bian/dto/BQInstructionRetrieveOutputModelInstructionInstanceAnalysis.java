package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInstructionRetrieveOutputModelInstructionInstanceAnalysis
 */
public class BQInstructionRetrieveOutputModelInstructionInstanceAnalysis   {
  private Object instructionInstanceAnalysisRecord = null;

  private String instructionInstanceAnalysisReportType = null;

  private String instructionInstanceAnalysisParameters = null;

  private Object instructionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return instructionInstanceAnalysisRecord
  **/

  public Object getInstructionInstanceAnalysisRecord() {
    return instructionInstanceAnalysisRecord;
  }

  public void setInstructionInstanceAnalysisRecord(Object instructionInstanceAnalysisRecord) {
    this.instructionInstanceAnalysisRecord = instructionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return instructionInstanceAnalysisReportType
  **/

  public String getInstructionInstanceAnalysisReportType() {
    return instructionInstanceAnalysisReportType;
  }

  public void setInstructionInstanceAnalysisReportType(String instructionInstanceAnalysisReportType) {
    this.instructionInstanceAnalysisReportType = instructionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return instructionInstanceAnalysisParameters
  **/

  public String getInstructionInstanceAnalysisParameters() {
    return instructionInstanceAnalysisParameters;
  }

  public void setInstructionInstanceAnalysisParameters(String instructionInstanceAnalysisParameters) {
    this.instructionInstanceAnalysisParameters = instructionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return instructionInstanceAnalysisReport
  **/

  public Object getInstructionInstanceAnalysisReport() {
    return instructionInstanceAnalysisReport;
  }

  public void setInstructionInstanceAnalysisReport(Object instructionInstanceAnalysisReport) {
    this.instructionInstanceAnalysisReport = instructionInstanceAnalysisReport;
  }


}

