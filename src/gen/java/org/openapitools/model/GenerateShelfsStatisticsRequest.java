package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.joda.time.LocalDate;
import org.openapitools.model.ShelfsStatisticsAttributionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Данные, необходимые для генерации отчета. 
 **/
@ApiModel(description="Данные, необходимые для генерации отчета. ")

public class GenerateShelfsStatisticsRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
 /**
   * Идентификатор бизнеса.
  **/
  private Long businessId;

  @ApiModelProperty(required = true, value = "Начало периода, включительно.")
 /**
   * Начало периода, включительно.
  **/
  private LocalDate dateFrom;

  @ApiModelProperty(required = true, value = "Конец периода, включительно.")
 /**
   * Конец периода, включительно.
  **/
  private LocalDate dateTo;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ShelfsStatisticsAttributionType attributionType;
 /**
   * Идентификатор бизнеса.
   * @return businessId
  **/
  @JsonProperty("businessId")
  @NotNull
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateShelfsStatisticsRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

 /**
   * Начало периода, включительно.
   * @return dateFrom
  **/
  @JsonProperty("dateFrom")
  @NotNull
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GenerateShelfsStatisticsRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

 /**
   * Конец периода, включительно.
   * @return dateTo
  **/
  @JsonProperty("dateTo")
  @NotNull
  public LocalDate getDateTo() {
    return dateTo;
  }

  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  public GenerateShelfsStatisticsRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

 /**
   * Get attributionType
   * @return attributionType
  **/
  @JsonProperty("attributionType")
  @NotNull
  public ShelfsStatisticsAttributionType getAttributionType() {
    return attributionType;
  }

  public void setAttributionType(ShelfsStatisticsAttributionType attributionType) {
    this.attributionType = attributionType;
  }

  public GenerateShelfsStatisticsRequest attributionType(ShelfsStatisticsAttributionType attributionType) {
    this.attributionType = attributionType;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

