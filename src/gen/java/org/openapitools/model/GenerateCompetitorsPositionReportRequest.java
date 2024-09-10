package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;



/**
 * Данные, необходимые для генерации отчета.
 **/

@ApiModel(description = "Данные, необходимые для генерации отчета.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateCompetitorsPositionReportRequest   {
  @JsonProperty("businessId")
  private Long businessId;

  @JsonProperty("categoryId")
  private Long categoryId;

  @JsonProperty("dateFrom")
  private Date dateFrom;

  @JsonProperty("dateTo")
  private Date dateTo;

  /**
   * Идентификатор бизнеса.
   **/
  public GenerateCompetitorsPositionReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
  @JsonProperty("businessId")
  public Long getBusinessId() {
    return businessId;
  }
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
  public Long getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * Начало периода, включительно.
   **/
  public GenerateCompetitorsPositionReportRequest dateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Начало периода, включительно.")
  @JsonProperty("dateFrom")
  public Date getDateFrom() {
    return dateFrom;
  }
  public void setDateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
  }

  /**
   * Конец периода, включительно.
   **/
  public GenerateCompetitorsPositionReportRequest dateTo(Date dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Конец периода, включительно.")
  @JsonProperty("dateTo")
  public Date getDateTo() {
    return dateTo;
  }
  public void setDateTo(Date dateTo) {
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
    return Objects.equals(businessId, generateCompetitorsPositionReportRequest.businessId) &&
        Objects.equals(categoryId, generateCompetitorsPositionReportRequest.categoryId) &&
        Objects.equals(dateFrom, generateCompetitorsPositionReportRequest.dateFrom) &&
        Objects.equals(dateTo, generateCompetitorsPositionReportRequest.dateTo);
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

