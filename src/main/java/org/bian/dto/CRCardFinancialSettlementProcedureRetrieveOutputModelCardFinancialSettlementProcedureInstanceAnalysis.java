package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceAnalysis
 */
public class CRCardFinancialSettlementProcedureRetrieveOutputModelCardFinancialSettlementProcedureInstanceAnalysis   {
  private String cardFinancialSettlementProcedureInstanceAnalysisData = null;

  private String cardFinancialSettlementProcedureInstanceAnalysisReportType = null;

  private Object cardFinancialSettlementProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cardFinancialSettlementProcedureInstanceAnalysisData
  **/

  public String getCardFinancialSettlementProcedureInstanceAnalysisData() {
    return cardFinancialSettlementProcedureInstanceAnalysisData;
  }

  public void setCardFinancialSettlementProcedureInstanceAnalysisData(String cardFinancialSettlementProcedureInstanceAnalysisData) {
    this.cardFinancialSettlementProcedureInstanceAnalysisData = cardFinancialSettlementProcedureInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cardFinancialSettlementProcedureInstanceAnalysisReportType
  **/

  public String getCardFinancialSettlementProcedureInstanceAnalysisReportType() {
    return cardFinancialSettlementProcedureInstanceAnalysisReportType;
  }

  public void setCardFinancialSettlementProcedureInstanceAnalysisReportType(String cardFinancialSettlementProcedureInstanceAnalysisReportType) {
    this.cardFinancialSettlementProcedureInstanceAnalysisReportType = cardFinancialSettlementProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return cardFinancialSettlementProcedureInstanceAnalysisReport
  **/

  public Object getCardFinancialSettlementProcedureInstanceAnalysisReport() {
    return cardFinancialSettlementProcedureInstanceAnalysisReport;
  }

  public void setCardFinancialSettlementProcedureInstanceAnalysisReport(Object cardFinancialSettlementProcedureInstanceAnalysisReport) {
    this.cardFinancialSettlementProcedureInstanceAnalysisReport = cardFinancialSettlementProcedureInstanceAnalysisReport;
  }


}

