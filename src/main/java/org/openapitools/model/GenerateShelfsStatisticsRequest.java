package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.model.ShelfsStatisticsAttributionType;
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

@Schema(name = "GenerateShelfsStatisticsRequest", description = "Данные, необходимые для генерации отчета. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateShelfsStatisticsRequest {

  private Long businessId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date dateFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date dateTo;

  private ShelfsStatisticsAttributionType attributionType;

  public GenerateShelfsStatisticsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenerateShelfsStatisticsRequest(Long businessId, Date dateFrom, Date dateTo, ShelfsStatisticsAttributionType attributionType) {
    this.businessId = businessId;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.attributionType = attributionType;
  }

  public GenerateShelfsStatisticsRequest businessId(Long businessId) {
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

  public GenerateShelfsStatisticsRequest dateFrom(Date dateFrom) {
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

  public GenerateShelfsStatisticsRequest dateTo(Date dateTo) {
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

  public GenerateShelfsStatisticsRequest attributionType(ShelfsStatisticsAttributionType attributionType) {
    this.attributionType = attributionType;
    return this;
  }

  /**
   * Get attributionType
   * @return attributionType
   */
  @NotNull @Valid 
  @Schema(name = "attributionType", requiredMode = Schema.RequiredMode.REQUIRED)
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

