package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardFinancialSettlementProcedureRetrieveInputModelCardFinancialSettlementProcedureInstanceAnalysis;
import org.bian.dto.CRCardFinancialSettlementProcedureRetrieveInputModelCardFinancialSettlementProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCardFinancialSettlementProcedureRetrieveInputModel
 */
public class CRCardFinancialSettlementProcedureRetrieveInputModel   {
  private Object cardFinancialSettlementProcedureRetrieveActionTaskRecord = null;

  private String cardFinancialSettlementProcedureRetrieveActionRequest = null;

  private CRCardFinancialSettlementProcedureRetrieveInputModelCardFinancialSettlementProcedureInstanceReportRecord cardFinancialSettlementProcedureInstanceReportRecord = null;

  private CRCardFinancialSettlementProcedureRetrieveInputModelCardFinancialSettlementProcedureInstanceAnalysis cardFinancialSettlementProcedureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cardFinancialSettlementProcedureRetrieveActionRequest
  **/

  public String getCardFinancialSettlementProcedureRetrieveActionRequest() {
    return cardFinancialSettlementProcedureRetrieveActionRequest;
  }

  public void setCardFinancialSettlementProcedureRetrieveActionRequest(String cardFinancialSettlementProcedureRetrieveActionRequest) {
    this.cardFinancialSettlementProcedureRetrieveActionRequest = cardFinancialSettlementProcedureRetrieveActionRequest;
  }


  /**
   * Get cardFinancialSettlementProcedureInstanceReportRecord
   * @return cardFinancialSettlementProcedureInstanceReportRecord
  **/

  public CRCardFinancialSettlementProcedureRetrieveInputModelCardFinancialSettlementProcedureInstanceReportRecord getCardFinancialSettlementProcedureInstanceReportRecord() {
    return cardFinancialSettlementProcedureInstanceReportRecord;
  }

  public void setCardFinancialSettlementProcedureInstanceReportRecord(CRCardFinancialSettlementProcedureRetrieveInputModelCardFinancialSettlementProcedureInstanceReportRecord cardFinancialSettlementProcedureInstanceReportRecord) {
    this.cardFinancialSettlementProcedureInstanceReportRecord = cardFinancialSettlementProcedureInstanceReportRecord;
  }


  /**
   * Get cardFinancialSettlementProcedureInstanceAnalysis
   * @return cardFinancialSettlementProcedureInstanceAnalysis
  **/

  public CRCardFinancialSettlementProcedureRetrieveInputModelCardFinancialSettlementProcedureInstanceAnalysis getCardFinancialSettlementProcedureInstanceAnalysis() {
    return cardFinancialSettlementProcedureInstanceAnalysis;
  }

  public void setCardFinancialSettlementProcedureInstanceAnalysis(CRCardFinancialSettlementProcedureRetrieveInputModelCardFinancialSettlementProcedureInstanceAnalysis cardFinancialSettlementProcedureInstanceAnalysis) {
    this.cardFinancialSettlementProcedureInstanceAnalysis = cardFinancialSettlementProcedureInstanceAnalysis;
  }


}

