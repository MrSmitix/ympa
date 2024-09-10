package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.server.api.model.ShelfsStatisticsAttributionType;

/**
 * Данные, необходимые для генерации отчета. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenerateShelfsStatisticsRequest   {
  
  private Long businessId;
  private LocalDate dateFrom;
  private LocalDate dateTo;
  private ShelfsStatisticsAttributionType attributionType;

  public GenerateShelfsStatisticsRequest () {

  }

  public GenerateShelfsStatisticsRequest (Long businessId, LocalDate dateFrom, LocalDate dateTo, ShelfsStatisticsAttributionType attributionType) {
    this.businessId = businessId;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.attributionType = attributionType;
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

    
  @JsonProperty("attributionType")
  public ShelfsStatisticsAttributionType getAttributionType() {
    return attributionType;
  }
  public void setAttributionType(ShelfsStatisticsAttributionType attributionType) {
    this.attributionType = attributionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest = (GenerateShelfsStatisticsRequest) o;
    return Objects.equals(businessId, generateShelfsStatisticsRequest.businessId) &&
        Objects.equals(dateFrom, generateShelfsStatisticsRequest.dateFrom) &&
        Objects.equals(dateTo, generateShelfsStatisticsRequest.dateTo) &&
        Objects.equals(attributionType, generateShelfsStatisticsRequest.attributionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, dateFrom, dateTo, attributionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateShelfsStatisticsRequest {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    attributionType: ").append(toIndentedString(attributionType)).append("\n");
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
