package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceAnalysis;
import org.bian.dto.CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord;
import org.bian.dto.CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCardFinancialSettlementProcedureRetrieveOutputModel
 */
public class CRCardFinancialSettlementProcedureRetrieveOutputModel   {
  private CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord cardFinancialSettlementProcedureInstanceRecord = null;

  private String cardFinancialSettlementProcedureRetrieveActionTaskReference = null;

  private Object cardFinancialSettlementProcedureRetrieveActionTaskRecord = null;

  private String cardFinancialSettlementProcedureRetrieveActionResponse = null;

  private CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceReportRecord cardFinancialSettlementProcedureInstanceReportRecord = null;

  private CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceAnalysis cardFinancialSettlementProcedureInstanceAnalysis = null;


  /**
   * Get cardFinancialSettlementProcedureInstanceRecord
   * @return cardFinancialSettlementProcedureInstanceRecord
  **/

  public CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord getCardFinancialSettlementProcedureInstanceRecord() {
    return cardFinancialSettlementProcedureInstanceRecord;
  }

  public void setCardFinancialSettlementProcedureInstanceRecord(CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceRecord cardFinancialSettlementProcedureInstanceRecord) {
    this.cardFinancialSettlementProcedureInstanceRecord = cardFinancialSettlementProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Financial Settlement Procedure instance retrieve service call 
   * @return cardFinancialSettlementProcedureRetrieveActionTaskReference
  **/

  public String getCardFinancialSettlementProcedureRetrieveActionTaskReference() {
    return cardFinancialSettlementProcedureRetrieveActionTaskReference;
  }

  public void setCardFinancialSettlementProcedureRetrieveActionTaskReference(String cardFinancialSettlementProcedureRetrieveActionTaskReference) {
    this.cardFinancialSettlementProcedureRetrieveActionTaskReference = cardFinancialSettlementProcedureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cardFinancialSettlementProcedureRetrieveActionTaskRecord
  **/

  public Object getCardFinancialSettlementProcedureRetrieveActionTaskRecord() {
    return cardFinancialSettlementProcedureRetrieveActionTaskRecord;
  }

  public void setCardFinancialSettlementProcedureRetrieveActionTaskRecord(Object cardFinancialSettlementProcedureRetrieveActionTaskRecord) {
    this.cardFinancialSettlementProcedureRetrieveActionTaskRecord = cardFinancialSettlementProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return cardFinancialSettlementProcedureRetrieveActionResponse
  **/

  public String getCardFinancialSettlementProcedureRetrieveActionResponse() {
    return cardFinancialSettlementProcedureRetrieveActionResponse;
  }

  public void setCardFinancialSettlementProcedureRetrieveActionResponse(String cardFinancialSettlementProcedureRetrieveActionResponse) {
    this.cardFinancialSettlementProcedureRetrieveActionResponse = cardFinancialSettlementProcedureRetrieveActionResponse;
  }


  /**
   * Get cardFinancialSettlementProcedureInstanceReportRecord
   * @return cardFinancialSettlementProcedureInstanceReportRecord
  **/

  public CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceReportRecord getCardFinancialSettlementProcedureInstanceReportRecord() {
    return cardFinancialSettlementProcedureInstanceReportRecord;
  }

  public void setCardFinancialSettlementProcedureInstanceReportRecord(CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceReportRecord cardFinancialSettlementProcedureInstanceReportRecord) {
    this.cardFinancialSettlementProcedureInstanceReportRecord = cardFinancialSettlementProcedureInstanceReportRecord;
  }


  /**
   * Get cardFinancialSettlementProcedureInstanceAnalysis
   * @return cardFinancialSettlementProcedureInstanceAnalysis
  **/

  public CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceAnalysis getCardFinancialSettlementProcedureInstanceAnalysis() {
    return cardFinancialSettlementProcedureInstanceAnalysis;
  }

  public void setCardFinancialSettlementProcedureInstanceAnalysis(CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceAnalysis cardFinancialSettlementProcedureInstanceAnalysis) {
    this.cardFinancialSettlementProcedureInstanceAnalysis = cardFinancialSettlementProcedureInstanceAnalysis;
  }


}

