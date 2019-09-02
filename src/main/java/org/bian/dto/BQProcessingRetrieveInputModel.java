package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProcessingRetrieveInputModelProcessingInstanceAnalysis;
import org.bian.dto.BQProcessingRetrieveInputModelProcessingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProcessingRetrieveInputModel
 */
public class BQProcessingRetrieveInputModel   {
  private Object processingRetrieveActionTaskRecord = null;

  private String processingRetrieveActionRequest = null;

  private BQProcessingRetrieveInputModelProcessingInstanceReport processingInstanceReport = null;

  private BQProcessingRetrieveInputModelProcessingInstanceAnalysis processingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return processingRetrieveActionTaskRecord
  **/

  public Object getProcessingRetrieveActionTaskRecord() {
    return processingRetrieveActionTaskRecord;
  }

  public void setProcessingRetrieveActionTaskRecord(Object processingRetrieveActionTaskRecord) {
    this.processingRetrieveActionTaskRecord = processingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return processingRetrieveActionRequest
  **/

  public String getProcessingRetrieveActionRequest() {
    return processingRetrieveActionRequest;
  }

  public void setProcessingRetrieveActionRequest(String processingRetrieveActionRequest) {
    this.processingRetrieveActionRequest = processingRetrieveActionRequest;
  }


  /**
   * Get processingInstanceReport
   * @return processingInstanceReport
  **/

  public BQProcessingRetrieveInputModelProcessingInstanceReport getProcessingInstanceReport() {
    return processingInstanceReport;
  }

  public void setProcessingInstanceReport(BQProcessingRetrieveInputModelProcessingInstanceReport processingInstanceReport) {
    this.processingInstanceReport = processingInstanceReport;
  }


  /**
   * Get processingInstanceAnalysis
   * @return processingInstanceAnalysis
  **/

  public BQProcessingRetrieveInputModelProcessingInstanceAnalysis getProcessingInstanceAnalysis() {
    return processingInstanceAnalysis;
  }

  public void setProcessingInstanceAnalysis(BQProcessingRetrieveInputModelProcessingInstanceAnalysis processingInstanceAnalysis) {
    this.processingInstanceAnalysis = processingInstanceAnalysis;
  }


}

