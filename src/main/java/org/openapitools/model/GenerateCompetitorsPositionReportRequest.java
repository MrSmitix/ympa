package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Данные, необходимые для генерации отчета.
 */

@Schema(name = "GenerateCompetitorsPositionReportRequest", description = "Данные, необходимые для генерации отчета.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateCompetitorsPositionReportRequest {

  private Long businessId;

  private Long categoryId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date dateFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date dateTo;

  public GenerateCompetitorsPositionReportRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenerateCompetitorsPositionReportRequest(Long businessId, Long categoryId, Date dateFrom, Date dateTo) {
    this.businessId = businessId;
    this.categoryId = categoryId;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
  }

  public GenerateCompetitorsPositionReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  /**
   * Идентификатор бизнеса.
   * @return businessId
   */
  @NotNull 
  @Schema(name = "businessId", description = "Идентификатор бизнеса.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("businessId")
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateCompetitorsPositionReportRequest categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Идентификатор категории.
   * @return categoryId
   */
  @NotNull 
  @Schema(name = "categoryId", description = "Идентификатор категории.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public GenerateCompetitorsPositionReportRequest dateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Начало периода, включительно.
   * @return dateFrom
   */
  @NotNull @Valid 
  @Schema(name = "dateFrom", description = "Начало периода, включительно.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dateFrom")
  public Date getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GenerateCompetitorsPositionReportRequest dateTo(Date dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Конец периода, включительно.
   * @return dateTo
   */
  @NotNull @Valid 
  @Schema(name = "dateTo", description = "Конец периода, включительно.", requiredMode = Schema.RequiredMode.REQUIRED)
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

