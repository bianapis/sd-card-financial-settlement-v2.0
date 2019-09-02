package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProcessingRetrieveInputModelProcessingInstanceReport
 */
public class BQProcessingRetrieveInputModelProcessingInstanceReport   {
  private String processingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return processingInstanceReportReference
  **/

  public String getProcessingInstanceReportReference() {
    return processingInstanceReportReference;
  }

  public void setProcessingInstanceReportReference(String processingInstanceReportReference) {
    this.processingInstanceReportReference = processingInstanceReportReference;
  }


}

