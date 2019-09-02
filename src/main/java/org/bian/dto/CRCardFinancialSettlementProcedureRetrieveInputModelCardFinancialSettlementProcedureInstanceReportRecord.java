package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardFinancialSettlementProcedureRetrieveInputModelCardFinancialSettlementProcedureInstanceReportRecord
 */
public class CRCardFinancialSettlementProcedureRetrieveInputModelCardFinancialSettlementProcedureInstanceReportRecord   {
  private String cardFinancialSettlementProcedureInstanceReportReference = null;

  private String cardFinancialSettlementProcedureInstanceReportType = null;

  private String cardFinancialSettlementProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return cardFinancialSettlementProcedureInstanceReportReference
  **/

  public String getCardFinancialSettlementProcedureInstanceReportReference() {
    return cardFinancialSettlementProcedureInstanceReportReference;
  }

  public void setCardFinancialSettlementProcedureInstanceReportReference(String cardFinancialSettlementProcedureInstanceReportReference) {
    this.cardFinancialSettlementProcedureInstanceReportReference = cardFinancialSettlementProcedureInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cardFinancialSettlementProcedureInstanceReportParameters
  **/

  public String getCardFinancialSettlementProcedureInstanceReportParameters() {
    return cardFinancialSettlementProcedureInstanceReportParameters;
  }

  public void setCardFinancialSettlementProcedureInstanceReportParameters(String cardFinancialSettlementProcedureInstanceReportParameters) {
    this.cardFinancialSettlementProcedureInstanceReportParameters = cardFinancialSettlementProcedureInstanceReportParameters;
  }


}

