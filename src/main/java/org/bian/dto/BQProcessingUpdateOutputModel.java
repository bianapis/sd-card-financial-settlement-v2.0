package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProcessingUpdateInputModelProcessingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProcessingUpdateOutputModel
 */
public class BQProcessingUpdateOutputModel   {
  private BQProcessingUpdateInputModelProcessingInstanceRecord processingInstanceRecord = null;

  private String processingUpdateActionTaskReference = null;

  private Object processingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get processingInstanceRecord
   * @return processingInstanceRecord
  **/

  public BQProcessingUpdateInputModelProcessingInstanceRecord getProcessingInstanceRecord() {
    return processingInstanceRecord;
  }

  public void setProcessingInstanceRecord(BQProcessingUpdateInputModelProcessingInstanceRecord processingInstanceRecord) {
    this.processingInstanceRecord = processingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return processingUpdateActionTaskReference
  **/

  public String getProcessingUpdateActionTaskReference() {
    return processingUpdateActionTaskReference;
  }

  public void setProcessingUpdateActionTaskReference(String processingUpdateActionTaskReference) {
    this.processingUpdateActionTaskReference = processingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return processingUpdateActionTaskRecord
  **/

  public Object getProcessingUpdateActionTaskRecord() {
    return processingUpdateActionTaskRecord;
  }

  public void setProcessingUpdateActionTaskRecord(Object processingUpdateActionTaskRecord) {
    this.processingUpdateActionTaskRecord = processingUpdateActionTaskRecord;
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

