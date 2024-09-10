package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Данные, необходимые для генерации отчета.
 */
@ApiModel(description="Данные, необходимые для генерации отчета.")

public class GenerateCompetitorsPositionReportRequest  {
  
 /**
  * Идентификатор бизнеса.
  */
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
  private Long businessId;

 /**
  * Идентификатор категории.
  */
  @ApiModelProperty(required = true, value = "Идентификатор категории.")
  private Long categoryId;

 /**
  * Начало периода, включительно.
  */
  @ApiModelProperty(required = true, value = "Начало периода, включительно.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate dateFrom;

 /**
  * Конец периода, включительно.
  */
  @ApiModelProperty(required = true, value = "Конец периода, включительно.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate dateTo;
 /**
  * Идентификатор бизнеса.
  * @return businessId
  */
  @JsonProperty("businessId")
  @NotNull
  public Long getBusinessId() {
    return businessId;
  }

  /**
   * Sets the <code>businessId</code> property.
   */
 public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  /**
   * Sets the <code>businessId</code> property.
   */
  public GenerateCompetitorsPositionReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

 /**
  * Идентификатор категории.
  * @return categoryId
  */
  @JsonProperty("categoryId")
  @NotNull
  public Long getCategoryId() {
    return categoryId;
  }

  /**
   * Sets the <code>categoryId</code> property.
   */
 public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * Sets the <code>categoryId</code> property.
   */
  public GenerateCompetitorsPositionReportRequest categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

 /**
  * Начало периода, включительно.
  * @return dateFrom
  */
  @JsonProperty("dateFrom")
  @NotNull
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  /**
   * Sets the <code>dateFrom</code> property.
   */
 public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  /**
   * Sets the <code>dateFrom</code> property.
   */
  public GenerateCompetitorsPositionReportRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

 /**
  * Конец периода, включительно.
  * @return dateTo
  */
  @JsonProperty("dateTo")
  @NotNull
  public LocalDate getDateTo() {
    return dateTo;
  }

  /**
   * Sets the <code>dateTo</code> property.
   */
 public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  /**
   * Sets the <code>dateTo</code> property.
   */
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

