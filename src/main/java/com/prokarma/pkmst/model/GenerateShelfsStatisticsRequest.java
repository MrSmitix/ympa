package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ShelfsStatisticsAttributionType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Данные, необходимые для генерации отчета. 
 */
@ApiModel(description = "Данные, необходимые для генерации отчета. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateShelfsStatisticsRequest   {
  @JsonProperty("businessId")
  private Long businessId;

  @JsonProperty("dateFrom")
  private LocalDate dateFrom;

  @JsonProperty("dateTo")
  private LocalDate dateTo;

  @JsonProperty("attributionType")
  private ShelfsStatisticsAttributionType attributionType;

  public GenerateShelfsStatisticsRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  /**
   * Идентификатор бизнеса.
   * @return businessId
   */
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateShelfsStatisticsRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Начало периода, включительно.
   * @return dateFrom
   */
  @ApiModelProperty(required = true, value = "Начало периода, включительно.")
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GenerateShelfsStatisticsRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Конец периода, включительно.
   * @return dateTo
   */
  @ApiModelProperty(required = true, value = "Конец периода, включительно.")
  public LocalDate getDateTo() {
    return dateTo;
  }

  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  public GenerateShelfsStatisticsRequest attributionType(ShelfsStatisticsAttributionType attributionType) {
    this.attributionType = attributionType;
    return this;
  }

  /**
   * Get attributionType
   * @return attributionType
   */
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.businessId, generateShelfsStatisticsRequest.businessId) &&
        Objects.equals(this.dateFrom, generateShelfsStatisticsRequest.dateFrom) &&
        Objects.equals(this.dateTo, generateShelfsStatisticsRequest.dateTo) &&
        Objects.equals(this.attributionType, generateShelfsStatisticsRequest.attributionType);
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
