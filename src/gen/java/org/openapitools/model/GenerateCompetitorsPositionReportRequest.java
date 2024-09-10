package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Данные, необходимые для генерации отчета.
 **/
@ApiModel(description="Данные, необходимые для генерации отчета.")

public class GenerateCompetitorsPositionReportRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
 /**
   * Идентификатор бизнеса.
  **/
  private Long businessId;

  @ApiModelProperty(required = true, value = "Идентификатор категории.")
 /**
   * Идентификатор категории.
  **/
  private Long categoryId;

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

  public GenerateCompetitorsPositionReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

 /**
   * Идентификатор категории.
   * @return categoryId
  **/
  @JsonProperty("categoryId")
  @NotNull
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public GenerateCompetitorsPositionReportRequest categoryId(Long categoryId) {
    this.categoryId = categoryId;
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

  public GenerateCompetitorsPositionReportRequest dateFrom(LocalDate dateFrom) {
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

  public GenerateCompetitorsPositionReportRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
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
    GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest = (GenerateCompetitorsPositionReportRequest) o;
    return Objects.equals(this.businessId, generateCompetitorsPositionReportRequest.businessId) &&
        Objects.equals(this.categoryId, generateCompetitorsPositionReportRequest.categoryId) &&
        Objects.equals(this.dateFrom, generateCompetitorsPositionReportRequest.dateFrom) &&
        Objects.equals(this.dateTo, generateCompetitorsPositionReportRequest.dateTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, categoryId, dateFrom, dateTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateCompetitorsPositionReportRequest {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
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

