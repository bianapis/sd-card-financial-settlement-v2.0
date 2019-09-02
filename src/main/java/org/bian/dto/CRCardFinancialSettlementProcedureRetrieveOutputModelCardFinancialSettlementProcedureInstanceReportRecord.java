package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceReportRecord
 */
public class CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceReportRecord   {
  private String cardFinancialSettlementProcedureInstanceReportData = null;

  private String cardFinancialSettlementProcedureInstanceReportType = null;

  private Object cardFinancialSettlementProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cardFinancialSettlementProcedureInstanceReportData
  **/

  public String getCardFinancialSettlementProcedureInstanceReportData() {
    return cardFinancialSettlementProcedureInstanceReportData;
  }

  public void setCardFinancialSettlementProcedureInstanceReportData(String cardFinancialSettlementProcedureInstanceReportData) {
    this.cardFinancialSettlementProcedureInstanceReportData = cardFinancialSettlementProcedureInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cardFinancialSettlementProcedureInstanceReportType
  **/

  public String getCardFinancialSettlementProcedureInstanceReportType() {
    return cardFinancialSettlementProcedureInstanceReportType;
  }

  public void setCardFinancialSettlementProcedureInstanceReportType(String cardFinancialSettlementProcedureInstanceReportType) {
    this.cardFinancialSettlementProcedureInstanceReportType = cardFinancialSettlementProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cardFinancialSettlementProcedureInstanceReport
  **/

  public Object getCardFinancialSettlementProcedureInstanceReport() {
    return cardFinancialSettlementProcedureInstanceReport;
  }

  public void setCardFinancialSettlementProcedureInstanceReport(Object cardFinancialSettlementProcedureInstanceReport) {
    this.cardFinancialSettlementProcedureInstanceReport = cardFinancialSettlementProcedureInstanceReport;
  }


}

