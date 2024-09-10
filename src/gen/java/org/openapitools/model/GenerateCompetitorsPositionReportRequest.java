package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Данные, необходимые для генерации отчета.
 **/
@ApiModel(description = "Данные, необходимые для генерации отчета.")
@JsonTypeName("GenerateCompetitorsPositionReportRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateCompetitorsPositionReportRequest   {
  private Long businessId;
  private Long categoryId;
  private LocalDate dateFrom;
  private LocalDate dateTo;

  /**
   * Идентификатор бизнеса.
   **/
  public GenerateCompetitorsPositionReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
  @JsonProperty("businessId")
  @NotNull public Long getBusinessId() {
    return businessId;
  }

  @JsonProperty("businessId")
  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  /**
   * Идентификатор категории.
   **/
  public GenerateCompetitorsPositionReportRequest categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор категории.")
  @JsonProperty("categoryId")
  @NotNull public Long getCategoryId() {
    return categoryId;
  }

  @JsonProperty("categoryId")
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * Начало периода, включительно.
   **/
  public GenerateCompetitorsPositionReportRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Начало периода, включительно.")
  @JsonProperty("dateFrom")
  @NotNull public LocalDate getDateFrom() {
    return dateFrom;
  }

  @JsonProperty("dateFrom")
  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  /**
   * Конец периода, включительно.
   **/
  public GenerateCompetitorsPositionReportRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Конец периода, включительно.")
  @JsonProperty("dateTo")
  @NotNull public LocalDate getDateTo() {
    return dateTo;
  }

  @JsonProperty("dateTo")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

