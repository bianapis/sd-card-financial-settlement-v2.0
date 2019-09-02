package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProcessingRetrieveOutputModelProcessingInstanceAnalysis
 */
public class BQProcessingRetrieveOutputModelProcessingInstanceAnalysis   {
  private Object processingInstanceAnalysisRecord = null;

  private String processingInstanceAnalysisReportType = null;

  private String processingInstanceAnalysisParameters = null;

  private Object processingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return processingInstanceAnalysisRecord
  **/

  public Object getProcessingInstanceAnalysisRecord() {
    return processingInstanceAnalysisRecord;
  }

  public void setProcessingInstanceAnalysisRecord(Object processingInstanceAnalysisRecord) {
    this.processingInstanceAnalysisRecord = processingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return processingInstanceAnalysisReportType
  **/

  public String getProcessingInstanceAnalysisReportType() {
    return processingInstanceAnalysisReportType;
  }

  public void setProcessingInstanceAnalysisReportType(String processingInstanceAnalysisReportType) {
    this.processingInstanceAnalysisReportType = processingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return processingInstanceAnalysisParameters
  **/

  public String getProcessingInstanceAnalysisParameters() {
    return processingInstanceAnalysisParameters;
  }

  public void setProcessingInstanceAnalysisParameters(String processingInstanceAnalysisParameters) {
    this.processingInstanceAnalysisParameters = processingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return processingInstanceAnalysisReport
  **/

  public Object getProcessingInstanceAnalysisReport() {
    return processingInstanceAnalysisReport;
  }

  public void setProcessingInstanceAnalysisReport(Object processingInstanceAnalysisReport) {
    this.processingInstanceAnalysisReport = processingInstanceAnalysisReport;
  }


}

