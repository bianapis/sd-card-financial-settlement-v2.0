package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProcessingRetrieveOutputModelProcessingInstanceReport
 */
public class BQProcessingRetrieveOutputModelProcessingInstanceReport   {
  private Object processingInstanceReportRecord = null;

  private String processingInstanceReportType = null;

  private String processingInstanceReportParameters = null;

  private Object processingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return processingInstanceReportRecord
  **/

  public Object getProcessingInstanceReportRecord() {
    return processingInstanceReportRecord;
  }

  public void setProcessingInstanceReportRecord(Object processingInstanceReportRecord) {
    this.processingInstanceReportRecord = processingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return processingInstanceReportType
  **/

  public String getProcessingInstanceReportType() {
    return processingInstanceReportType;
  }

  public void setProcessingInstanceReportType(String processingInstanceReportType) {
    this.processingInstanceReportType = processingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return processingInstanceReportParameters
  **/

  public String getProcessingInstanceReportParameters() {
    return processingInstanceReportParameters;
  }

  public void setProcessingInstanceReportParameters(String processingInstanceReportParameters) {
    this.processingInstanceReportParameters = processingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return processingInstanceReport
  **/

  public Object getProcessingInstanceReport() {
    return processingInstanceReport;
  }

  public void setProcessingInstanceReport(Object processingInstanceReport) {
    this.processingInstanceReport = processingInstanceReport;
  }


}

