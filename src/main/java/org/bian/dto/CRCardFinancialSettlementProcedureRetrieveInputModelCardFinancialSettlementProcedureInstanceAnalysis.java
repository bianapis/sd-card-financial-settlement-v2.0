package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardFinancialSettlementProcedureRetrieveInputModelCardFinancialSettlementProcedureInstanceAnalysis
 */
public class CRCardFinancialSettlementProcedureRetrieveInputModelCardFinancialSettlementProcedureInstanceAnalysis   {
  private String cardFinancialSettlementProcedureInstanceAnalysisReference = null;

  private String cardFinancialSettlementProcedureInstanceAnalysisReportType = null;

  private String cardFinancialSettlementProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return cardFinancialSettlementProcedureInstanceAnalysisReference
  **/

  public String getCardFinancialSettlementProcedureInstanceAnalysisReference() {
    return cardFinancialSettlementProcedureInstanceAnalysisReference;
  }

  public void setCardFinancialSettlementProcedureInstanceAnalysisReference(String cardFinancialSettlementProcedureInstanceAnalysisReference) {
    this.cardFinancialSettlementProcedureInstanceAnalysisReference = cardFinancialSettlementProcedureInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cardFinancialSettlementProcedureInstanceAnalysisParameters
  **/

  public String getCardFinancialSettlementProcedureInstanceAnalysisParameters() {
    return cardFinancialSettlementProcedureInstanceAnalysisParameters;
  }

  public void setCardFinancialSettlementProcedureInstanceAnalysisParameters(String cardFinancialSettlementProcedureInstanceAnalysisParameters) {
    this.cardFinancialSettlementProcedureInstanceAnalysisParameters = cardFinancialSettlementProcedureInstanceAnalysisParameters;
  }


}

