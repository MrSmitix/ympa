package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * Данные, необходимые для генерации отчета. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenerateBoostConsolidatedRequest   {
  
  private Long businessId;
  private LocalDate dateFrom;
  private LocalDate dateTo;

  public GenerateBoostConsolidatedRequest () {

  }

  public GenerateBoostConsolidatedRequest (Long businessId, LocalDate dateFrom, LocalDate dateTo) {
    this.businessId = businessId;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
  }

    
  @JsonProperty("businessId")
  public Long getBusinessId() {
    return businessId;
  }
  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

    
  @JsonProperty("dateFrom")
  public LocalDate getDateFrom() {
    return dateFrom;
  }
  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

    
  @JsonProperty("dateTo")
  public LocalDate getDateTo() {
    return dateTo;
  }
  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest = (GenerateBoostConsolidatedRequest) o;
    return Objects.equals(businessId, generateBoostConsolidatedRequest.businessId) &&
        Objects.equals(dateFrom, generateBoostConsolidatedRequest.dateFrom) &&
        Objects.equals(dateTo, generateBoostConsolidatedRequest.dateTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, dateFrom, dateTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateBoostConsolidatedRequest {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
